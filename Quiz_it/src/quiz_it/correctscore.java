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
import static quiz_it.Quiz_it.a;

public class correctscore implements Runnable {
     JFrame frame;
    JLabel scoring,label;
    JLabel emoji;
    Container c;
    int k1=0,k2=0;
    Timer t1,t2;
    ImageIcon icon;
     public void loadGUI()
     {
         frame=new JFrame("Ohho!!!!");
        frame.setBounds(150,200,450,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        
        
        label=new JLabel("Correct Answer!!!");
        label.setBounds(50,30,400,100);
        Font f=new Font("Times New Roman",Font.PLAIN,50);
        label.setFont(f);
        
        scoring=new JLabel("Your score is: "+ a[1]);
        scoring.setBounds(50,300,400,100);
        scoring.setFont(f);
        
        
        icon=new ImageIcon("smirkingEmoji.jpg");
        emoji=new JLabel(icon);
        emoji.setBounds(75,105,icon.getIconWidth(),icon.getIconHeight());
        
        
        
        c.add(label);
        c.add(scoring);
        c.add(emoji);
        
        frame.setVisible(true); 
     }
     public void run()
    {
        frame=new JFrame("Ohho!!!!");
        frame.setBounds(150,200,450,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        
        
        label=new JLabel("Correct Answer!!!");
        label.setBounds(50,30,400,100);
        Font f=new Font("Times New Roman",Font.PLAIN,50);
        label.setFont(f);
        
        scoring=new JLabel("Your score is: "+ a[1]);
        scoring.setBounds(50,300,400,100);
        scoring.setFont(f);
        
        
        ImageIcon icon=new ImageIcon("smirkingEmoji.jpg");
        emoji=new JLabel(icon);
        emoji.setBounds(75,105,icon.getIconWidth(),icon.getIconHeight());
        
        
        
        c.add(label);
        c.add(scoring);
        c.add(emoji);
        
        frame.setVisible(true);
        
        frame.setTitle("Ohho!!!");
        label.setText("Correct Answer!!!");
        scoring.setText("Your score is: "+a[1]);
        emoji.setIcon(icon);
        
    
    }
     public void closecorrect()
     {
         frame.setVisible(false);
         frame.dispose();
     }
     /*public static void main(String args[])
     {
         run();
         closecorrect();
     }*/
}
