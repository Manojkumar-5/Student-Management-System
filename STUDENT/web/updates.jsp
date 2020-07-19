

<%@page import="db.* "%>
<%@page import="java.util.* " %>


<jsp:useBean id="obj_formdetails" class="db.FormDetails" scope="request"/>

<%
        DBProcess dbprocess=new DBProcess();
        
        int sid=obj_formdetails.getSid();
        
        ArrayList al=DataAccess.getSid();
        
     if(al.contains(sid))
        {

        try
        {
          
            
           String fname=obj_formdetails.getFname();
           String lname=obj_formdetails.getLname();
           String gender=obj_formdetails.getGender();
           String dob=obj_formdetails.getDob();
           String passwrd=obj_formdetails.getPasswrd();
           String email=obj_formdetails.getEmail();
           double mobile=obj_formdetails.getMobile();
           String city=obj_formdetails.getCity();
           String dept=obj_formdetails.getDept();
           String campus=obj_formdetails.getCampus();
           
            
            
               
           String result=DBUpdate.StudentUpdate(sid, fname, lname, gender, dob,passwrd,email, mobile, city, dept,campus);

           if(result.equals("success"))
            {
               out.println("<h1>Update Successful</h1>");
               out.println("<a href='Update.jsp'>Back</a>");
            }
            else
            {
               out.println(" <h1>Update Failed  <h1>   :"+result);
               out.println("<a href='Update.jsp'>Back</a>");
            }
        }
        catch(Exception ex)
        {
            out.println(ex);
        }
        
        }
     else
     {
         out.println("<h1> Student id is not available in the database</h1>");
         out.println("<a href='Update.jsp'>Back</a>");
                    
     }
        
%>