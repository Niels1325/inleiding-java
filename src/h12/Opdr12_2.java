package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdr12_2 extends Applet {

    public void paint(Graphics g) {
        for(int i = 0; i <= 24; i++) {
            Button knop;
            knop = new Button("Knop");
            add(knop);
        }
    }
}
