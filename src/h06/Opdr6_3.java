package h06;

import java.applet.*;
import java.awt.*;

public class Opdr6_3 extends Applet {

    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {

        a = 10;
        b = 20;
        c = -5;
        uitkomst = (a + b) /c;

    }


    public void paint(Graphics g) {
    g.drawString("De uitkomst is "  + uitkomst  ,20,40);




    }
}
