package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr8_3 extends Applet {

    TextField tekstvak;
    Button knop;
    String H;
    double getal, a, uitkomst;


    public void init() {

        tekstvak = new TextField("Bereken BTW", 30);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
        a = 0.21;
        uitkomst = getal * a;


    }

    public void paint(Graphics g) {

        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);
        g.drawString("De BTW is: " + getal, 20 , 40);

    }

        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                H = tekstvak.getText();
                getal = Double.parseDouble( H );
                getal = getal*a+getal;
                repaint();
            }
        }

}
