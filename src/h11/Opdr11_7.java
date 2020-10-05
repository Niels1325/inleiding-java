package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11_7 extends Applet {

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);

        int X = 10;
        int Y = 10;
        int H = 1000;
        int B = 1000;
        int Arcangle = 360;
        int Arcstart = 0;
        int Aantal = 0;

        while (Aantal < 50) {
            Aantal++;
            H -= 20;
            B -= 20;
            X += 10;
            Y += 10;
            g.drawArc(X,Y,B,H,Arcstart,Arcangle);
        }
    }
}