package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //regirstring driver
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Dhaval","Dhaval","Dr301*dp");

            Statement statement= connection.createStatement();
           //String update="update employee set name='Ramesh' where id=1";   //update the employee where id =1

          //  String insert ="insert into employee(id,name,address) values(2,'naredra','Delhi')";  //insert new row

             String  delete="delete from employee where id=1";     //delete the employee row where the id =1;

            int i=statement.executeUpdate(delete);

            System.out.println("row inserted ==>"+i);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
