package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    private static Connection con;

    public static Connection getCon() {
          try
          {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","manoj","manoj");
          }
          catch(Exception e)
          {
               System.out.println("     "+e);
          }

        return con;
    }



}
