package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataAccess
{
    private static ArrayList st_id;

    public static  ArrayList getSid()
    {
         st_id=new ArrayList();
         st_id.clear();
         try
         {
           Connection con=DBConnect.getCon();
           PreparedStatement pst=con.prepareStatement("select SID from students");

           ResultSet rst=pst.executeQuery();

           while(rst.next())
           {
               st_id.add(rst.getInt("sid"));
           }
         }
         catch(Exception ex)
         {
             System.out.println(ex);
         }
        return st_id;
    }


}
