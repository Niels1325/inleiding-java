package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11_2 extends Applet {

    int getal, breedte, eind;

    public void init() {

    getal = 10;
    breedte = 20;
    eind = 20;

    }


    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);
        for(int i = 10; i < eind; i++) {

            g.drawString("" + getal, breedte, 60 );
            getal = getal + 1;
            breedte = breedte + 20;
        }

    }

}
