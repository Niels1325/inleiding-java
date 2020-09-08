package h04;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        //Namen
        g.setColor(Color.black);
        g.drawString("Valerie",50,260);
        g.drawString("Hans",115,260);
        g.drawString("Jeroen",170,260);


        //De verdeling
        g.setColor(Color.BLACK);
        g.drawString("0 kg",16,240);

        g.drawString("20 kg",9,220);

        g.drawString("40 kg",9,200);

        g.drawString("60 kg",9,180);

        g.drawString("80 kg",9,160);

        g.drawString("100 kg",2,140);

        g.drawString("120 kg",2,120);

        g.drawString("140 kg",2,100);

        g.drawString("160 kg",2,80);

        g.drawString("180 kg",2,60);

        g.drawString("200 kg",2,40);

        //De achtergrond rectangle
        g.setColor(Color.black);
        g.drawRect(40,40,180,200);

        //De stafen
        g.setColor(Color.blue);
        g.fillRect(40,200,60,40);

        g.setColor(Color.red);
        g.fillRect(100,160,60,80);

        g.setColor(Color.orange);
        g.fillRect(160,140,60,100);

        //De lijnen
        g.setColor(Color.BLACK);
        g.drawLine(40,60,220,60);
        g.drawLine(40,80,220,80);
        g.drawLine(40,100,220,100);
        g.drawLine(40,120,220,120);
        g.drawLine(40,140,220,140);
        g.drawLine(40,160,220,160);
        g.drawLine(40,180,220,180);
        g.drawLine(40,200,220,200);
        g.drawLine(40,220,220,220);
    }
}
