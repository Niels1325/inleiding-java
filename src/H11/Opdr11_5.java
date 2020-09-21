package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdr11_5 extends Applet {
    int Aantal = 0;
    int X = 10;
    int Y = 10;
    int B = 40;
    int H = 40;

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);


        while (Aantal < 5) {
            Aantal++;
            X += 40;
            Y += 40;
            g.drawRect(X,Y,B,H);
        }
    }
}