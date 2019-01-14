package quiz_it;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;

public class Quiz_it {
   static Container c;
   static JLabel question;
   static JFrame frame;
   static JButton button1,button2,button3,button4;
   static ResultSet rs;
   static int score=0;
   static Connection con;
   static Statement st;
   static int a[]=new int[2];
   static String Question,Option1,Option2,Option3,Option4,correctOption;
   
    public static void display2()throws Exception
    {
        //Establishing connection with database
        if(a[0]==0)
        {
        //a[1]=0;
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
            Question=rs.getString("question");
            Option1=rs.getString("option_1");
            Option2=rs.getString("option_2");
            Option3=rs.getString("option_3");
            Option4=rs.getString("option_4");
            correctOption=rs.getString("correct_option");
            
        /*frame=new JFrame("Quiz it!!");
        frame.setBounds(300,300,800,400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        Font f=new Font("Times New Roman",Font.PLAIN,20);
        Font f2=new Font("Times New Roman",Font.PLAIN,15); 
        
        
        question=new JLabel(Question);//question.setText(Question);
        question.setBounds(50,50,500,150);
        question.setFont(f);
        
        button1=new JButton(Option1);
        button1.setBounds(50,150,250,40);
        button1.setFont(f2);
        
        button2=new JButton(Option2);
        button2.setBounds(350,150,250,40);
        button2.setFont(f2);
        
        button3=new JButton(Option3);
        button3.setBounds(50,200,250,40);
        button3.setFont(f2);
        
        button4=new JButton(Option4);
        button4.setBounds(350,200,250,40);
        button4.setFont(f2);*/
        question.setText(Question);
        button1.setText(Option1);
        button2.setText(Option2);
        button3.setText(Option3);
        button4.setText(Option4);
       
        
        
        
        /*c.add(question);
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        
        frame.setVisible(true);*/
        
        //rs.next();
        
       // st.close();
       // con.close();
    }
    public static void display()throws Exception
    {
        frame=new JFrame("Quiz it!!");
        frame.setBounds(600,300,800,400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        c=frame.getContentPane();
        c.setLayout(null);
        Font f=new Font("Times New Roman",Font.PLAIN,20);
        Font f2=new Font("Times New Roman",Font.PLAIN,15); 
        
        
        question=new JLabel(Question);//question.setText(Question);
        question.setBounds(50,50,500,150);
        question.setFont(f);
        
        button1=new JButton(Option1);
        button1.setBounds(50,150,250,40);
        button1.setFont(f2);
        
        button2=new JButton(Option2);
        button2.setBounds(350,150,250,40);
        button2.setFont(f2);
        
        button3=new JButton(Option3);
        button3.setBounds(50,200,250,40);
        button3.setFont(f2);
        
        button4=new JButton(Option4);
        button4.setBounds(350,200,250,40);
        button4.setFont(f2);
        
        
        c.add(question);
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        
        frame.setVisible(true);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                        if(!button1.getText().equals(correctOption))
                        {
                            System.out.println("Wrong Answer1");
                            a[1]-=5;
                            System.out.println(a[1]);
                            Thread t=new Thread(new wrongscore());
                            t.start();
                            t.sleep(3000);
                            
                        }
                        else
                        {
                            System.out.println("Correct Answer1");
                            a[0]++;
                            a[1]+=10;
                            System.out.println(a[1]);
                            /*if(a[2]==1)
                            {
                                correctscore cor=new correctscore();
                                cor.loadGUI();
                                a[2]++;
                            }*/
                            Thread t=new Thread(new correctscore());
                            t.start();
                            Timer timer=new Timer();
                            
                            timer.schedule(new TimerTask(){
                                public void run() {
                                    try
                                    {
                                    display2();
                                    }
                                    catch(Exception e)
                                    {
                                        System.out.println(e);
                                    }
                                }
                            }, 1);
                           // display2();
                        }
                }
                catch(Exception e)
                        {
                           // System.out.println(e);
                            System.out.println("Your total score is:"+a[1]);
                        }
            }
        });
        
        
        
        
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                        if(!button2.getText().equals(correctOption))
                        {
                            System.out.println("Wrong Answer2");
                            a[1]-=5;
                            System.out.println(a[1]);
                            Thread t=new Thread(new wrongscore());
                           /* wrongscore w=new wrongscore();
                            w.loadGUI();*/
                            t.start();
                            //t.sleep(3000);
                            
                        }
                        else
                        {
                            System.out.println("Correct Answer2");
                            a[0]++;
                            a[1]+=10;
                            System.out.println(a[1]);
                            /*if(a[2]==1)
                            {
                                correctscore cor=new correctscore();
                                cor.loadGUI();
                                a[2]++;
                            }*/
                            Thread t=new Thread(new correctscore());
                            t.start();
                            Timer timer=new Timer();
                            
                            timer.schedule(new TimerTask(){
                                public void run() {
                                    try
                                    {
                                    display2();
                                    }
                                    catch(Exception e)
                                    {
                                        System.out.println(e);
                                    }
                                }
                            }, 1);
                           // display2();
                        }
                }
                catch(Exception e)
                        {
                            //System.out.println(e);
                            System.out.println("Your total score is:"+a[1]);
                        }
            }
        });
        
        
        
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                        if(!button3.getText().equals(correctOption))
                        {
                            System.out.println("Wrong Answer3");
                            a[1]-=5;
                            System.out.println(a[1]);
                            Thread t=new Thread(new wrongscore());
                            t.start();
                            //t.sleep(3000);
                            
                        }
                        else
                        {
                            System.out.println("Correct Answer3");
                            a[0]++;
                            a[1]+=10;
                            System.out.println(a[1]);
                           /* if(a[2]==1)
                            {
                                correctscore cor=new correctscore();
                                cor.loadGUI();
                                a[2]++;
                            }*/
                            Thread t=new Thread(new correctscore());
                            t.start();
                            Timer timer=new Timer();
                            
                            timer.schedule(new TimerTask(){
                                public void run() {
                                    try
                                    {
                                    display2();
                                    }
                                    catch(Exception e)
                                    {
                                        System.out.println(e);
                                    }
                                }
                            }, 1);
                            //display2();
                           //rs.next();
                           //return;
                        }
                }
                catch(Exception e)
                        {
                            //System.out.println(e);
                            System.out.println("Your total score is:"+a[1]);
                        }
            }
        });
        
        
        
        
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                        if(!button4.getText().equals(correctOption))
                        {
                            System.out.println("Wrong Answer4");
                            a[1]-=5;
                            System.out.println(a[1]);
                            Thread t=new Thread(new wrongscore());
                            t.start();
                            //t.sleep(3000);
                           
                        }
                        else
                        {
                            System.out.println("Correct Answer4");
                            a[0]++;
                            a[1]+=10;
                            System.out.println(a[1]);
                           /* if(a[2]==1)
                            {
                                correctscore cor=new correctscore();
                                cor.loadGUI();
                                a[2]++;
                            }*/
                            Thread t=new Thread(new correctscore());
                            t.start();
                            Timer timer=new Timer();
                            timer.schedule(new TimerTask(){
                                public void run() {
                                    try
                                    {
                                    display2();
                                    
                                    }
                                    catch(Exception e)
                                    {
                                        System.out.println(e);
                                    }
                                }
                            }, 1);
                            
                            
                           // display2();
                           //rs.next();
                           //return;
                        }
                }
                catch(Exception e)
                        {
                            System.out.println("Your total score is:"+a[1]);
                        }
            }
        });
        
        
        display2();
    }
    public static void main(String args[])throws Exception
    {
        display();
        
       // st.close();
       // con.close();
    }
    
}


