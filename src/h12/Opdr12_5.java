package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr12_5 extends Applet {

    int[] getallen = {10, 25, 70, 105, 130, 150, 195, 199, 225, 230, 244,};
    Label tekst = new Label("Voer een getal tussen 1-250 in, geen decimalen toegestaan!");
    TextField input = new TextField("",20);
    Button enter = new Button("OK");

    int nummer;
    boolean controle = false;

    public void init() {
        enter.addActionListener(new EnterListener());
        add(tekst);
        add(input);
        add(enter);
    }

    public void paint(Graphics g) {
        if (controle) {
            g.drawString("Het getal staat in de array",50,75);
        } else {
            g.drawString("Het getal staat niet in de array",50,75);
        }
    }

    class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            controle = false;
            nummer = Integer.parseInt(input.getText());

            for (int j : getallen) {
                if (nummer == j) {
                    controle = true;
                    break;
                }
            }
            repaint();
        }
    }
}