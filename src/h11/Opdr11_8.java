package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11_8 extends Applet {

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);

        int X = 50;
        int Y = 50;
        int H = 100;
        int B = 100;
        int Arcangle = 360;
        int Arcstart = 0;
        int Aantal = 0;

        while (Aantal < 100) {
            Aantal++;
            H += 1;
            B += 1;
            g.drawArc(X,Y,B,H,Arcstart,Arcangle);
        }
    }
}