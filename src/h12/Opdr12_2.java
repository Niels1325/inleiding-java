package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdr12_2 extends Applet {

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);

        for(int i = 0; i <= 24; i++) {
            Button knop;
            knop = new Button("Knop");
            add(knop);
        }
    }
}
