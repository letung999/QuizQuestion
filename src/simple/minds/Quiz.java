/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.minds;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author LB
 */
public class Quiz extends JFrame implements ActionListener {
    
    public static int count = 0;
    public static int timer = 15;
    public static int ans_give = 0;
    public static int score = 0;
    JButton next, lifeLine, submit;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton option1, option2, option3, option4;
    ButtonGroup options;
    String userName;
    Quiz(String userName) {
        this.userName = userName;
        setBounds(0, 0, 1440, 950);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icon/quiz.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1440, 392);
        add(l1);
        
        qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setBounds(100, 450, 60, 30);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(150, 450, 700, 30);
        add(question);
        
        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";
        
        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";
        
        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";
        
        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";
        
        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";
        
        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";
        
        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";
        
        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";
        
        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";
        
        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
        
        option1 = new JRadioButton("");
        option1.setFont(new Font("Dialog", Font.PLAIN, 20));
        option1.setBounds(170, 500, 700, 50);
        option1.setBackground(Color.WHITE);
        add(option1);
        
        option2 = new JRadioButton("");
        option2.setFont(new Font("Dialog", Font.PLAIN, 20));
        option2.setBounds(170, 540, 700, 50);
        option2.setBackground(Color.WHITE);
        add(option2);
        
        option3 = new JRadioButton("");
        option3.setFont(new Font("Dialog", Font.PLAIN, 20));
        option3.setBounds(170, 580, 700, 50);
        option3.setBackground(Color.WHITE);
        add(option3);
        
        option4 = new JRadioButton("");
        option4.setFont(new Font("Dialog", Font.PLAIN, 20));
        option4.setBounds(170, 620, 700, 50);
        option4.setBackground(Color.WHITE);
        add(option4);
        
        options = new ButtonGroup();
        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);
        
        next = new JButton("Next");
        next.setBounds(1000, 400, 240, 50);
        next.setFont(new Font("Tahoma", Font.PLAIN, 24));
        next.setBackground(new Color(30, 144, 254));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeLine = new JButton("50-50 Life Line");
        lifeLine.setBounds(1000, 480, 240, 50);
        lifeLine.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lifeLine.setBackground(new Color(30, 144, 254));
        lifeLine.setForeground(Color.WHITE);
        lifeLine.addActionListener(this);
        add(lifeLine);
        
        submit = new JButton("Submit");
        submit.setEnabled(false);
        submit.setBounds(1000, 560, 240, 50);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 24));
        submit.setBackground(new Color(30, 144, 254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        start(0);
        
    }
    
    public static void main(String[] args) {
        new Quiz("").setVisible(true);
    }
    
    private void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        option1.setLabel(q[count][1]);
        option1.setActionCommand(q[count][1]);
        option2.setLabel(q[count][2]);
        option2.setActionCommand(q[count][2]);
        option3.setLabel(q[count][3]);
        option3.setActionCommand(q[count][3]);
        option4.setLabel(q[count][4]);
        option4.setActionCommand(q[count][4]);
        options.clearSelection();//xóa đáp án đã chọn ở câu hỏi trước đó

    }
    
    public void paint(Graphics g) {
        
        super.paint(g);
        String time = "Timer Left " + timer;
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma", Font.PLAIN, 18));
        if (timer > 0) {
            g.drawString(time, 1015, 680);
        } else {
            g.drawString("Time ups !", 1015, 680);
        }
        
        timer--;//thoi gian lui lại
        try {
            Thread.sleep(1000);
            repaint();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (ans_give == 1) {
            ans_give = 0;
            timer = 15;
            
        }
        else{
            if (timer < 0) {
                timer = 15;
                option1.setEnabled(true);
                option2.setEnabled(true);
                option3.setEnabled(true);
                option4.setEnabled(true);
                if (count == 8) {
                    next.setEnabled(false);
                    submit.setEnabled(true);
                }
                if (count == 9) {
                    if (options.getSelection() == null) {
                        pa[count][0] = "";
                    } else {
                        pa[count][0] = options.getSelection().getActionCommand();//gán hành động đã được đặt nhãn
                    }

                    for (int i = 0; i < pa.length; ++i) {
                        if (pa[i][0].equals(qa[i][1])) {
                            score += 10;
                        } else {
                            score += 0;
                        }
                    }
                    this.setVisible(false); // new score.setVisible(true)\
                    new Score(userName, score).setVisible(true);
                } else {
                    if (options.getSelection() == null) {
                        pa[count][0] = "";
                    } else {
                        pa[count][0] = options.getSelection().getActionCommand();//gán hành động đã được đặt nhãn
                    }
                    count++;
                    start(count);
                }

            }
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e
    ) {
        if (e.getSource() == next) {
            repaint();
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);
            
            ans_give = 1;
            if (options.getSelection() == null) {
                pa[count][0] = "";
            } else {
                pa[count][0] = options.getSelection().getActionCommand();//gán hành động đã được đặt nhãn
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count > 9){
                count = 0;
            }
            
            count++;
            start(count);
        } else {
            if (e.getSource() == submit) {
                ans_give = 1;
                if (options.getSelection() == null) {
                    pa[count][0] = "";
                } else {
                    pa[count][0] = options.getSelection().getActionCommand();//gán hành động đã được đặt nhãn
                }
                
                for (int i = 0; i < pa.length; ++i) {
                    if (pa[i][0].equals(qa[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                this.setVisible(false); // new score.setVisible(true)
                new Score(userName, score).setVisible(true);
            } else {
                if (e.getSource() == lifeLine) {
                    if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                        option2.setEnabled(false);
                        option3.setEnabled(false);
                    }
                } else {
                    option1.setEnabled(false);
                    option4.setEnabled(false);
                    
                }
                lifeLine.setEnabled(false);
            }
            
        }
    }
}
