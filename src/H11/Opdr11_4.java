package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11_4 extends Applet {

    int breedte = 10;
    int getal;
    int cijfer = 0;
    int x = 10;

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);

        while(cijfer < 10) {
            x += 15;
            cijfer++;
            getal = 3 * cijfer;
            g.drawString("" + getal,x,breedte);
            breedte = breedte + 20;
        }


    }

}
