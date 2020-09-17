package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH8 extends Applet {

    Button Keerknop, Gedeeldknop, Plusknop, Minknop;
    TextField tekstvak1, tekstvak2;
    String s;
    String b;
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
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);



    }

    class KeerknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            String b = tekstvak2.getText();
            getal = Double.parseDouble( s );
            keer = Double.parseDouble( b );
            getal = getal*keer;
            tekstvak1.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }
    }

    class GedeeldknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            String b = tekstvak2.getText();
            getal = Double.parseDouble( s );
            gedeeld = Double.parseDouble( b );
            getal = getal/gedeeld;
            tekstvak1.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }
    }

    class PlusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            String b = tekstvak2.getText();
            getal = Double.parseDouble( s );
            plus = Double.parseDouble( b );
            getal = getal+plus;
            tekstvak1.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }
    }

    class MinknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            String b = tekstvak2.getText();
            getal = Double.parseDouble( s );
            min = Double.parseDouble( b );
            getal = getal-min;
            tekstvak1.setText("" + getal);
            tekstvak2.setText("");
            repaint();
        }
    }

}