package org.apache.jsp.website;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/website/leftmenu.jsp");
    _jspx_dependants.add("/website/slider.jsp");
    _jspx_dependants.add("/website/footer.jsp");
  }

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

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <div id=\"search\">\r\n");
      out.write("                <div id=\"search\"><img src=\"../images/header-logo.jpg\" width=\"250px;\" height=\"100px;\" style=\"margin: 4px 4px 4px 4px\"></div>\r\n");
      out.write("                <div style=\"clear: both\"></div>\r\n");
      out.write("                <div style=\"text-align: left;background-color:#525E6A;\"><span>");
      out.write("<style>\n");
      out.write("\n");
      out.write("    .table{\n");
      out.write("        border-collapse: collapse;border-color: white;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    .table td{\n");
      out.write("        padding: 15px;\n");
      out.write("        border-right: solid 1px white;\n");
      out.write("    }\n");
      out.write("    .table td a{\n");
      out.write("        font-size: 10px;\n");
      out.write("    }\n");
      out.write("</style>\n");

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


      out.write("\n");
      out.write("<table class=\"table\" >\n");
      out.write("    <tr >\n");
      out.write("        <td height=\"41\" style=\"width: 14.28%\" align=\"center\" ><a href=\"index.jsp\">HOME</a></td>\n");
      out.write("        <td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"aboutus.jsp\">ABOUT&nbsp;US</a></td>\n");
      out.write("        <td  style=\"width: 14.28%;\"  align=\"center\" ><a href=\"contactus.jsp\">CONTACT&nbsp;US</a></td>\n");
      out.write("        ");
            if (doctorPrimary.length() == 0 && paitentprimary.length() == 0) {
        
      out.write("\n");
      out.write("        <td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"dregistration.jsp\" style=\"color: orange\">DOCTOR&nbsp;REGISTRATION</a></td>\n");
      out.write("        <!--<td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"pregistration.jsp\"  style=\"color: orange\">PATIENT&nbsp;REGISTRATION</a></td>-->\n");
      out.write("        <td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"dlogin.jsp\" style=\"color: yellow\">DOCTOR&nbsp;LOGIN</a></td>\n");
      out.write("        <!--<td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"plogin.jsp\"  style=\"color: yellow\"> PATIENT&nbsp;LOGIN</a></td>-->\n");
      out.write("        ");

        } else if (doctorPrimary.length() != 0) {
        
      out.write("\n");
      out.write("        <td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"download.jsp\"  style=\"color: orange\">DOWNLOAD&nbsp;RECORDS</a></td>\n");
      out.write("        <td  style=\"width: 14.28%;border-right: 0px; \"   align=\"center\"  ><a style=\"color: yellow\" href=\"logout.jsp\"> LOG&nbsp;OUT</a></td>\n");
      out.write("        ");

        } else if (paitentprimary.length() != 0) {
        
      out.write("\n");
      out.write("        <td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"uploadfile.jsp\"  style=\"color: orange\">UPLOAD&nbsp;RECORDS</a></td>\n");
      out.write("        <td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"downloadpaitent.jsp\"  style=\"color: orange\">VIEW&nbsp;RECORDS</a></td>\n");
      out.write("        <td  style=\"width: 14.28%;border-right: 0px; \"   align=\"center\"  ><a style=\"color: yellow\" href=\"logout.jsp\"> LOG&nbsp;OUT</a></td>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("</table>");
      out.write("</span></div>\r\n");
      out.write("                <div id=\"slider\" style=\"height: 250px;\">");
      out.write("<img src=\"../images/homo.png\" width=\"100%\" height=\"100%\" id=\"wows1_0\"/>");
      out.write("</div>\r\n");
      out.write("                <div style=\"clear: both\"></div>\r\n");
      out.write("\r\n");
      out.write("                <center>\r\n");
      out.write("\r\n");
      out.write("                    <div style=\"widows: 98%;font-size: 13px;line-height: 20px;\">\r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <div style=\"float: left;width: 20%\">\r\n");
      out.write("\r\n");
      out.write("                            <div style=\"margin-bottom: 50px;float: left;width: 20%;margin-left: 20px\">\r\n");
      out.write("                                <div id=\"homediv\" align=\"middle\"><img src=\"../images/pen1.gif\" width=\"150px\" height=\"150px;\" style=\"border-radius:15px;\" align=\"middle\"></div>\r\n");
      out.write("                                <br/>\r\n");
      out.write("                                <div id=\"homediv\" align=\"middle\"><img src=\"../images/pen2.jpg\" width=\"150px\" height=\"150px;\" style=\"border-radius:15px;\" align=\"middle\"></div>\r\n");
      out.write("                                <br/>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div style=\"float: left;width: 50%\">\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <p style=\"text-align: justify\">\r\n");
      out.write("                                UpToDate provides nearly 1,500 patient education topics that facilitate \r\n");
      out.write("                                clinician-patient communication. These materials educate and promote shared \r\n");
      out.write("                                decision-making based on medical evidence, clinical recommendations, \r\n");
      out.write("                                and patient preference. Engaging patients in their medical care and treatment \r\n");
      out.write("                                decisions often reduces costs and leads to better outcomes.\r\n");
      out.write("                                UpToDate patient articles include full-color pictures, graphics,\r\n");
      out.write("                                and charts to help the reader understand his or her condition and \r\n");
      out.write("                                to reinforce key messages regarding care.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <p style=\"text-align: justify\">\r\n");
      out.write("                                A personal health record, or PHR, is a health record where health data \r\n");
      out.write("                                and information related to the care of a patient is maintained by the \r\n");
      out.write("                                patient.[1] This stands in contrast to the more widely used electronic \r\n");
      out.write("                                medical record, which is operated by institutions (such as hospitals)\r\n");
      out.write("                                and contains data entered by clinicians or billing data to support insurance\r\n");
      out.write("                                claims. The intention of a PHR is to provide a complete and accurate summary \r\n");
      out.write("                                of an individual's medical history which is accessible online. \r\n");
      out.write("                                The health data on a PHR might include patient-reported outcome data,\r\n");
      out.write("                                lab results, data from devices such as wireless electronic weighing scales \r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div style=\"float: left;width: 28%\">\r\n");
      out.write("                            <form name=\"frmRegistration\" id=\"frmRegistration\" action=\"../PRegistrationServlet\" method=\"post\">\r\n");
      out.write("                                <br/>\r\n");
      out.write("                                <div style=\"width: 90%;height: auto;border: solid 1px gray\">\r\n");
      out.write("                                    <div style=\"width: 100%;height: auto;border-bottom:  solid 1px gray;background-color: rgb(240,240,240);height: 40px;\">\r\n");
      out.write("                                        <h4 style=\"padding-top: 10px;\">PATIENT REGISTRATION FORM</h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <table>\r\n");
      out.write("                                           ");
                                            Object object = request.getParameter("flag");
                                            if (object != null) {
                                        
      out.write("\r\n");
      out.write("                                        <tr style=\"height: 30px;color: red\"><td><label> Username Already Exists !!!</label></td></tr>\r\n");
      out.write("                                                    ");

                                                        }
                                                    
      out.write("\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><label>FULL NAME&nbsp;:&nbsp;</label></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><input type=\"text\" autofocus=\"\" class=\"input\" required=\"10\" maxlength=\"30\" minlength=\"3\" id=\"full_name\" name=\"full_name\"></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><label>CONTACT NUMBER&nbsp;:&nbsp;</label></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><input type=\"text\" class=\"input\" required=\"\" maxlength=\"10\" minlength=\"3\" id=\"contact_number\" name=\"contact_number\"></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><label>EMAIL ID&nbsp;:&nbsp;</label></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><input type=\"email\" class=\"input\" required=\"\" maxlength=\"30\" minlength=\"3\" id=\"email_id\" name=\"email_id\"></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><label>NAME OF HOME TOWN&nbsp;:&nbsp;</label></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><input type=\"text\" class=\"input\" required=\"\" maxlength=\"30\" minlength=\"3\" id=\"answer\" name=\"answer\" placeholder=\"secret answer\"></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><label>PASSWORD&nbsp;:&nbsp;</label></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><input type=\"password\" class=\"input\" required=\"\" maxlength=\"30\" minlength=\"3\" id=\"password\" name=\"password\"></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td><input type=\"submit\" class=\"button\" required=\"\" value=\"Register\"></td></tr>\r\n");
      out.write("                                        <tr style=\"height: 30px;\"><td>&nbsp;</tr>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </center>\r\n");
      out.write("                <div style=\"clear: both\"></div>\r\n");
      out.write("                <br/><br/>\r\n");
      out.write("                <div id=\"footer\">\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <p style=\"padding: 5px;color: white\">\r\n");
      out.write("                            ");
      out.write("<p style=\"font-size: 13px;color: yellow\">\n");
      out.write("    PRESENT BY , Pallav Raj | Rajat Dharmic | Subrat Biswas\n");
      out.write("</p>\n");
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </center>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function validateData() {\r\n");
      out.write("//             \r\n");
      out.write("        var val1 = document.getElementById(\"full_name\").value;\r\n");
      out.write("        if (val1 == \"\") {\r\n");
      out.write("            alert(\"Enter proper Full Name\");\r\n");
      out.write("            document.getElementById(\"full_name\").focus();\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        var conatct = document.getElementById(\"contact_number\").value;\r\n");
      out.write("        if (conatct.length < 10) {\r\n");
      out.write("            alert(\"Enter proper Contact No\");\r\n");
      out.write("            document.getElementById(\"contact_number\").focus();\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        var email = document.getElementById(\"email_id\").value;\r\n");
      out.write("        if (email == \"\") {\r\n");
      out.write("            alert(\"Enter proper Email EMail\");\r\n");
      out.write("            document.getElementById(\"email_id\").focus();\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        var user = document.getElementById(\"password\").value;\r\n");
      out.write("        if (user == \"\") {\r\n");
      out.write("            alert(\"Enter proper passwords\");\r\n");
      out.write("            document.getElementById(\"password\").focus();\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    function isNumberKey(evt)\r\n");
      out.write("    {\r\n");
      out.write("        var charCode = (evt.which) ? evt.which : event.keyCode\r\n");
      out.write("        if (charCode > 31 && (charCode < 48 || charCode > 57))\r\n");
      out.write("            return false;\r\n");
      out.write("\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("</script>");
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
