package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PO2 extends Applet {
    int A;
    long antwoord;
    Button knop;
    int i;


    public void init() {
        A=0;
        antwoord=0;
        knop = new Button("ok");
        knop.addActionListener(new Submit());
        add(knop);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.PINK);
        g.setColor(Color.WHITE);

        for (i=1; i<=10; i++){
            antwoord = A*i;
            g.drawString("" + antwoord,100,i*20+30);
            g.drawString("1 x " + A + " =",50,50);
            g.drawString("2 x " + A + " =",50,70);
            g.drawString("3 x " + A + " =",50,90);
            g.drawString("4 x " + A + " =",50,110);
            g.drawString("5 x " + A + " =",50,130);
            g.drawString("6 x " + A + " =",50,150);
            g.drawString("7 x " + A + " =",50,170);
            g.drawString("8 x " + A+ " =",50,190);
            g.drawString("9 x " + A + " =",50,210);
            g.drawString("10 x " + A + " =",45,230);
        }
    }

    private class Submit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            i= Integer.parseInt(String.valueOf(A++));
            if ( A > 10 ) {
                A=1;
            }
            repaint();

        }
    }
}