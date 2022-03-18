package test;

import java.util.Enumeration;
import java.util.Iterator;
import domein.MenuActie;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.EnumerationIterator;
import persistentie.PersistentieBeheerder;

public class PersistentieTest {

    @Test
    public void lezenBestand() {
        DefaultMutableTreeNode root
                = PersistentieBeheerder.getInstance().geefMenus();
        Assertions.assertNotNull(root);

        Enumeration<TreeNode> enumeration
                = root.children();

        Iterator<TreeNode> it
                = new EnumerationIterator<>(enumeration);

        Assertions.assertEquals(3, root.getChildCount());

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) it.next();

        Assertions.assertEquals("Bestand", ((MenuActie) node.getUserObject()).getOmschrijving().trim());
        Enumeration<TreeNode> kinderen = node.children();

        Iterator<TreeNode> itKinderen
                = new EnumerationIterator<>(kinderen);

        Assertions.assertEquals(3, node.getChildCount());
        DefaultMutableTreeNode nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assertions.assertEquals("Opslaan", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assertions.assertEquals("Opslaan als", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assertions.assertEquals("Afsluiten", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());

        node = (DefaultMutableTreeNode) it.next();
        Assertions.assertEquals("Bewerken", ((MenuActie) node.getUserObject()).getOmschrijving().trim());

        kinderen = node.children();

        itKinderen
                = new EnumerationIterator<>(kinderen);

        Assertions.assertEquals(2, node.getChildCount());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assertions.assertEquals("Ongedaan maken", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assertions.assertEquals("Plakken", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        kinderen = nodeKind.children();

        itKinderen
                = new EnumerationIterator<>(kinderen);

        Assertions.assertEquals(2, nodeKind.getChildCount());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assertions.assertEquals("Plakken normaal", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assertions.assertEquals("Plakken speciaal", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());

        node = (DefaultMutableTreeNode) it.next();
        Assertions.assertEquals("Help", ((MenuActie) node.getUserObject()).getOmschrijving().trim());
        kinderen = node.children();

        itKinderen = new EnumerationIterator<>(kinderen);
        Assertions.assertEquals(1, node.getChildCount());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assertions.assertEquals("Info", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
    }
}
