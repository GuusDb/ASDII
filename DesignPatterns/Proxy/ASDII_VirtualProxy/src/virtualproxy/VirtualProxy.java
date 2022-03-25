package virtualproxy;

import domein.ImageComponent;
import domein.ImageProxy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VirtualProxy {

    private ImageComponent imageComponent;
    private JFrame frame = new JFrame("CD Cover Viewer");
    private JMenuBar menuBar;
    private JMenu menu;
    private Map<String, String> cds;

    public static void main(String[] args) throws Exception {
        new VirtualProxy();
    }

    public VirtualProxy() throws Exception {
        cds = new HashMap<>();
        cds.put("Ambient: Music for Airports", "http://ecx.images-amazon.com/images/I/41FNZAYSMML.jpg");
        cds.put("Buddha Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima", "http://g-ecx.images-amazon.com/images/G/01/ciu/0c/9a/0328793509a04478b6886110.L._SY300_.jpg");
        cds.put("Karma", "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        cds.put("MCMXC A.D.", "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure", "http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2", "http://ecx.images-amazon.com/images/I/51V0KZR79EL._SY300__PJautoripBadge,BottomRight,4,-40_OU11__.jpg");

        URL initialURL = new URL((String) cds.get("Selected Ambient Works, Vol. 2"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (String cdTitle : cds.keySet()) {
            JMenuItem menuItem = new JMenuItem(cdTitle);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        // set up frame and menus
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

    }

    URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
