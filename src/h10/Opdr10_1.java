package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdr10_1 extends Applet {

    int cijfer;
    TextField tekstvak;
    int uitkomst;

    public void init() {
        tekstvak = new TextField( 5);
        tekstvak.addActionListener( new VakListener() );
        add( tekstvak );
        uitkomst = 0;



    }

    public void paint(Graphics g) { g.drawString(String.valueOf(uitkomst), 50, 45 ); }

    class VakListener implements ActionListener {
        @Override
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt( s );
            if ( cijfer > uitkomst ) {
                uitkomst = cijfer;
            }
            repaint();
        }
    }
}