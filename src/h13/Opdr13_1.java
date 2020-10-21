package h13;

import java.applet.*;
import java.awt.*;

public class Opdr13_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        drawTriangle(g, 100, 100, 200, 100, 150, 300);
    }

    void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
        g.drawLine(x1, y1, x2, y2);

    }
}