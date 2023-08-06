package wackAMole;

import javax.swing.*;
import java.awt.*;

public class App {
    
    public static void main(String[] args) {
        App a = new App();
    }

    JFrame f;
    JPanel hPanel;
    JPanel bPanel;
    JPanel x;

    App(){
        f = new JFrame();
        hPanel = new JPanel();
        bPanel = new JPanel();
        x = new  JPanel();


        JButton b1 = new JButton("1");
        JButton b2 = new JButton("1");
        JButton b3 = new JButton("1");
        JButton b4 = new JButton("1");
        JButton b5 = new JButton("1");
        JButton b6 = new JButton("1");
        JButton b7 = new JButton("1");
        JButton b8 = new JButton("1");
        JButton b9 = new JButton("1");

        bPanel.add(b1);
        bPanel.add(b2);
        bPanel.add(b3);
        bPanel.add(b4);
        bPanel.add(b5);
        bPanel.add(b6);
        bPanel.add(b7);
        bPanel.add(b8);
        bPanel.add(b9);
        f.add(hPanel);
        x.add(bPanel);
        f.add(x);

        hPanel.setPreferredSize(new Dimension(1280,140));
        bPanel.setPreferredSize(new Dimension(600,500));
        bPanel.setLayout(new GridLayout(3,3,100,20));

        hPanel.setBackground(Color.BLUE);
        f.setSize(1280, 720);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
