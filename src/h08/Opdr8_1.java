package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr8_1 extends Applet {
    TextField tekstvak;
    Button knop, Resetknop;
    String H;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        Resetknop = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        Resetknop.addActionListener(new ResetknopListener() );
        add(tekstvak);
        add(knop);
        add(Resetknop);

    }

    public void paint(Graphics g) {

        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        g.drawString(H, 20,40);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            H = tekstvak.getText();
            repaint();
        }
    }
    class ResetknopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }
}