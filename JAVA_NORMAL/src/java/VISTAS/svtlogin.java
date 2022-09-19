/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package VISTAS;

import MODELOS.Cls_Usuarios;
import MODELOS.Cls_Valida_User;
import MODELOS.Dao_Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author javie
 */
@WebServlet(name = "svtlogin", urlPatterns = {"/svtlogin"})
public class svtlogin extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String usr = request.getParameter("usr");
            System.out.println(usr);
            String pass = request.getParameter("pass");
            System.out.println(pass);

            Dao_Usuario dao_usr = new Dao_Usuario();
            Cls_Valida_User usrr = new Cls_Valida_User();

            try {
                usrr = dao_usr.Valida_Usr(usr, pass);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(svtlogin.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("resultado" + usrr.getResultado());

            switch (usrr.getResultado()) {
                case "TRUE":
                    
                   
                    System.out.println("se vino switch case true ");
                    Cls_Usuarios info = new Cls_Usuarios();
                     {
                        try {
                            info = dao_usr.Inf_Usr(usr);
                            request.getSession().setAttribute("info", info);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(svtlogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    request.getRequestDispatcher("Vistas_Dashboard/Dashboard.jsp").forward(request, response);
                    break;

                case "FALSE":
                    System.out.println("se vino switch case false ");
                    request.getRequestDispatcher("Vistas_Dashboard/Dashboard.jsp").forward(request, response);
                    break;

            }

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
        System.out.println("logro llegar al dopost");
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
