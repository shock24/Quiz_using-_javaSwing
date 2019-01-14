/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_it;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class login {
    static JLabel email, password,Login;
    static JTextField Email;
    static JPasswordField Password;
    static JFrame frame;
    static Container c;
    static JButton login;
    public static void login()throws Exception
    {
        
        frame=new JFrame("Login");
        frame.setBounds(300,300,450,300);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        Font f=new Font("Arial", Font.PLAIN,22);
        
        email=new JLabel("E-Mail:");
        email.setBounds(83,75,180,27);
        email.setFont(f);
        
        password=new JLabel("Password:");
        password.setBounds(50,115,180,27);
        password.setFont(f);
        
        Email=new JTextField(45);
        Email.setBounds(155,75,180,27);
        
        Password=new JPasswordField(45);
        Password.setBounds(155,115,180,27);
        
        login=new JButton("Login");
        login.setBounds(205,175,100,35);
        
        Login=new JLabel("Log-In");
        Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,50);
        Login.setFont(f1);
        Login.setBounds(150,0,200,55);
        
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                ButtonEvent(ae);
            }
        });
        
        c.add(email);
        c.add(password);
        c.add(Email);
        c.add(Password);
        c.add(login);
        c.add(Login);
        c.setBackground(Color.CYAN);
        frame.setVisible(true);
        
    }
    public static void ButtonEvent(ActionEvent ae)
    {
        try
        {
            String email=Email.getText();
            String password=Password.getText();
            
            String url="jdbc:mysql://localhost/quiz";
            String uname="root";
            String pass="";
            
            String query="Select * from users";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            int c1=0;
            while(rs.next())
            {
               // System.out.println(rs.getString("email_id"));
                if(rs.getString("email_id").equals(email)&&rs.getString("password").equals(password))//you cannot compare 2 strings simply using ==
                {
                    c1=1;
                    break;
                }
            }
            if(c1==1)
            {
                Quiz_it quiz=new Quiz_it();
                quiz.display();
            }
            else
            {
                sign_up sign=new sign_up();
                sign.signup();
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])throws Exception
    {
        login();
    }
    
}
