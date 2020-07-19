package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            table\n");
      out.write("            {\n");
      out.write("                border: medium solid #660000;\n");
      out.write("            }\n");
      out.write("            thead\n");
      out.write("            {\n");
      out.write("             font-size:30px;\n");
      out.write("             font-family: verdana;\n");
      out.write("             background-color:pink;\n");
      out.write("             font-weight:lighter\n");
      out.write("            }\n");
      out.write("            tbody\n");
      out.write("            {\n");
      out.write("             background-color:whitesmoke;\n");
      out.write("             background-color:pink;\n");
      out.write("             font-size: 15px;\n");
      out.write("             font-family: verdana;\n");
      out.write("             font-weight: bold\n");
      out.write("            }\n");
      out.write("            input\n");
      out.write("            {\n");
      out.write("                font-family: Verdana;\n");
      out.write("                font-size:15px;\n");
      out.write("                font-style: normal\n");
      out.write("            }\n");
      out.write("            select\n");
      out.write("            {\n");
      out.write("                font-family: Verdana;\n");
      out.write("                font-size:15px;\n");
      out.write("                font-style: normal\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Process.jsp\">\n");
      out.write("            <table width=\"40%\" cellspacing=\"2\"  align=\"center\" border=\"0\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"6\">Student Registration Form</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Student ID</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"sid\" pattern=\"[1-9]\" required size=\"15\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Firstname</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"fname\" required size=\"15\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Lastname</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"lname\" size=\"15\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"male\" />Male\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"female\" />Female\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>DOB</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"dob\" size=\"15\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"password\" name=\"passwrd\" size=\"15\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>E-mail</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\" size=\"15\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Mobile</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"mobile\" size=\"15\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>City</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"city\">\n");
      out.write("                                <option>Select</option>\n");
      out.write("                                <option value=\"chennai\">Chennai</option>\n");
      out.write("                                <option value=\"coimbatore\">Coimbatore</option>\n");
      out.write("                                <option value=\"erode\">Erode</option>\n");
      out.write("                                <option value=\"trichy\">Trichy</option>\n");
      out.write("                                <option value=\"salem\">Salem</option>\n");
      out.write("                                <option value=\"banglore\">Banglore</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>Department</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"dept\">\n");
      out.write("                                <option>Select</option>\n");
      out.write("                                <option value=\"CSE\">CSE</option>\n");
      out.write("                                <option value=\"IT\">IT</option>\n");
      out.write("                                <option value=\"ECE\">ECE</option>\n");
      out.write("                                <option value=\"EEE\">EEE</option>\n");
      out.write("                                <option value=\"MECH\">MECH</option>\n");
      out.write("                                <option value=\"MCT\">MCT</option>\n");
      out.write("                                <option value=\"CIVIL\">CIVIL</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Campus</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"campus\">\n");
      out.write("                                <option>Select</option>\n");
      out.write("                                <option value=\"SKCET\">SKCET</option>\n");
      out.write("                                <option value=\"SKCT\">SKCT</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <input type=\"submit\"  value=\"submit\">\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"reset\" value=\"reset\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
