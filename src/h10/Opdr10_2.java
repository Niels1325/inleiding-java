package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdr10_2 extends Applet {

    int cijfer, uitkomst, seconduitkomst;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField( 50);
        tekstvak.addActionListener( new VakListener() );
        add( tekstvak );
        uitkomst = 0;



    }

    public void paint(Graphics g) {

        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);
        g.drawString(String.valueOf(uitkomst), 200, 45 );
        g.drawString(String.valueOf(seconduitkomst), 200, 60 );

    }


    class VakListener implements ActionListener {
        @Override
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt( s );
            if ( cijfer > uitkomst ) {
                uitkomst = cijfer;
            }
            if (seconduitkomst == 0) seconduitkomst = cijfer;
            if (seconduitkomst > cijfer) seconduitkomst = cijfer;
            repaint();
        }
    }
}