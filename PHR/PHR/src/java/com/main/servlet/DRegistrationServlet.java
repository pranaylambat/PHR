/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.servlet;

import com.main.services.MySqlConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yuvraj
 */
@WebServlet(name = "DRegistrationServlet", urlPatterns = {"/DRegistrationServlet"})
public class DRegistrationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String full_name = request.getParameter("full_name");
            String contact_number = request.getParameter("contact_number");
            String email_id = request.getParameter("email_id");
            String answer = request.getParameter("answer");
            String password = request.getParameter("password");

            String insert = "INSERT INTO `dregistration` ("
                    + "`full_name`, `contact_number`, `email_id`, `answer`, `password`"
                    + ") VALUES ("
                    + "'" + full_name + "', '" + contact_number + "', '" + email_id + "', '" + answer + "', '" + password + "');";
            try {
                String loginChk = LoginProcess.checkDoctor(email_id);
                if (loginChk.trim().length() != 0) {
                    response.sendRedirect("website/dregistration.jsp?flag=false");
                } else {
                    MySqlConnection.preStateMent(insert).execute();
//                    String loginDoctor = LoginProcess.loginDoctor(email_id, password);
//                    request.getSession().setAttribute("docprimary", loginDoctor);
//                    PrintWriter out = response.getWriter();  
response.setContentType("text/html");  
out.println("<script type=\"text/javascript\">");  
out.println("alert('deadbeef');");  
out.println("</script>");
                    response.sendRedirect("index.jsp");
                }
            } catch (Exception e) {
                System.out.println("e = " + e.getMessage());
            }

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
