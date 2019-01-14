
package quiz_it;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class sign_up {
    static JFrame frame;
    static JTextField name1;
    static JTextField email1;
    static JPasswordField pass;
    static JTextField mob1;
    static JTextField add1;
    static Container c;
    public static void signup()throws Exception
        {
             JFrame frame=new JFrame("Sign-Up");
             frame.setBounds(300,300,600,400);
             frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
             
             JLabel name=new JLabel("Name:");
             name.setBounds(50,50,100,40);
             name1=new JTextField(45);
             name1.setBounds(120,55,180,27);
             
             
             JLabel email=new JLabel("Email-Id:");
             email.setBounds(50,100,100,40);
             email1=new JTextField(45);
             email1.setBounds(120,105,180,27);
             
             
             JLabel password=new JLabel("Password:");
             password.setBounds(50,150,100,40);
             pass=new JPasswordField();
             pass.setBounds(120,155,180,27);
             
             
             JLabel mobile=new JLabel("Mobile:");
             mobile.setBounds(50,200,100,40);
             mob1=new JTextField(45);
             mob1.setBounds(120,205,180,27);
             
             
             JLabel address=new JLabel("Address:");
             address.setBounds(50,250,100,40);
             add1=new JTextField(45);
             add1.setBounds(120,255,180,27);
             
             JLabel sign=new JLabel("SIGN");
             Font f=new Font("Times New Roman", Font.BOLD, 100);
             sign.setFont(f);
             sign.setBounds(310,40,300,150);
             
             JLabel up=new JLabel("UP");
             up.setFont(f);
             up.setBounds(350,120,300,150);
             
             c=frame.getContentPane();
             c.setLayout(null);
             
             JButton submit=new JButton("Submit");
             submit.setBounds(155,305,100,35);
             
             c.add(name);
             c.add(email);
             c.add(password);
             c.add(mobile);
             c.add(address);
             c.add(name1);
             c.add(email1);
             c.add(mob1);
             c.add(add1);
             c.add(pass);
             c.add(submit);
             c.add(sign);
             c.add(up);
             c.setBackground(Color.yellow);
             frame.setVisible(true);
             
             submit.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent ae)
                 {
                     buttonEvent(ae);
                 }
             });
        }
    public static void buttonEvent(ActionEvent ae)
    {
        try
        {
        String Name=name1.getText();
        String Email=email1.getText();
        String Mobile=mob1.getText();
        String Password=pass.getText();
        String Address=add1.getText();
        String url="jdbc:mysql://localhost/quiz";
        String uname="root";
        String passw="";
        System.out.println(Name+" "+Email);
        String query="Insert into users(name,email_id,password,mobile_no,address) values ('"+Name+"','"+Email+"','"+Password+"','"+Mobile+"','"+Address+"')";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,uname,passw);
        Statement st=con.createStatement();
        st.executeUpdate(query);
        c.setBackground(Color.green);
        login ob=new login();
        ob.login();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])throws Exception
    {
        signup();
    }
    
}
