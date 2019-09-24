<html>
    <head>
        <link href="../css/style.css" rel="stylesheet">
        <title></title>
    </head>
    <body>
        <div id="wrapper">
            <div id="search">
                <div id="search"><img src="../images/header-logo.jpg" width="250px;" height="100px;" style="margin: 4px 4px 4px 4px"></div>
                <div style="clear: both"></div>
                <div style="text-align: left;background-color:#525E6A;"><span><%@include file="leftmenu.jsp" %></span></div>
                <div id="slider" style="height: 250px;"><%@include file="slider.jsp" %></div>
                <center>
                    <div style="widows: 98%;font-size: 13px;line-height: 20px;">
                        <div style="float: left;width: 20%">
                            <div style="margin-bottom: 50px;float: left;width: 20%;margin-left: 20px">
                                <div id="homediv" align="middle"><img src="../images/health-records-small.jpg" width="150px" height="150px;" style="border-radius:15px;" align="middle"></div>
                                <br/>
                                <div id="homediv" align="middle"><img src="../images/doc-pn.jpg" width="150px" height="150px;" style="border-radius:15px;" align="middle"></div>
                                <br/>
                            </div>
                        </div>
                        <div style="float: left;width: 50%">
                            <br>
                            <p style="text-align: justify">
                                Doctors diagnose and treat illness and injury. 
                                They take a patient?s medical history, examine areas of the body
                                that feel unhealthy or painful, order and interpret diagnostic tests,
                                and plan and implement courses of treatment. They often counsel patients
                                on diet, hygiene and lifestyle changes that can improve well-being. 
                                They may set up their own practices or work for medical corporations, 
                                such as hospitals. Because the practice of medicine is complex, many 
                                doctors specialize in particular medical conditions or areas of the body

                            </p>
                            <br>
                            <p style="text-align: justify">
                                Doctors begin their training with a bachelor?s degree that requires four 
                                years of study. Though specific degrees are not mandated, necessary subjects
                                include biology, chemistry, physics, math and English. Undergraduates must 
                                then receive acceptable scores on the Medical College Admission Test before 
                                they are considered for medical school. This advanced education takes at least
                                four years and includes classroom, laboratory and practical learning.
                                The expense of the process left at least 85 percent of medical school 
                                grads in debt for educational expenses. After medical school, graduates
                                are required to undergo a residency program in a hospital that lasts from 
                                three to eight years, depending on the specialty. Finally, all states require
                                physicians to have a license, which mandates education and passing written 
                                and practical exams; a further credential is supplied when a specialist 
                                becomes board-certified.
                            </p>
                        </div>
                        <div style="float: left;width: 28%">
                            <form name="frmRegistration" id="frmRegistration" action="../DRegistrationServlet" method="post">
                                <br/>
                                <div style="width: 90%;height: auto;border: solid 1px gray">
                                    <div style="width: 100%;height: auto;border-bottom:  solid 1px gray;background-color: rgb(240,240,240);height: 40px;">
                                        <h4 style="padding-top: 10px;">DOCTOR REGISTRATION FORM</h4>
                                    </div>
                                    <table>

                                        <%                                            Object object = request.getParameter("flag");
                                            if (object != null) {
                                        %>
                                        <tr style="height: 30px;color: red"><td><label>Username Already Exists !!!</label></td></tr>
                                                    <%
                                                        }
                                                    %>

                                        <tr style="height: 30px;"><td><label>FULL NAME&nbsp;:&nbsp;</label></td></tr>
                                        <tr style="height: 30px;"><td><input type="text" autofocus="" class="input" required="10" maxlength="30" minlength="3" name="full_name"></td></tr>
                                        <tr style="height: 30px;"><td><label>CONTACT NUMBER&nbsp;:&nbsp;</label></td></tr>
                                        <tr style="height: 30px;"><td><input type="text" class="input" required="" maxlength="10" minlength="3" name="contact_number"></td></tr>
                                        <tr style="height: 30px;"><td><label>EMAIL ID&nbsp;:&nbsp;</label></td></tr>
                                        <tr style="height: 30px;"><td><input type="email" class="input" required="" maxlength="30" minlength="3" name="email_id"></td></tr>
                                        <tr style="height: 30px;"><td><label>NAME OF HOME TOWN&nbsp;:&nbsp;</label></td></tr>
                                        <tr style="height: 30px;"><td><input type="text" class="input" required="" maxlength="30" minlength="3" id="answer" name="answer" placeholder="secret answer"></td></tr>
                                        <tr style="height: 30px;"><td><label>PASSWORD&nbsp;:&nbsp;</label></td></tr>
                                        <tr style="height: 30px;"><td><input type="password" class="input" required="" maxlength="30" minlength="3" name="password"></td></tr>
                                        <tr style="height: 30px;"><td><input type="submit" class="button"  required="" onclick="return validateData()" value="Register"></td></tr>
                                        <tr style="height: 30px;"><td>&nbsp;</tr>
                                    </table>
                                </div>
                            </form>
                        </div>
                    </div>
                </center>

            </div>
            <div style="clear: both"></div>
            <br/><br/>
            <div id="footer">
                <center>
                    <p style="padding: 5px;color: white">
                        <%@include file="footer.jsp" %>

                    </p>
                </center>
            </div>
        </div>
    </body>
</html>
<script>
    function validateData() {
//             
        var val1 = document.getElementById("full_name").value;
        if (val1 == "") {
            alert("Enter proper Full Name");
            document.getElementById("full_name").focus();
            return false;
        }
        var conatct = document.getElementById("contact_number").value;
        if (conatct.length < 10) {
            alert("Enter proper Contact No");
            document.getElementById("contact_number").focus();
            return false;
        }
        var email = document.getElementById("email_id").value;
        if (email == "") {
            alert("Enter proper Email EMail");
            document.getElementById("email_id").focus();
            return false;
        }
        var user = document.getElementById("password").value;
        if (user == "") {
            alert("Enter proper UserName");
            document.getElementById("password").focus();
            return false;
        }


    }
    function isNumberKey(evt)
    {
        var charCode = (evt.which) ? evt.which : event.keyCode
        if (charCode > 31 && (charCode < 48 || charCode > 57))
            return false;

        return true;
    }
</script>