package h04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.BLACK);
        g.fillRect(20,20,100,200);

        g.setColor(Color.red);
        g.fillArc(40,30,60,60,0,360);
        g.setColor(Color.orange);
        g.fillArc(40,92,60,60,0,360);
        g.setColor(Color.green);
        g.fillArc(40,154,60,60,0,360);

    }
}
