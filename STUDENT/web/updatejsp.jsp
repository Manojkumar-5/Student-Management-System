   <jsp:useBean id="obj_formdetails" class="db.FormDetails" scope="request">
        <jsp:setProperty name="obj_formdetails" param="sid" property="sid"/>
        <jsp:setProperty name="obj_formdetails" param="fname" property="fname"/>
        <jsp:setProperty name="obj_formdetails" param="lname" property="lname"/>
        <jsp:setProperty name="obj_formdetails" param="gender" property="gender"/>
        <jsp:setProperty name="obj_formdetails" param="dob" property="dob"/>
        <jsp:setProperty name="obj_formdetails" param="passwrd" property="passwrd"/>
        <jsp:setProperty name="obj_formdetails" param="email" property="email"/>
        <jsp:setProperty name="obj_formdetails" param="mobile" property="mobile"/>
        <jsp:setProperty name="obj_formdetails" param="city" property="city"/>
        <jsp:setProperty name="obj_formdetails" param="dept" property="dept"/>
        <jsp:setProperty name="obj_formdetails" param="campus" property="campus"/>
        </jsp:useBean>

        <jsp:forward page="/updates.jsp"/>