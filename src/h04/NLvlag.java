package h04;

import java.awt.*;
import java.applet.*;

public class NLvlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.red);
        g.fillRect(20,20,300,50);

        g.setColor(Color.white);
        g.fillRect(20,70,300,50);

        g.setColor(Color.blue);
        g.fillRect(20,120,300,50);

        g.setColor(Color.BLACK);
        g.fillRect(20,170,20,120);


    }
}
