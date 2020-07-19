

<%@page import="db.* "%>



<jsp:useBean id="obj_formdetails" class="db.FormDetails" scope="request"/>

<%
        DBProcess dbprocess=new DBProcess();

        try
        {
           int sid=obj_formdetails.getSid();
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

           String result=dbprocess.StudentDetails(sid, fname, lname, gender, dob,passwrd,email, mobile, city, dept,campus);

           if(result.equals("success"))
            {
               out.println("<h1>Registration Completed Successfully</h1>");
               out.println("<a href='Create.jsp'>Back</a>");
            }
            else
            {
               out.println(" Registration Failed     :"+result);
               out.println("<a href='Create.jsp'>Back</a>");
            }
        }
        catch(Exception ex)
        {
            out.println(ex);
        }
%>