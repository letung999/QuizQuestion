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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author LB
 */
public class Rules extends JFrame implements ActionListener {

    JButton b1, b2;
    String userName;
    public Rules(String userName) {
        this.userName = userName;
        setBounds(300, 60, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);

        JLabel l1 = new JLabel("welcome " + userName + " to Simple Minds");
        l1.setBounds(50, 20, 700, 30);
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 29));
        l1.setForeground(new Color(255, 69, 0));
        add(l1);

        JLabel l2 = new JLabel();
        l2.setBounds(20, 30, 600, 600);
        l2.setForeground(new Color(30, 144, 254));
        l2.setFont(new Font("viner Hand ITC", Font.PLAIN, 16));
        l2.setText("<html>"
                + "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>"
                + "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>"
                + "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>"
                + "4. Crying is allowed but please do so quietly." + "<br><br>"
                + "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>"
                + "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>"
                + "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>"
                + "8. May you know more than what John Snow knows, Good Luck" + "<br><br>"
                + "<html>");
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(200, 550, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(440, 550, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Rules("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setVisible(false);
            new SimpleMinds().setVisible(true);

        } else {
            if (e.getSource() == b2) {
                new Quiz(userName).setVisible(true);
            }
        }
    }

}
