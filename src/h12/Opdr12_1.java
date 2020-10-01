package h12;

import java.applet.*;
import java.awt.*;

public class Opdr12_1 extends Applet {

    double[] Gemiddelde;
    double Uitkomst;
    double A;
    double B;
    double C;
    double D;
    double E;
    double F;
    double G;
    double H;
    double I;
    double J;


    public void init() {

        A = 6;
        B = 4.3;
        C = 8;
        D = 9.9;
        E = 3.3;
        F = 8;
        G = 8.6;
        H = 7.6;
        I = 6.9;
        J = 10;

        Gemiddelde = new double[11];
        Uitkomst = (A + B + C + D + E + F + G + H + I + J) / 10;

        Gemiddelde[0] = A;
        Gemiddelde[1] = B;
        Gemiddelde[2] = C;
        Gemiddelde[3] = D;
        Gemiddelde[4] = E;
        Gemiddelde[5] = F;
        Gemiddelde[6] = G;
        Gemiddelde[7] = H;
        Gemiddelde[8] = I;
        Gemiddelde[9] = J;
        Gemiddelde[10] = Uitkomst;

        for (int teller = 0; teller < Gemiddelde.length; teller++) {
        }
    }

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);
        g.drawLine(100,205,230,205);

        for (int teller = 0; teller < Gemiddelde.length; teller++) {
            g.drawString("" + Gemiddelde[teller],200,20 * teller + 20);
        }
        g.drawString("Het gemiddelde:   ",100,220);
    }
}