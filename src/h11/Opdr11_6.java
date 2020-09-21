package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11_6 extends Applet {


    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);

        int X = 50;
        int Y = 50;
        int H = 100;
        int B = 100;
        int Arcangle = 360;
        int Arcstart = 0;
        int Aantal = 0;
        while (Aantal < 5) {
            Aantal++;
            H -= 20;
            B -= 20;
            X += 10;
            Y += 10;
            g.drawArc(X,Y,B,H,Arcstart,Arcangle);
        }
    }
}