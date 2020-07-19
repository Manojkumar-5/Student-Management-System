package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBProcess {


    public String StudentDetails(int sid,String fname,String lname,String gender,String dob,String passwrd,String email,double mobile,String city,String dept,String campus)
    {
        try
        {
           Connection con=DBConnect.getCon();
           PreparedStatement pst=con.prepareStatement("insert into students values(?,?,?,?,?,?,?,?,?,?,?)");

           pst.setInt(1,sid);
           pst.setString(2,fname);
           pst.setString(3,lname);
           pst.setString(4,gender);
           pst.setString(5,dob);
           pst.setString(6,passwrd);
           pst.setString(7,email);
           pst.setDouble(8,mobile);
           pst.setString(9,city);
           pst.setString(10,dept);
           pst.setString(11,campus);
           pst.executeUpdate();
           con.close();
           return "success";
         }
         catch(Exception e)
         {
           return e.toString();
         }
    }
}
