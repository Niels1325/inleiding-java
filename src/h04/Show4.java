package h04;

import java.awt.*;
import java.applet.*;

public class Show4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        //Gelijkbenige driehoek
        g.setColor(Color.blue);
        g.drawLine(20,20,60,70);
        g.drawLine(60,70,100,20);
        g.drawLine(20,20, 100,20);

        //Huis
        g.drawLine(200,150,300,150);
        g.drawLine(190,50,310,50);
        g.drawLine(190,50,250,20);
        g.drawLine(310,50,250,20);
        g.drawLine(200,150,200,50);
        g.drawLine(300,150,300,50);

        //Deur van het huis
        g.drawLine(240,150,240,120);
        g.drawLine(260,150,260,120);
        g.drawLine(240,120,260,120);

        //Linker raam van het huis
        g.drawLine(220,90,240,90);
        g.drawLine(220,70,240,70);
        g.drawLine(220,90,220,70);
        g.drawLine(240,90,240,70);
        g.drawLine(230,90,230,70);
        g.drawLine(220,80,240,80);

        //Rechter raam van het huis
        g.drawLine(260,90,280,90);
        g.drawLine(260,70,280,70);
        g.drawLine(260,90,260,70);
        g.drawLine(280,90,280,70);
        g.drawLine(270,90,270,70);
        g.drawLine(260,80,280,80);

    }
}