package quiz_it;

import java.sql.*;
import java.util.*;
public class updateDatabase {
    public static void main(String args[])throws Exception
    {
        String url="jdbc:mysql://localhost/quiz";
        String username="root";
        String password="";
        Scanner sc=new Scanner(System.in);
        String question=sc.nextLine();
        String option1=sc.nextLine();
        String option2=sc.nextLine();
        String option3=sc.nextLine();
        String option4=sc.nextLine();
        String correctOption=sc.nextLine();
        
        String query="Insert into questions_and_answers(question, option_1, option_2,option_3,option_4,correct_option) values('"+question+"','"+option1+"','"+option2+"','"+option3+"','"+option4+"','"+correctOption+"')";
        
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        st.executeUpdate(query);
        st.close();
        con.close();
    }
}
