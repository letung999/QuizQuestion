/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.minds;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleMinds extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField t1;

    public SimpleMinds() {
        setBounds(100, 100, 1200, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icon/time.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 600, 600);
        add(l1);

        JLabel l2 = new JLabel("Simple Minds");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(750, 40, 300, 45);
        add(l2);

        JLabel l3 = new JLabel("your name");
        l3.setFont(new Font("Mogolian Baiti", Font.BOLD, 18));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(820, 140, 300, 20);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Mogolian Baiti", Font.BOLD, 14));
        t1.setBounds(730, 180, 300, 30);
        add(t1);

        b1 = new JButton("Rules");
        b1.setBounds(730, 270, 120, 30);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Exits");
        b2.setBounds(913, 270, 120, 30);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);

    }

    public static void main(String[] args) {
        new SimpleMinds();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String name = t1.getText();
            setVisible(false);
            new Rules(name);
        }
        if(e.getSource() == b2){
            System.exit(0);
        }
    }

}
