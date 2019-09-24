<%@page import="java.awt.*" %>
<%@page import="java.util.*" %>
<%@page import="com.main.services.*" %>
<html>
    <head>
        <link href="../css/style.css" rel="stylesheet">
        <title></title>
    </head>
    <body>
        <div id="wrapper">
            <div id="search"><img src="../images/header-logo.jpg" width="250px;" height="100px;" style="margin: 4px 4px 4px 4px"></div>
            <div style="clear: both"></div>
            <div style="text-align: left;background-color:#525E6A;"><span><%@include file="leftmenu.jsp" %></span></div>
            <div id="slider" style="height: 250px;"><%@include file="slider.jsp" %></div>
            <div style="clear: both"></div>
            <div style="widows: 99%;font-size: 13px;line-height: 20px;">

                <!------------------------- START CODE FROM HERE  ------------------------------->

                <div style="padding: 10px;width: 98%;">
                    <br/>
                    <center>
                        <p style="line-height: 20px;">
                        <h2>Welcome to e-Health System Record</h2>
                        <br>
                        <form  action="../ShareServlet" method="post">
                            <table border="1" style="border-collapse: collapse;width: 70%;font-family: verdana;font-size: 13px;">
                                <tr id="tr" style="text-align: center"><th id="th" colspan="3">CHOOSE DOCTOR</th></tr>
                                <tr id="tr"  style="text-align: center">
                                    <td id="tr" style="width: 100px;">FILE NAME : </td>
                                    <td>
                                        <p style="padding: 7px;">

                                            <%                                            String string = request.getSession().getAttribute("uploadedFile").toString();
                                                out.print(string);
                                            %>
                                        </p>
                                    </td>
                                </tr>

                                <tr id="tr"  style="text-align: center">
                                    <td id="tr">MASTER KEY</td>
                                    <td><input style="width: 90%" type="text" name="txtMaster" id="txtMaster" value="<%=(System.currentTimeMillis() * 4) + "" + (System.currentTimeMillis() * 2)%>"></td>
                                </tr>
                                <tr id="tr"  style="text-align: center">
                                    <td id="tr">PUBLIC KEY</td>
                                    <td><input style="width: 90%" type="text" name="txtPubic" id="txtPubic" value="<%=(System.currentTimeMillis() * 2) + "" + (System.currentTimeMillis() * 4)%>"></td>
                                </tr>
                                <tr id="tr"  style="text-align: center">
                                    <td id="tr">PRIVATE KEY</td>
                                    <td><input style="width: 90%" type="text" name="txtPrivate" id="txtPrivate" value="<%=(System.currentTimeMillis() * 5) + "" + (System.currentTimeMillis() * 2)%>"></td>
                                </tr>

                                <tr id="tr"  style="text-align: center">
                                    <td id="tr">DOCTOR</td>
                                    <td>
                                        <select name="txtDoctor" id="txtDoctor" style="width: 90%">

                                            <%
                                                ArrayList<DoctorDTO> arrayList = DoctorService.getDocList();
                                                for (DoctorDTO dTO : arrayList) {
                                            %>
                                            <option value="<%=dTO.getDoctorId()%>"><%=dTO.getDoctorName()%></option>
                                            <%
                                                }
                                            %>

                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td align="center">
                                        <input type="submit" name="btnSubmit" value="Submit">
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </center>
                </div>
                <div style="clear: both"></div>
                <!------------------------- START CODE FROM HERE  ------------------------------->
            </div>
            <div style="clear: both"></div>
            <br/><br/>            <br/><br/>            <br/><br/>            <br/><br/>
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




