package h02;

import java.awt.*;
import java.applet.*;

public class Show2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("NeLLo", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Kloosterman", 50, 80 );
    }
}