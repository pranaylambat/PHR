<%@ page import="java.io.*"%>
<%@page import="java.awt.*" %>
<%@page import="java.util.*" %>

<%
    String saveFile = "";
    try {
//        String fileUplaodPath = "D:\\EEW PROJECTS\\PROJECTS_BE\\BE 2014\\NAGPUR-BCCE-ROSHAN-MEHAR-HELTH-SECTIR\\NETBEANS\\PHR\\upload\\";
        String fileUplaodPath = "D:\\full documets 2015\\ROSHAN MEHAR NAGP-BCCE\\New folder\\PHR\\web\\upload\\";

        String contentType = request.getContentType();
        if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {
            DataInputStream in = new DataInputStream(request.getInputStream());
            int formDataLength = request.getContentLength();
            byte dataBytes[] = new byte[formDataLength];
            int byteRead = 0;
            int totalBytesRead = 0;
            while (totalBytesRead < formDataLength) {
                byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
                totalBytesRead += byteRead;
            }
            String file = new String(dataBytes);
            saveFile = file.substring(file.indexOf("filename=\"") + 10);
            saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
            saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1, saveFile.indexOf("\""));
            int lastIndex = contentType.lastIndexOf("=");
            String boundary = contentType.substring(lastIndex + 1, contentType.length());
            int pos;
            pos = file.indexOf("filename=\"");
            pos = file.indexOf("\n", pos) + 1;
            pos = file.indexOf("\n", pos) + 1;
            pos = file.indexOf("\n", pos) + 1;
            int boundaryLocation = file.indexOf(boundary, pos) - 4;
            int startPos = ((file.substring(0, pos)).getBytes()).length;
            int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;

            saveFile = fileUplaodPath + saveFile;
            out.print(saveFile);

            int last = saveFile.lastIndexOf("\\");
            String fileUpload = saveFile.substring(last, saveFile.length());

            request.getSession().setAttribute("uploadedFile", fileUpload);
            File ff = new File(saveFile);
            FileOutputStream fileOut = new FileOutputStream(ff);
            fileOut.write(dataBytes, startPos, (endPos - startPos));
            fileOut.flush();
            fileOut.close();
            response.sendRedirect("choosedoctor.jsp");
        }
    } catch (Exception e) {
        response.sendRedirect("choosedoctor.jsp");
    }
%>
