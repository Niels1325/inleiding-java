package h04;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        g.fillRoundRect(20,20,200,200,20,20);

        g.setColor(Color.black);
        g.fillArc(40,40,60,60,0,360);
        g.fillArc(140,40,60,60,0,360);
        g.fillArc(40,140,60,60,0,360);
        g.fillArc(140,140,60,60,0,360);

    }
}