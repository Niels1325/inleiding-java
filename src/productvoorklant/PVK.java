package productvoorklant;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PVK extends Applet {

    TextField tekstvak;
    Button knop;
    String s;
    Label label;
    int b;

    public void init() {
        label = new Label("Voer een getal in:");
        tekstvak = new TextField("", 30);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());

        s = "";

        add(label);
        add(tekstvak);
        add(knop);

    }


    public void paint(Graphics g) {



    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            b = Integer.parseInt( s );

            for (int i = 1; i <= b; i++) {
              //  getGraphics().drawString(s, 50, 80);

                System.out.println( i );
               // repaint();
            }
        }

    }



}
