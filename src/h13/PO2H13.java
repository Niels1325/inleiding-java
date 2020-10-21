package h13;

import java.awt.*;
import java.applet.*;

public class PO2H13 extends Applet {

    public void init() {
        setSize(1920,1080);
    }

    public void paint(Graphics g) {
        drawTree(g, 160);
    }

    void drawTree(Graphics g, int h) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        for (int i = 0; i < 2; i++) {
            for (int a = 0; a < 5; a++) {
                if (h < 80 * 1.6) {
                    h = 80 / 10 * 16;
                }
                g.setColor(new Color(110, 44, 31));
                g.fillRect(50 + (80 / 5 * 2) + a * (80 + 10), 50 + (80 / 10 * 9) + i * (h + 20), 80 / 5, h - (80 / 10 * 9));
                g.setColor(new Color(50, 205, 76));
                g.fillOval(50 + a * (80 + 10), 50 + i * (h + 20), 80, 80);
            }
        }
    }
}
