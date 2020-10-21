package h13;

import java.awt.*;
import java.applet.*;

public class PO1H13 extends Applet {

    public void init() {
    setSize(1920,1080);
    }

    public void paint(Graphics g) {
        drawTree(g, 500);
    }

    void drawTree(Graphics g, int h) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        if (h < 200 * 1.6) {
            h = 200 /10*16;
        }

        g.setColor(new Color(110, 44, 31));
        g.fillRect(50 + (200 / 5 * 2), 50 + (200 / 10 * 9), 200 / 5, h - (200 / 10 * 9));
        g.setColor(new Color(50, 205, 76));
        g.fillOval(50, 50, 200, 200);
    }
}