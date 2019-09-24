<%@ page import="com.main.services.*"%>
<%@ page import="java.io.*"%>
<%@page import="java.awt.*" %>
<%@page import="java.util.*" %>

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
                        <h2>Welcome to Personal Health Record</h2>
                        <br>
                        <div style="width: 85%;float: right;margin-right: 30px;">
                            <table border="1" style="border-collapse: collapse;width: 100%;font-family: verdana;font-size: 13px;">
                                <tr id="tr" style="text-align: center">
                                    <th id="th">Download</th>
                                    <th id="th">Doctor Name</th>
                                    <th id="th">File Path</th>
                                </tr>
                                <%                                    ArrayList<DoctorDTO> arrayList = DoctorService.getDataListId(request.getSession().getAttribute("paitentprimary").toString());
                                    for (DoctorDTO dTO : arrayList) {
                                %>
                                <tr id="tr"  style="text-align: center">
                                    <td style="width: 80px;">
                                        <a  href="../upload/<%=dTO.getFilePath()%>" style="font-weight: normal;font-size: 12px;color: blue" target="_blank">download</a>
                                    </td>
                                    <td style="width: 180px;"><%=dTO.getDoctorName()%></td>
                                    <td>
                                        <p style="padding: 10px;font-size: 12px;">    <%=dTO.getFilePath()%></p>
                                    </td>
                                </tr>
                                <%     }%>
                            </table>
                        </div>

                    </center>
                </div>
                <div style="clear: both"></div>
                <!------------------------- START CODE FROM HERE  ------------------------------->



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




