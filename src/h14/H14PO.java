package h14;

import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H14PO extends Applet {

    Image disk;
    URL path;
    Button play;
    Button reset;
    TextField tf;

    int disks = 23;
    boolean turn = true;
    boolean gameover = false;
    boolean lost = false;

    String text1;

    {
        text1 = "";
    }

    String text2;

    {
        text2 = "Use 1, 2 or 3 and press play!";
    }

    public void init() {

        setSize(500,500);

        text1 = text2;
        path = H14PO.class.getResource("/h14/resources/");
        disk = getImage(path, "mscdsk.png");

        play = new Button("Play");
        reset = new Button("Reset");
        tf = new TextField("",30);
        play.addActionListener(new playListener());
        reset.addActionListener(new resetListener());
        add(tf);
        add(play);
        add(reset);

    }

    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        g.drawString(text1,70,50);
        for (int i = 0; i < disks; i++) {
            g.drawImage(disk, 100 + 50 * (i % 4), 100 + 50 * (i / 4), 75, 75, this);
        }
    }

    int botPlays(int userplay, int smileys) {
        int botplays = 0;
        double random = Math.random() * 3 + 1;
        int r = (int)random;

        if(smileys == 23) {
            switch(userplay) {
                case 1:
                    botplays = 1;
                    break;
                case 2:
                    botplays = r;
                    break;
                case 3:
                    botplays = 3;
                    break;
            }


        }else if(smileys == 21 || smileys == 17 || smileys == 13 || smileys == 9|| smileys == 5) {
            switch(userplay) {
                case 1:
                    botplays = 3;
                    break;
                case 2:
                    botplays = 2;
                    break;
                case 3:
                    botplays = 1;
                    break;
            }
        }else if(smileys == 20 || smileys == 16 || smileys == 12 || smileys == 8|| smileys == 4){
            switch(userplay) {
                case 1:
                    botplays = 2;
                    break;
                case 2:
                    botplays = 1;
                    break;
                case 3:
                    botplays = r;
                    break;
            }
        }else if(smileys == 19 || smileys == 15 || smileys == 11 || smileys == 7|| smileys == 3){
            switch(userplay) {
                case 1:
                    botplays = 1;
                    break;
                case 2:
                    botplays = r;
                    break;
                case 3:
                    botplays = 3;
                    break;
            }
        }else if(smileys == 18 || smileys == 14 || smileys == 10 || smileys == 6|| smileys == 2){
            switch(userplay) {
                case 1:
                    botplays = r;
                    break;
                case 2:
                    botplays = 3;
                    break;
                case 3:
                    botplays = 2;
                    break;
            }
        }else {
            botplays =r;
        }

        return botplays;
    }


    class playListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int userplay = 0;
            int bot = 0;
            if(Integer.parseInt(tf.getText()) == 1 || Integer.parseInt(tf.getText()) == 2 || Integer.parseInt(tf.getText()) ==3) {
                userplay = Integer.parseInt(tf.getText());
                bot = botPlays(userplay, disks);

                turn = true;
                disks -=userplay;
                if(disks <= 0 && !gameover) {
                    lost = true;
                    gameover = true;
                }



                turn = false;
                disks -=bot;
                if(disks <= 0 && !gameover) {
                    lost = false;
                    gameover = true;
                }

                text1 = "The CPU chose to delete " + bot + " disks.";

            }else {
                text1 = "Error: Enter a numnber that is in between 1-3!";
                repaint();
            }



            if(gameover) {
                if(!lost) {
                    text1 = "You Are A Winner!";
                }else {
                    text1 = "Too Bad You Lost, Better Luck Next Time!";
                }
            }


            tf.setText("");
            repaint();
        }
    }

    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tf.setText("");
            text1 = text2;
            disks = 23;
            lost = false;
            gameover = false;
            turn = true;
            repaint();
        }
    }
}