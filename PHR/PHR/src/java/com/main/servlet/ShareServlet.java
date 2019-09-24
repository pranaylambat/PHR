/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.servlet;

import com.main.services.DoctorService;
import com.main.services.MySqlConnection;
import com.main.services.Sendemail;
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
@WebServlet(name = "ShareServlet", urlPatterns = {"/ShareServlet"})
public class ShareServlet extends HttpServlet {

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
            String master = request.getParameter("txtMaster");
            String keypubic = request.getParameter("txtPubic");
            String keyprivate = request.getParameter("txtPrivate");
            String doctor = request.getParameter("txtDoctor");
            String filename = request.getSession().getAttribute("uploadedFile").toString();
            
            
            String paitentprimary = request.getSession().getAttribute("paitentprimary").toString();

            String insert = "INSERT INTO  `sharefile` (\n"
                    + "`master` ,\n"
                    + "`keypubic` ,\n"
                    + "`keyprivate` ,\n"
                    + "`doctor` ,\n"
                    + "`filename` ,\n"
                    + "`paitentprimary`,\n"
                    + "`review`\n"
                    + ")\n"
                    + "VALUES (\n"
                    + "'" + master + "',  '" + keypubic + "',  '" + keyprivate + "',  '" + doctor + "',  '" + filename + "',  '" + paitentprimary + "',  'N'\n"
                    + ");";
            try {
                System.out.println("insert = " + insert);
                MySqlConnection.preStateMent(insert).execute();
                String docEmailById = DoctorService.getDocEmailById(doctor);
                Sendemail.send(docEmailById, keypubic);
            } catch (Exception e) {
                System.out.println("e = " + e.getMessage());
            }
            response.sendRedirect("website/sucess.jsp");
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
