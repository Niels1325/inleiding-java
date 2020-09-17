package h06;

import java.awt.*;
import java.applet.*;

public class praktijkOpdrH6 extends Applet {

    double a, b, c;
    double uitkomst;
    int GemiddeldeUitkomst;
    double DefinitiveUitkomst;

    public void init() {

        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c) / 3;
        GemiddeldeUitkomst = (int) (uitkomst * 10.0);
        DefinitiveUitkomst = GemiddeldeUitkomst / 10.0;
    }



    public void paint(Graphics g) {

        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);
        g.drawString("Het gemiddelde is: " + DefinitiveUitkomst,20,20);






    }
}
