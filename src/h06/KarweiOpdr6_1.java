package h06;

import java.awt.*;
import java.applet.*;

public class KarweiOpdr6_1 extends Applet {

    int uitkomst;

    public void init() {

        uitkomst = 133/4;

    }

        public void paint(Graphics g) {
        g.drawString("Iedereen krijgt €" + uitkomst ,20,20);




    }


}