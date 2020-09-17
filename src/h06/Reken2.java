package h06;



import java.awt.*;
import java.applet.*;


public class Reken2 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 8;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {

        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

    }
}