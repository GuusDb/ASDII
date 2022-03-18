package persistentie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.tree.DefaultMutableTreeNode;

import domein.ApplicatieFout;
import domein.EnumerationIterator;
import domein.MenuActie;
import javax.swing.tree.TreeNode;

public class PersistentieBeheerder {

    private static PersistentieBeheerder instance;

    private PersistentieBeheerder() {
    }

    static public PersistentieBeheerder getInstance() {
        if (instance == null) {
            instance = new PersistentieBeheerder();
        }
        return instance;
    }

    public DefaultMutableTreeNode geefMenus() {
        final String INNAAM = "menu.txt";
        Scanner input;

        MenuActie menuRootActie = new MenuActie("root", "root", 0, 0);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(menuRootActie);

        try {
            input = new Scanner(new FileInputStream(INNAAM));
            while (input.hasNext()) {
                int nummerOuder = input.nextInt();
                int nummerKind = input.nextInt();
                String methodeNaam = input.next();
                String menuItemNaam = input.nextLine();
                MenuActie menuActie
                        = new MenuActie(methodeNaam, menuItemNaam,
                                nummerOuder, nummerKind);
                DefaultMutableTreeNode node
                        = new DefaultMutableTreeNode(
                                menuActie);
                voegToeAanOuder(root, node);
            }
            input.close();
        } catch (FileNotFoundException fe) {
            System.err.printf("Fout: kan <%s> niet openen.\n", INNAAM);
            System.exit(1);
        }

        return root;
    }

    @SuppressWarnings("unchecked")
    private void voegToeAanOuder(DefaultMutableTreeNode root,
            DefaultMutableTreeNode kind) {
        boolean gevonden = false;
        Enumeration<TreeNode> enumeration
                = root.depthFirstEnumeration();

        //TODO Instantieer adaptor
        
        int ouder = ((MenuActie) kind.getUserObject()).getOuder();
        //while (enumeration.hasMoreElements() && !gevonden) 
        while ( && !gevonden) {   //TODO gebruik adaptor  

            //DefaultMutableTreeNode node = enumeration.nextElement();
            DefaultMutableTreeNode node = ; //TODO gebruik adaptor

            MenuActie menuActie = (MenuActie) node.getUserObject();

            if (menuActie.getMenuActieId() == ouder) {
                node.add(kind);
                gevonden = true;
            }
        }
        if (!gevonden) {
            new ApplicatieFout(String.format("node %d vindt ouder %d niet",
                    ((MenuActie) kind.getUserObject()).getMenuActieId(), ouder));
        }
    }
}
