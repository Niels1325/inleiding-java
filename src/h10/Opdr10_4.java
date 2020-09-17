package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class Opdr10_4 extends Applet{

    TextField tekstvak1;
    TextField tekstvak2;
    Label label;
    String s, tekst, tekst2;
    int maand, jaartal;

    public void init(){

        tekstvak2 = new TextField(25);
        tekstvak2.addActionListener(new tekstvak2Listener());

        tekstvak1 = new TextField(25);
        tekstvak1.addActionListener(new TextListener());
        add(tekstvak1);
        add(tekstvak2);

    }

    public void paint(Graphics g) {

        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);
        g.drawString( tekst, 20, 80);
        g.drawString( tekst2, 20, 100);


    }

    class tekstvak2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            jaartal = Integer.parseInt( s );
            if ((jaartal % 4 == 0 && ! (jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = "" + jaartal + " is een schrikkeljaar";
            }
            else {
                tekst2 = jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
    class TextListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            maand = Integer.parseInt( s );
            switch (maand) {

                case 1:
                    tekst = "Januari, 31 dagen";
                    break;

                case 2:
                    tekst = "Februari, 29 dagen";
                    break;

                case 3:
                    tekst = "Maart, 31 dagen";
                    break;

                case 4:
                    tekst = "April, 30 dagen";
                    break;

                case 5:
                    tekst = "Mei, 31 dagen";
                    break;

                case 6:
                    tekst = "Juni, 30 dagen";
                    break;

                case 7:
                    tekst = "Juli, 31 dagen";
                    break;

                case 8:
                    tekst = "Augustus, 31 dagen";
                    break;

                case 9:
                    tekst = "September, 30 dagen";
                    break;

                case 10:
                    tekst = "Oktober, 31 dagen";
                    break;

                case 11:
                    tekst = "November, 30 dagen";
                    break;

                case 12:
                    tekst = "December, 31 dagen";
                    break;

                default:
                    tekst = "Het nummer dat u heeft ingevuld heeft geen waarde tot maanden";
                    break;
            }
            if (maand == 2 && (jaartal % 4 == 0 && ! (jaartal % 100 == 0)) ||
                    jaartal % 400 == 0  )
                tekst = "Februari 29 dagen";
            repaint();
        }
    }
}
