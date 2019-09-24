
<html>
    <head>
        <link href="../css/style.css" rel="stylesheet">
        <title></title>
    </head>
    <body>
        <div id="wrapper">
            <div id="search">
                <div id="search"><img src="../images/header-logo.jpg" width="250px;" height="100px;" style="margin: 4px 4px 4px 4px">
                <center><h1>A Dynamic Cloud Computing Platform for eHealth Systems</h1></center>
                </div>
                
            </div>
            <div style="clear: both"></div>
            <div style="text-align: left;background-color:#525E6A;"><span><%@include file="leftmenu.jsp" %></span></div>
            <div id="slider" style="height: 250px;"><%@include file="slider.jsp" %></div>
            <div style="clear: both"></div>
            <br/>
            <div style="widows: 99%;font-size: 13px;line-height: 20px;">

                <div style="padding: 10px;width: 100%">
                    <div>
                        <h2>WELCOME <%= session.getAttribute("loginName") == null ? "GUEST " : session.getAttribute("loginName").toString().toUpperCase()%> , TO A Dynamic Cloud Computing Platform for eHealth Systems</h2>
                        <br/>
                    </div>
                    <div style="width: 96%;float: left">
                        <div >
                            <img src="../images/phrLogo.jpg" style="float: left;margin-right: 10px;"/> 

                            <br>
                            <center>
                                <p style="text-align: justify">
                                    A E-health system is simply a collection of information about your health.
                                    If you have a shot record or a box of medical papers, you already have a basic 
                                    personal health record. And you've probably encountered the big drawback of 
                                    paper records: You rarely have them with you when you need them.
                                    Electronic personal health record systems remedy that problem by making your
                                    personal health record accessible to you anytime via a Web-enabled device,
                                    such as your computer, phone or tablet.
                                    Personal health records are not the same as electronic health records
                                    or electronic medical records, which are owned and operated by doctors' offices,
                                    hospitals or health insurance plans. There are a growing number of doctors'
                                    offices using these systems, and while some practices may limit your access,
                                    many allow their patients to access and print their records at any time.
                                    Check with your doctor to find out what his or her practice's policies are
                                    regarding electronic health records.
                                </p>
                            </center>
                        </div>
                        <br>
                        <br>
                        <div >
                            <center>
                                <img src="../images/EHR_stethoputer.jpg" style="float: left;margin-right: 10px;"/> 
                                <p style="line-height: 20px;">
                                <h3>What information goes into a eHealth Systems record?</h3>
                                <br>
                                <p style="text-align: justify">
                                    You decide what you put in your personal health record. In general, though, it needs to include anything that helps you and your health care providers manage your health ? starting with the basics:
                                    Your primary care doctor's name and phone number
                                    Allergies, including drug allergies
                                    Your medications, including dosages
                                    Chronic health problems, such as high blood pressure
                                    Major surgeries, with dates
                                    Living will or advance directives
                                    Family history
                                    Immunization history
                                    You can also add information about what you're doing to prevent disease, such as:

                                    Results of screening tests
                                    Cholesterol level and blood pressure
                                    Exercise and dietary habits
                                    Health goals, such as stopping smoking or losing weight
                                </p>
                            </center>
                        </div>
                        <br>
                        <br>
                        <div >
                            <center>

                                <img src="../images/phrecord.jpg" style="float: left;margin-right: 10px;"/> 
                                <p style="line-height: 20px;">
                                <h3> What are the benefits of a eHealth Systems record?</h3>
                                <br>

                                <p style="text-align: justify">
                                    Having a personal health record can be a lifesaver, literally. In an emergency you can quickly give emergency personnel vital information, such as a disease you're being treated for, previous surgeries or hospitalizations, medications you take, drug allergies, and how to contact your family doctor.

                                    A personal health record not only allows you to share information with your care providers but also empowers you to manage your health between visits. For example, a personal health record enables you to:

                                    Track and assess your health. Record and track your progress toward your health goals, such as lowering your cholesterol level.
                                    Make the most of doctor visits. Be ready with questions for your doctor and information you want to share, such as blood pressure readings since your last visit.
                                    Manage your health between visits. Upload and analyze data from home-monitoring devices such as a blood pressure cuff. And remind yourself of your doctor's instructions from your last appointment.
                                    Get organized. Track appointments, vaccinations, and preventive or screening services, such as mammograms. In fact, a recent study found that when parents used personal health records for their children, the children were more likely to get their preventive well-child checkups on time.
                                </p>
                            </center>
                        </div>
                    </div>
                </div>
                <div style="clear: both"></div>
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
