/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.minds;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author LB
 */
public class Score extends JFrame implements ActionListener {
    JButton b1;
    public Score(String userName, int Score) {
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(10, 10, 300, 250);
        add(l1);

        JLabel l2 = new JLabel("Thank you " + userName + " for Simples Minds");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
        l2.setBounds(0, 300, 750, 20);
        add(l2);

        JLabel l3 = new JLabel("Your Score is: " + Score);
        l3.setFont(new Font("Viner Hand ITC", Font.BOLD, 24));
        l3.setBounds(350, 200, 200, 30);
        l3.setForeground(Color.RED);
        add(l3);

        b1 = new JButton("Play Again");
        b1.setBackground(new Color(255, 69, 0));
        b1.setForeground(Color.WHITE);
        b1.setBounds(380, 270, 120, 40);
        add(b1);
        b1.addActionListener(this);

    }

    public static void main(String[] args) {
        new Score("", 0).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }

    }

}
