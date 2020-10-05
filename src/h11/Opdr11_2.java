package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11_2 extends Applet {

    int getal, breedte, eind;

    public void init() {

    getal = 10;
    eind = 19;

    }


    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);

        for(int i = getal; i <= eind; i++) {
            g.drawString("" + i,i*15,20);
        }

    }

}
