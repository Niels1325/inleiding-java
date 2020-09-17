package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class Opdr10_3 extends Applet{

        TextField tekstvak;
        Label label;
        String s, tekst;
        int maand;

    public void init(){

        tekstvak = new TextField(50);
        tekstvak.addActionListener(new TextListener());
        add(tekstvak);

    }

    public void paint(Graphics g) {

        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);
        g.drawString( tekst, 20, 50);


    }

    class TextListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
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
            repaint();
        }
    }
}
