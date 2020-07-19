package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBUpdate {


    public static  String StudentUpdate(int sid,String fname,String lname,String gender,String dob,String passwrd,String email,double mobile,String city,String dept,String campus)
    {
        try
        {
           Connection con=DBConnect.getCon();
           PreparedStatement pst=con.prepareStatement("update students SET FIRST_NAME=?,LAST_NAME=?,GENDER=?,DOB=?,PASSWRD=?,EMAIL=?,MOBILE=?,CITY=?,DEPT=?,CAMPUS=? where SID=?");
           
           pst.setString(1,fname);
           pst.setString(2,lname);
           pst.setString(3,gender);
           pst.setString(4,dob);
           pst.setString(5,passwrd);
           pst.setString(6,email);
           pst.setDouble(7,mobile);
           pst.setString(8,city);
           pst.setString(9,dept);
           pst.setString(10,campus);
           pst.setInt(11,sid);
           
           
           
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
