package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //regirstring driver

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Dhaval","Dhaval","Dr301*dp");

            Statement statement=connection.createStatement();
            String insert="insert into employee(id,name,address) values (1,'ram','mumbai')";

            int i= statement.executeUpdate(insert);

            System.out.println("row inserted==> "+i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
