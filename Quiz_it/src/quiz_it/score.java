/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_it;
import java.sql.*;
import java.util.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;

public class score {
     JFrame frame;
     JLabel scoring,label;
     JLabel emoji;
     Container c;
     int k1=0,k2=0;
     Timer t1,t2;
    public /*static*/ void scoreShowWrong()
    {
       k1++;
        frame=new JFrame("Booooooo!!!!!");
        frame.setBounds(300,200,450,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        
        
        label=new JLabel("Wrong Answer!!!");
        label.setBounds(50,30,400,100);
        Font f=new Font("Times New Roman",Font.PLAIN,50);
        label.setFont(f);
        
        scoring=new JLabel("Your score is: "+ 10);
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
    public /*static*/ void scoreShowCorrect()
    {
        k2++;
        frame=new JFrame("Ohho!!!!");
        frame.setBounds(300,200,450,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        
        
        label=new JLabel("Correct Answer!!!");
        label.setBounds(50,30,400,100);
        Font f=new Font("Times New Roman",Font.PLAIN,50);
        label.setFont(f);
        
        scoring=new JLabel("Your score is: "+ 10);
        scoring.setBounds(50,300,400,100);
        scoring.setFont(f);
        
        
        ImageIcon icon=new ImageIcon("smirkingEmoji.jpg");
        emoji=new JLabel(icon);
        emoji.setBounds(75,105,icon.getIconWidth(),icon.getIconHeight());
        
        
        
        c.add(label);
        c.add(scoring);
        c.add(emoji);
        
        frame.setVisible(true);
        /*if(k2==1)
        {
            t2.cancel();
        }*/
    }
    /*public static void main(String args[])
    {
        
        TimerTask timertask=new TimerTask() {
            public void run() {
                scoreShowWrong();
            }
        };
         TimerTask timertask2=new TimerTask() {
            public void run() {
                scoreShowCorrect();
            }
        };
        t1=new Timer();
        t2=new Timer();
        t1.schedule(timertask,3000,3000);
        t2.schedule(timertask2,3000,3000);
        
        
        
    }*/
    
}
