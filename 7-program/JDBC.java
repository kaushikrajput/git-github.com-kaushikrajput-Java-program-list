import java.sql.*;

public class JDBC {
   
    public class JDBCExample {
       //JDBC driver name and database URL
       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
       static final String DB_URL = "jdbc:mysql://localhost/";
       //Database credentials
       static final String USER = "root";
       static final String PASS = "password";
    
       public static void main(String[] args) {
          Connection conn = null;
          try{
             //STEP 2: Register JDBC driver
             Class.forName("com.mysql.jdbc.Driver");
             //STEP 3: Open a connection
             System.out.println("Connecting to database...");
             conn = DriverManager.getConnection(DB_URL, USER, PASS);
             System.out.println("Connection established");
             } catch(Exception e) {
          }
          System.out.println("Goodbye!");
       }
    }
}

//output  Connecting to database...
//        Connecting to database...
//        Connection established
//        Goodbye!