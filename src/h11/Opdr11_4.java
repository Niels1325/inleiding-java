package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11_4 extends Applet {



    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);

        int breedte = 10;
        int getal;
        int cijfer = 0;
        int x = 10;
        while(cijfer < 10) {
            x += 15;
            cijfer++;
            getal = 3 * cijfer;
            g.drawString("" + getal,x,breedte);
            breedte = breedte + 20;
        }


    }

}
