package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class POH10 extends Applet {

        int getal;
        Button knop;
        TextField tv;
        String tekst = "";

        public void init() {

            knop = new Button("OK");
            tv = new TextField(50);
            knop.addActionListener(new knopListener());
            add(knop);
            add(tv);

        }

        public void paint(Graphics g) {

            g.setFont(new Font("default", Font.BOLD, 12));
            setBackground(Color.PINK);
            g.setColor(Color.WHITE);
            g.drawString("Het ingevoerde getal is: " + tekst, 20,80);

        }

        class knopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tv.getText();
                s = tv.getText();
                getal = Integer.parseInt( s );
                switch (getal) {
                    case 1:
                    case 2:
                    case 3:
                        tekst = "Slecht";
                        break;
                    case 4:
                    case 5:
                        tekst = "Matig";
                        break;
                    case 6:
                    case 7:
                        tekst = "Voldoende";
                        break;
                    case 8:
                    case 9:
                    case 10:
                        tekst = "Goed";
                        break;
                    default:
                        tekst = "Het ingevoerde nummer heeft geen waarde";
                        break;
                }
                repaint();
            }
        }
}
