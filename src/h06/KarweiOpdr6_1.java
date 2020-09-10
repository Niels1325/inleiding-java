package h06;

import java.awt.*;
import java.applet.*;

public class KarweiOpdr6_1 extends Applet {

    int uitkomst;

    public void init() {

        uitkomst = 113/4;

    }

        public void paint(Graphics g) {
        g.drawString("Ali krijgt €" + uitkomst ,20,20);
        g.drawString("Jan krijgt €" + uitkomst ,20,40);
        g.drawString("Jeanette krijgt €" + uitkomst ,20,60);
        g.drawString("Niels krijgt €" + uitkomst ,20,80);




    }


}