<%@page  import="java.sql.* " %>
<html>
    <head>
        <style>
            table
            {
                border: medium solid #660000;
            }
            thead
            {
             font-size:30px;
             font-family: verdana;
             background-color:whitesmoke;
             font-weight:lighter
            }
            tbody
            {
             background-color:whitesmoke;
             background-color:whitesmoke;
             font-size: 15px;
             font-family: verdana;
             font-weight: bold
            }
            input
            {
                font-family: Verdana;
                font-size:15px;
                font-style: normal
            }
            select
            {
                font-family: Verdana;
                font-size:15px;
                font-style: normal

            }
        </style>
    </head>

    <body>
        <form action="updatejsp.jsp">
            
            <table width="40%" cellspacing="2"  align="center" border="0">
                <thead>
                    <tr>
                        <th colspan="6"> Update </th>
                    </tr>
                </thead>
                <tbody>

                    <tr>
                        <td>Student ID</td>
                        <td>:</td>
                        <td><input type="text" name="sid" pattern="[1-9]" required size="15"></td>
                    </tr>

                    <tr>
                        <td>Firstname</td>
                        <td>:</td>
                        <td><input type="text" name="fname" required size="15"></td>
                    </tr>

                    <tr>
                        <td>Lastname</td>
                        <td>:</td>
                        <td><input type="text" name="lname" required size="15"></td>
                    </tr>

                    <tr>
                        <td>Gender</td>
                        <td>:</td>
                        <td>
                            <input type="radio" name="gender" value="male" />Male
                            <input type="radio" name="gender" value="female"  />Female
                        </td>
                    </tr>

                    <tr>
                        <td>DOB</td>
                        <td>:</td>
                        <td><input type="text" name="dob" required size="15"></td>
                    </tr>

                    <tr>
                        <td>Password</td>
                        <td>:</td>
                        <td><input type="password" name="passwrd" required size="15"></td>
                    </tr>

                    <tr>
                        <td>E-mail</td>
                        <td>:</td>
                        <td><input type="text" name="email" size="15"></td>
                    </tr>

                    <tr>
                        <td>Mobile</td>
                        <td>:</td>
                        <td><input type="text" name="mobile" required size="15"></td>
                    </tr>
                    <tr>
                        <td>City</td>
                        <td>:</td>
                        <td>
                            <select name="city" required>
                                <option>Select</option>
                                <option value="chennai">Chennai</option>
                                <option value="coimbatore">Coimbatore</option>
                                <option value="erode">Erode</option>
                                <option value="trichy">Trichy</option>
                                <option value="salem">Salem</option>
                                <option value="banglore">Banglore</option>
                            </select>
                        </td>
                    </tr>
                     <tr>
                        <td>Department</td>
                        <td>:</td>
                        <td>
                            <select name="dept" required>
                                <option>Select</option>
                                <option value="CSE">CSE</option>
                                <option value="IT">IT</option>
                                <option value="ECE">ECE</option>
                                <option value="EEE">EEE</option>
                                <option value="MECH">MECH</option>
                                <option value="MCT">MCT</option>
                                <option value="CIVIL">CIVIL</option>
                            </select>
                        </td>
                    </tr>
                   
                    <tr>
                        <td>Campus</td>
                        <td>:</td>
                        <td>
                            <select name="campus" required>
                                <option>Select</option>
                                <option value="SKCET">SKCET</option>
                                <option value="SKCT">SKCT</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit"  value="update">
                        </td>
                        <td>
                            <input type="reset" value="reset">
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
     
    </body>
</html>

