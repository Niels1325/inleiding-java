package h11;

import java.awt.*;
import java.applet.*;

public class Opdr11_3 extends Applet {
    long[] f;


    public void init() {
        f = new long[1000];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i < 1000; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }
    }

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);


        int yPos = 20;
        for (int i = 0; i < 1000; i++) {
            g.drawString("" + f[i], 50, yPos);
            yPos += 20;
        }

    }
}