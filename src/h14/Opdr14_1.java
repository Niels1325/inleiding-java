package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr14_1 extends Applet {

    double side1 = Math.random() * 12;
    double side2 = Math.random() * 3;

    String[] color = {"Hearts ", "Spades ", "Clubs ", "Diamonds "};
    String[] meaning = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String choise = "";
    Button chosencard = new Button("Press the button to get your card");

    public void init() {

        chosencard.addActionListener(new ChooseListener());
        add(chosencard);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        g.drawString(choise,
                50,
                50);
    }


    private class ChooseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            side1 = Math.random() * 12;
            int r1 = (int) side1;
            side2 = Math.random() * 3;
            int r2 = (int) side2;

            choise = color[r2] + "" + meaning[r1];

            repaint();
        }
    }
}
