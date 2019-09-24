<style>

    .table{
        border-collapse: collapse;border-color: white;

    }
    .table td{
        padding: 15px;
        border-right: solid 1px white;
    }
    .table td a{
        font-size: 10px;
    }
</style>
<%
    Object object1 = request.getSession().getAttribute("docprimary");
    String doctorPrimary = "";
    if (object1 != null) {
        doctorPrimary = object1.toString();
    }

    Object object2 = request.getSession().getAttribute("paitentprimary");
    String paitentprimary = "";
    if (object2 != null) {
        paitentprimary = object2.toString();
    }

%>
<table class="table" >
    <tr >
        <td height="41" style="width: 14.28%" align="center" ><a href="index.jsp">HOME</a></td>
        <td  style="width: 14.28%"  align="center" ><a href="aboutus.jsp">ABOUT&nbsp;US</a></td>
        <td  style="width: 14.28%;"  align="center" ><a href="contactus.jsp">CONTACT&nbsp;US</a></td>
        <%            if (doctorPrimary.length() == 0 && paitentprimary.length() == 0) {
        %>
        <td  style="width: 14.28%"  align="center" ><a href="dregistration.jsp" style="color: orange">DOCTOR&nbsp;REGISTRATION</a></td>
        <!--<td  style="width: 14.28%"  align="center" ><a href="pregistration.jsp"  style="color: orange">PATIENT&nbsp;REGISTRATION</a></td>-->
        <td  style="width: 14.28%"  align="center" ><a href="dlogin.jsp" style="color: yellow">DOCTOR&nbsp;LOGIN</a></td>
        <!--<td  style="width: 14.28%"  align="center" ><a href="plogin.jsp"  style="color: yellow"> PATIENT&nbsp;LOGIN</a></td>-->
        <%
        } else if (doctorPrimary.length() != 0) {
        %>
        <td  style="width: 14.28%"  align="center" ><a href="download.jsp"  style="color: orange">DOWNLOAD&nbsp;RECORDS</a></td>
        <td  style="width: 14.28%;border-right: 0px; "   align="center"  ><a style="color: yellow" href="logout.jsp"> LOG&nbsp;OUT</a></td>
        <%
        } else if (paitentprimary.length() != 0) {
        %>
        <td  style="width: 14.28%"  align="center" ><a href="uploadfile.jsp"  style="color: orange">UPLOAD&nbsp;RECORDS</a></td>
        <td  style="width: 14.28%"  align="center" ><a href="downloadpaitent.jsp"  style="color: orange">VIEW&nbsp;RECORDS</a></td>
        <td  style="width: 14.28%;border-right: 0px; "   align="center"  ><a style="color: yellow" href="logout.jsp"> LOG&nbsp;OUT</a></td>
        <%
            }
        %>

    </tr>
</table>