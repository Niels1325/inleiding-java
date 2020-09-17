package h06;



import java.awt.*;
import java.applet.*;


public class Teller extends Applet {
    int teller;

    public void init() {
        teller = 0;
    }

    public void paint(Graphics g) {

        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);
        teller++;
        g.drawString("Scherm is " + teller +
                " keer ververst.", 50, 60 );
    }
}