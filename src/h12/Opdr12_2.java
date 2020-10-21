package h12;

import java.applet.*;
import java.awt.*;

public class Opdr12_2 extends Applet {

    Button Buttons[] = new Button[25];

    public void init() {
        for (int i = 0; i != 25; i++) {
            Buttons[i] = new Button("Knop " + String.valueOf(i + 1));
            add(Buttons[i]);
        }
    }

        public void paint(Graphics g) {
            g.setFont(new Font("default", Font.BOLD, 12));
            setBackground(Color.black);
            g.setColor(Color.WHITE);
        }

}