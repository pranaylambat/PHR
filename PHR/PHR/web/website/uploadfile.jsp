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
                        <form enctype="multipart/form-data" ACTION="upload.jsp" METHOD=POST>
                            <table border="1" style="border-collapse: collapse;width: 70%;font-family: verdana;font-size: 13px;">
                                <tr id="tr" style="text-align: center">
                                    <th id="th" colspan="3">Upload File First</th>
                                </tr>
                                <tr id="tr"  style="text-align: center">
                                    <td id="tr">#</td>
                                    <td><input name="file" type="file"></td>
                                    <td><input type="submit"  value="Upload"></td>
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




