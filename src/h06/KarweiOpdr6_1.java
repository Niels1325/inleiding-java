package h06;

import java.awt.*;
import java.applet.*;

public class KarweiOpdr6_1 extends Applet {

    double a, b, uitkomst;

    public void init() {

        a = 113;
        b = 4;
        uitkomst = a/b;

    }

        public void paint(Graphics g) {

            g.setFont(new Font("default", Font.BOLD, 12));
            setBackground(Color.PINK);
            g.setColor(Color.WHITE);
            g.drawString("Ali krijgt €" + uitkomst ,20,20);
            g.drawString("Jan krijgt €" + uitkomst ,20,40);
            g.drawString("Jeanette krijgt €" + uitkomst ,20,60);
            g.drawString("Niels krijgt €" + uitkomst ,20,80);




    }


}