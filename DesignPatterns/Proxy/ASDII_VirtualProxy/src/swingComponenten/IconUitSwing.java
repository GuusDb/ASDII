package swingComponenten;



import java.awt.Component;
import java.awt.Graphics;

public interface IconUitSwing {

    int getIconWidth();

    int getIconHeight();

    void paintIcon(final Component c, Graphics g, int x, int y);
}