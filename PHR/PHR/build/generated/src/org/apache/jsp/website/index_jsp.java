package org.apache.jsp.website;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title></title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <div id=\"search\">\r\n");
      out.write("                <div id=\"search\"><img src=\"../images/header-logo.jpg\" width=\"250px;\" height=\"100px;\" style=\"margin: 4px 4px 4px 4px\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"clear: both\"></div>\r\n");
      out.write("            <div style=\"text-align: left;background-color:#525E6A;\"><span>");
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
      out.write("        <td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"pregistration.jsp\"  style=\"color: orange\">PATIENT&nbsp;REGISTRATION</a></td>\n");
      out.write("        <td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"dlogin.jsp\" style=\"color: yellow\">DOCTOR&nbsp;LOGIN</a></td>\n");
      out.write("        <td  style=\"width: 14.28%\"  align=\"center\" ><a href=\"plogin.jsp\"  style=\"color: yellow\"> PATIENT&nbsp;LOGIN</a></td>\n");
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
      out.write("            <div id=\"slider\" style=\"height: 250px;\">");
      out.write("<img src=\"../images/homo.png\" width=\"100%\" height=\"100%\" id=\"wows1_0\"/>");
      out.write("</div>\r\n");
      out.write("            <div style=\"clear: both\"></div>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <div style=\"widows: 99%;font-size: 13px;line-height: 20px;\">\r\n");
      out.write("\r\n");
      out.write("                <div style=\"padding: 10px;width: 100%\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h2>WELCOME ");
      out.print( session.getAttribute("loginName") == null ? "GUEST " : session.getAttribute("loginName").toString().toUpperCase());
      out.write(" , TO PERSONAL HEALTH RECORD</h2>\r\n");
      out.write("                        <br/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"width: 96%;float: left\">\r\n");
      out.write("                        <div >\r\n");
      out.write("                            <img src=\"../images/phrLogo.jpg\" style=\"float: left;margin-right: 10px;\"/> \r\n");
      out.write("\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <center>\r\n");
      out.write("                                <p style=\"text-align: justify\">\r\n");
      out.write("                                    A personal health record is simply a collection of information about your health.\r\n");
      out.write("                                    If you have a shot record or a box of medical papers, you already have a basic \r\n");
      out.write("                                    personal health record. And you've probably encountered the big drawback of \r\n");
      out.write("                                    paper records: You rarely have them with you when you need them.\r\n");
      out.write("                                    Electronic personal health record systems remedy that problem by making your\r\n");
      out.write("                                    personal health record accessible to you anytime via a Web-enabled device,\r\n");
      out.write("                                    such as your computer, phone or tablet.\r\n");
      out.write("                                    Personal health records are not the same as electronic health records\r\n");
      out.write("                                    or electronic medical records, which are owned and operated by doctors' offices,\r\n");
      out.write("                                    hospitals or health insurance plans. There are a growing number of doctors'\r\n");
      out.write("                                    offices using these systems, and while some practices may limit your access,\r\n");
      out.write("                                    many allow their patients to access and print their records at any time.\r\n");
      out.write("                                    Check with your doctor to find out what his or her practice's policies are\r\n");
      out.write("                                    regarding electronic health records.\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </center>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div >\r\n");
      out.write("                            <center>\r\n");
      out.write("                                <img src=\"../images/EHR_stethoputer.jpg\" style=\"float: left;margin-right: 10px;\"/> \r\n");
      out.write("                                <p style=\"line-height: 20px;\">\r\n");
      out.write("                                <h3>What information goes into a personal health record?</h3>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <p style=\"text-align: justify\">\r\n");
      out.write("                                    You decide what you put in your personal health record. In general, though, it needs to include anything that helps you and your health care providers manage your health ? starting with the basics:\r\n");
      out.write("                                    Your primary care doctor's name and phone number\r\n");
      out.write("                                    Allergies, including drug allergies\r\n");
      out.write("                                    Your medications, including dosages\r\n");
      out.write("                                    Chronic health problems, such as high blood pressure\r\n");
      out.write("                                    Major surgeries, with dates\r\n");
      out.write("                                    Living will or advance directives\r\n");
      out.write("                                    Family history\r\n");
      out.write("                                    Immunization history\r\n");
      out.write("                                    You can also add information about what you're doing to prevent disease, such as:\r\n");
      out.write("\r\n");
      out.write("                                    Results of screening tests\r\n");
      out.write("                                    Cholesterol level and blood pressure\r\n");
      out.write("                                    Exercise and dietary habits\r\n");
      out.write("                                    Health goals, such as stopping smoking or losing weight\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </center>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div >\r\n");
      out.write("                            <center>\r\n");
      out.write("\r\n");
      out.write("                                <img src=\"../images/phrecord.jpg\" style=\"float: left;margin-right: 10px;\"/> \r\n");
      out.write("                                <p style=\"line-height: 20px;\">\r\n");
      out.write("                                <h3> What are the benefits of a personal health record?</h3>\r\n");
      out.write("                                <br>\r\n");
      out.write("\r\n");
      out.write("                                <p style=\"text-align: justify\">\r\n");
      out.write("                                    Having a personal health record can be a lifesaver, literally. In an emergency you can quickly give emergency personnel vital information, such as a disease you're being treated for, previous surgeries or hospitalizations, medications you take, drug allergies, and how to contact your family doctor.\r\n");
      out.write("\r\n");
      out.write("                                    A personal health record not only allows you to share information with your care providers but also empowers you to manage your health between visits. For example, a personal health record enables you to:\r\n");
      out.write("\r\n");
      out.write("                                    Track and assess your health. Record and track your progress toward your health goals, such as lowering your cholesterol level.\r\n");
      out.write("                                    Make the most of doctor visits. Be ready with questions for your doctor and information you want to share, such as blood pressure readings since your last visit.\r\n");
      out.write("                                    Manage your health between visits. Upload and analyze data from home-monitoring devices such as a blood pressure cuff. And remind yourself of your doctor's instructions from your last appointment.\r\n");
      out.write("                                    Get organized. Track appointments, vaccinations, and preventive or screening services, such as mammograms. In fact, a recent study found that when parents used personal health records for their children, the children were more likely to get their preventive well-child checkups on time.\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </center>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"clear: both\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"clear: both\"></div>\r\n");
      out.write("            <br/><br/>\r\n");
      out.write("            <div id=\"footer\">\r\n");
      out.write("                <center>\r\n");
      out.write("                    <p style=\"padding: 5px;color: white\">\r\n");
      out.write("                        ");
      out.write("<p style=\"font-size: 13px;color: yellow\">\n");
      out.write("    PRESENT BY , ROSHAN MEHAR | VIKAS FULLUKE | PRATIK SAHU | VIVEK MOTWANI | MAYURI UGHADE\n");
      out.write("</p>\n");
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
