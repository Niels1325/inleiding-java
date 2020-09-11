package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH8 extends Applet {

    Button Keerknop, Gedeeldknop, Plusknop, Minknop;
    TextField tekstvak1, tekstvak2;
    String H;
    double getal, keer, gedeeld, plus, min;

    public void init() {
        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        Keerknop = new Button("*");
        Gedeeldknop = new Button("/");
        Plusknop = new Button("+");
        Minknop = new Button("-");

        Keerknop.addActionListener( new KeerknopListener() );
        Gedeeldknop.addActionListener( new GedeeldknopListener() );
        Plusknop.addActionListener( new PlusknopListener() );
        Minknop.addActionListener( new MinknopListener() );

        add(tekstvak1);
        add(tekstvak2);
        add(Keerknop);
        add(Gedeeldknop);
        add(Plusknop);
        add(Minknop);

    }

    public void paint(Graphics g) {



    }

    class KeerknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            H = tekstvak1.getText();
            tekstvak2.setText("");
            repaint();
        }
    }

    class GedeeldknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            H = tekstvak1.getText();
            tekstvak2.setText("");
            repaint();
        }
    }

    class PlusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            H = tekstvak1.getText();
            tekstvak2.setText("");
            repaint();
        }
    }

    class MinknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            H = tekstvak1.getText();
            tekstvak2.setText("");
            repaint();
        }
    }

}