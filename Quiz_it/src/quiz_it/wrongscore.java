package quiz_it;

import java.sql.*;
import java.util.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;
import static quiz_it.Quiz_it.a;

public class wrongscore implements Runnable {
     JFrame frame;
     JLabel scoring,label;
     JLabel emoji;
     Container c;
     int k1=0,k2=0;
     Timer t1,t2;
     /*public void loadGUI()
     {
         k1++;
        frame=new JFrame("Booooooo!!!!!");
        frame.setBounds(150,200,450,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        
        
        label=new JLabel("Wrong Answer!!!");
        label.setBounds(50,30,400,100);
        Font f=new Font("Times New Roman",Font.PLAIN,50);
        label.setFont(f);
        
        scoring=new JLabel("Your score is: "+ a[1]);
        scoring.setBounds(50,300,400,100);
        scoring.setFont(f);
        
        
        ImageIcon icon=new ImageIcon("laughingEmoji.jpg");
        emoji=new JLabel(icon);
        emoji.setBounds(75,105,icon.getIconWidth(),icon.getIconHeight());
        
        
        
        c.add(label);
        c.add(scoring);
        c.add(emoji);
        
        frame.setVisible(true);
     }*/
    public /*static*/ void run()
    {
        k1++;
        frame=new JFrame("Booooooo!!!!!");
        frame.setBounds(150,200,450,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        
        
        label=new JLabel("Wrong Answer!!!");
        label.setBounds(50,30,400,100);
        Font f=new Font("Times New Roman",Font.PLAIN,50);
        label.setFont(f);
        
        scoring=new JLabel("Your score is: "+ a[1]);
        scoring.setBounds(50,300,400,100);
        scoring.setFont(f);
        
        
        ImageIcon icon=new ImageIcon("laughingEmoji.jpg");
        emoji=new JLabel(icon);
        emoji.setBounds(75,105,icon.getIconWidth(),icon.getIconHeight());
        
        
        
        c.add(label);
        c.add(scoring);
        c.add(emoji);
        
        frame.setVisible(true);
       
        /*if(k1==1)
        {
            t1.cancel();
        }*/
    }
    public void closewrong()
     {
         frame.setVisible(false);
         frame.dispose();
     }
}