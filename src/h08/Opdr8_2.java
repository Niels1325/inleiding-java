package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr8_2 extends Applet{

    Button knopVrouw;
    Button knopMan;
    Button knopPotVrouw;
    Button knopPotMan;
    int TotaalAantal, VrouwAantal, ManAantal, PotVrouwAantal, PotManAantal;


    public void init() {

    knopVrouw = new Button("+1 Vrouw");
    knopMan = new Button("+1 Man");
    knopPotVrouw = new Button("+1 Potentiële Vrouw");
    knopPotMan = new Button("+1 Potentiële Man");

    knopVrouw.addActionListener( new knopVrouwListener() );
    knopMan.addActionListener( new knopManListener() );
    knopPotVrouw.addActionListener( new knopPotVrouwListener() );
    knopPotMan.addActionListener( new knopPotManListener() );

    TotaalAantal = 0;
    VrouwAantal = 0;
    ManAantal = 0;
    PotVrouwAantal = 0;
    PotManAantal = 0;

    add(knopVrouw);
    add(knopMan);
    add(knopPotVrouw);
    add(knopPotMan);

    }

    public void paint(Graphics g) {

        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        g.drawString("Aantal: " + VrouwAantal, 20,40);
        g.drawString("Aantal: " + ManAantal,90,40);
        g.drawString("Aantal: " + PotVrouwAantal,150,40);
        g.drawString("Aantal: " + PotManAantal,280,40);

        g.drawString("Totaal: " + TotaalAantal, 20, 80);



    }

    class knopVrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            VrouwAantal ++;
            TotaalAantal ++;
            repaint();
        }
    }

        class knopManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ManAantal ++;
            TotaalAantal ++;
            repaint();
        }
    }

        class knopPotVrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotVrouwAantal ++;
            TotaalAantal ++;
            repaint();
        }
    }

        class knopPotManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotManAantal ++;
            TotaalAantal ++;
            repaint();
        }
    }


}
