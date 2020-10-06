package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Opdr12_3 extends Applet {

    TextField input[] = new TextField[5];
    Button submit;

    int cijfers[] = new int[5];

    public void init() {

        setSize(600,100);
        for(int i=0; i!=5; i++){
            input[i] = new TextField("",10);
            add(input[i]);
        }
        submit = new Button("Submit");
        submit.addActionListener(new calc());
        add(submit);

    }


    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 12));
        setBackground(Color.black);
        g.setColor(Color.WHITE);

    }

    class calc implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for(int i=0; i!=5; i++){
                cijfers[i] = Integer.parseInt(input[i].getText());
            }
            Arrays.sort(cijfers);
            for(int i=0; i!=5; i++){
                input[i].setText(String.valueOf(cijfers[i]));
            }
        }
    }
}