package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr12_6 extends Applet {

    int[] getallen = {5, 1, 8, 4, 1, 5, 2, 8, 3, 7, 5, 4, 1, 6, 9, 7, 1, 1, 10, 2, 5, 10, 10, 1, 5, 10, 3, 5, 2, 5, 2};
    Label tekst = new Label("Voer een getal tussen de 1-10 in");
    TextField tekstvak = new TextField("",20);
    Button enter = new Button("OK");

    int nummer = 0;
    int voorkomen = 0;

    public void init() {

        enter.addActionListener(new EnterListener());
        add(tekst);
        add(tekstvak);
        add(enter);
    }

    public void paint(Graphics g) {
        g.drawString("Het ingevulde getal komt "+ voorkomen +" keer voor in de array",50,75);
    }

    class EnterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            voorkomen = 0;
            nummer = Integer.parseInt(tekstvak.getText());
            for (int j : getallen) {
                if (nummer == j) {
                    voorkomen++;
                }
            }
            repaint();
        }
    }

}