package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11_1 extends Applet {

    int eind = 10;
    int loc, loc2, loc3, loc4;

    public void init() {

        loc = 20;
        loc2 = 20;
        loc3 = 20;
        loc4 = 90;

    }

    public void paint(Graphics g) {
        for(int i = 0; i < eind; i++) {
            g.drawLine(loc, loc2, loc3, loc4);
            loc = loc + 20;
            loc3 = loc3 + 20;
        }
    }

}
