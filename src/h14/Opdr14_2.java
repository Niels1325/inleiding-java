package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
import java.util.Random;

public class Opdr14_2 extends Applet {

    String color[] = {"Hearts ", "Spades ", "Clubs ", "Diamonds "};
    String[] meaning = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String game[];
    Button share;

    boolean[] help;
    int start = 0;

    URL path;
    AudioClip applauce;

    public void init() {

        setSize(500, 300);
        path = Opdr14_2.class.getResource("/h14/resources/");
        applauce = getAudioClip(path, "applauce.wav");

        share = new Button("Share cards!");
        share.addActionListener(new VerdeelListener());
        add(share);

        game = new String[52];
        help = new boolean[52];

        for (int i = 0; i < help.length; i++) {
            help[i] = false;
        }

        for (int i = 0; i < 13; i++) {
            game[start] = color[0] + "" + meaning[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            game[start] = color[1] + "" + meaning[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            game[start] = color[2] + "" + meaning[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            game[start] = color[3] + "" + meaning[i];
            start++;
        }
    }

    public void paint(Graphics g) {
        g.drawString("Player 1",50,50);
        g.drawString("Player 2",150,50);
        g.drawString("Player 3",250,50);
        g.drawString("Player 4",350,50);

        int b = 0;
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < 13; a++) {
                g.drawString(game[b], 50 + 110 * i,70 + 12 * a);
                b++;
            }
        }
    }

    public static void Random(String[] randomize) {
        Random randomize1;

        for (int i = 0; i < randomize.length; i++) {
            randomize1 = new Random();
            int randPos = randomize1.nextInt(randomize.length);
            String tmp = randomize[i];
            randomize[i] = randomize[randPos];
            randomize[randPos] = tmp;
        }
    }

    private class VerdeelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random(game);
            repaint();
            applauce.play();
        }
    }
}