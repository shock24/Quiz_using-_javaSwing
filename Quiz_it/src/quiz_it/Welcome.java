/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_it;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Welcome {
    static JFrame frame;
    static Container c;
    static JLabel Quiz_it;
    static JButton login,signup;
    public static void welcome()
    {
        frame=new JFrame("Welcome");
        frame.setBounds(300,300,500,300);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        
        login =new JButton("Login");
        login.setBounds(150,100,120,25);
        
        signup=new JButton("Sign Up");
        signup.setBounds(150,150,120,25);
        
        Quiz_it=new JLabel("Let's Play!!!");
        Font f=new Font("Times New Roman", Font.BOLD+Font.ITALIC,50);
        Quiz_it.setBounds(120,30,300,75);
        Quiz_it.setFont(f);
        
        login.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae)
           {
               ButtonLogin(ae);
           }
        });
        
        signup.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae)
           {
               ButtonSignup(ae);
           }
        });
        
        c.add(login);
        c.add(signup);
        c.add(Quiz_it);
        frame.setVisible(true);
        
        
        
    }
    public static void ButtonLogin(ActionEvent ae)
    {
        try
        {
        login l=new login();
        l.login();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void ButtonSignup(ActionEvent ae)
    {
        try
        {
        sign_up ob=new sign_up();
        ob.signup();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        welcome();
    }
    
}
