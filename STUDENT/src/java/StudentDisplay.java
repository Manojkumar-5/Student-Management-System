
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class StudentDisplay extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {

      response.setContentType("text/html");
      PrintWriter out=response.getWriter();


       try
       {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","manoj","manoj");


        PreparedStatement pst=con.prepareStatement("select SID,FIRST_NAME,LAST_NAME,GENDER,DOB,EMAIL,MOBILE,CITY,DEPT,CAMPUS from students");

        ResultSet rst=pst.executeQuery();

        out.println("<table cellspacing='0' width='100%' border='4'>");

        out.println("<tr  bgcolor='pink'>");

        out.println("<th>SID</th>");
        out.println("<th>FIRST_NAME</th>");
        out.println("<th>LAST_NAME</th>");
        out.println("<th>GENDER</th>");
        out.println("<th>DOB</th>");
        out.println("<th>EMAIL</th>");
        out.println("<th>MOBILE</th>");
        out.println("<th>CITY</th>");
        out.println("<th>DEPT</th>");
        out.println("<th>CAMPUS</th>");

        out.println("</tr>");
    
        
        while(rst.next())
        {
            out.println("<tr>");
            out.println("<td align='center'>"+rst.getInt("SID")+"</td>");
            out.println("<td>"+rst.getString("FIRST_NAME")+"</td>");
            out.println("<td align='center'>"+rst.getString("LAST_NAME")+"</td>");
            out.println("<td>"+rst.getString("GENDER")+"</td>");
            out.println("<td>"+rst.getString("DOB")+"</td>");
            out.println("<td>"+rst.getString("EMAIL")+"</td>");
            out.println("<td>"+rst.getString("MOBILE")+"</td>");
            out.println("<td>"+rst.getString("CITY")+"</td>");
            out.println("<td>"+rst.getString("DEPT")+"</td>");
            out.println("<td>"+rst.getString("CAMPUS")+"</td>");
            out.println("</tr>");
        }
        
        out.println("</table>");
        con.close();
       }
       catch(Exception ex)
       {
          out.println("  "+ex);
       }
       finally
       {

       }

      out.close();
    }
}
