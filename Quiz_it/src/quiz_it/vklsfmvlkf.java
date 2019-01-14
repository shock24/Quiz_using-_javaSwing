package quiz_it;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vklsfmvlkf {
   static Container c;
   static JLabel question;
   static JFrame frame;
   static JButton button1,button2,button3,button4;
   static ResultSet rs;
   static int score=0;
   static Connection con;
   static Statement st;
   static int a[]=new int[2];
   
    public static void display()throws Exception
    {
        //Establishing connection with database
        if(a[0]==0)
        {
        a[1]=0;
        String url="jdbc:mysql://localhost/quiz";
        String username="root";
        String password="";
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url, username, password);
        st=con.createStatement();
        String query="Select * from questions_and_answers";
        rs=st.executeQuery(query);
        //Question question[]=new Question[3];
        int i=0;
        
        
        }
        rs.next();
        
        
           
           // System.out.println(i);
          //  i++;
            String Question=rs.getString("question");
            String Option1=rs.getString("option_1");
            String Option2=rs.getString("option_2");
            String Option3=rs.getString("option_3");
            String Option4=rs.getString("option_4");
            String correctOption=rs.getString("correct_option");
            
        frame=new JFrame("Quiz it!!");
        frame.setBounds(300,300,600,400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        Font f=new Font("Times New Roman",Font.PLAIN,20);
        Font f2=new Font("Times New Roman",Font.PLAIN,15); 
        
        
        question=new JLabel(Question);
        question.setBounds(50,50,500,150);
        question.setFont(f);
        
        button1=new JButton(Option1);
        button1.setBounds(50,150,150,40);
        button1.setFont(f2);
        
        button2=new JButton(Option2);
        button2.setBounds(350,150,150,40);
        button2.setFont(f2);
        
        button3=new JButton(Option3);
        button3.setBounds(50,200,150,40);
        button3.setFont(f2);
        
        button4=new JButton(Option4);
        button4.setBounds(350,200,150,40);
        button4.setFont(f2);
       
        
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                        if(button1.getText().equals(correctOption))
                        {
                            System.out.println("Correct Answer");
                            a[0]++;
                            a[1]+=10;
                            System.out.println(a[1]);
                            display();
                        }
                        else
                        {
                           System.out.println("Wrong Answer");
                           a[1]-=5;
                           System.out.println(a[1]);
                           //rs.next();
                           //return;
                        }
                }
                catch(Exception e)
                        {
                            System.out.println(e);
                            System.out.println("Game over!!!"); 
                            
                        }
            }
        });
        
        
        
        
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                        if(button2.getText().equals(correctOption))
                        {
                            System.out.println("Correct Answer");
                            a[0]++;
                            a[1]+=10;
                            System.out.println(a[1]);
                            display();
                        }
                        else
                        {
                           System.out.println("Wrong Answer");
                           a[1]-=5;
                           System.out.println(a[1]);
                           //rs.next();
                           //return;
                        }
                }
                catch(Exception e)
                        {
                            System.out.println(e);
                            System.out.println("Game over!!!"); 
                        }
            }
        });
        
        
        
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                        if(button3.getText().equals(correctOption))
                        {
                            System.out.println("Correct Answer");
                            a[0]++;
                            a[1]+=10;
                            System.out.println(a[1]);
                            display();
                        }
                        else
                        {
                           System.out.println("Wrong Answer");
                           a[1]-=5;
                           System.out.println(a[1]);
                           //rs.next();
                           //return;
                        }
                }
                catch(Exception e)
                        {
                            System.out.println(e);
                            System.out.println("Game over!!!"); 
                        }
            }
        });
        
        
        
        
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                        if(button4.getText().equals(correctOption))
                        {
                            System.out.println("Correct Answer");
                            a[0]++;
                            a[1]+=10;
                            System.out.println(a[1]);
                            display();
                        }
                        else
                        {
                           System.out.println("Wrong Answer");
                           a[1]-=5;
                           System.out.println(a[1]);
                           //rs.next();
                           //return;
                        }
                }
                catch(Exception e)
                        {
                            System.out.println(e);
                            System.out.println("Game over!!!"); 
                        }
            }
        });
        
        
        
        c.add(question);
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        
        frame.setVisible(true);
        
        //rs.next();
        
       // st.close();
       // con.close();
    }
    public static void main(String args[])throws Exception
    {
        display();
        
       // st.close();
       // con.close();
    }
    
}


