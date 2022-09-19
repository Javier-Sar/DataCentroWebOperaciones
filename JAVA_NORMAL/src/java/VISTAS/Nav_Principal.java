/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package VISTAS;

import MODELOS.Cls_Usuarios;
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
@WebServlet(name = "Nav_Principal", urlPatterns = {"/Nav_Principal"})
public class Nav_Principal extends HttpServlet {

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

            String Act_mnu = request.getParameter("accion");

            switch (Act_mnu) {
                case "0":
                    System.out.println("se vino switch case 0 " + Act_mnu);
                    request.getRequestDispatcher("Dashboard.jsp").forward(request, response);
                    break;

                case "1":
                     System.out.println("se vino switch case 1 " + Act_mnu);
                    Dao_Usuario daoUsr = new Dao_Usuario();
                    List Lst_Usr = daoUsr.Lst_usr();
                    request.setAttribute("usuario", Lst_Usr);
                    request.getRequestDispatcher("PrsRgt.jsp").forward(request, response);
                    break;

                case "2":
                     System.out.println("se vino switch case 2 " + Act_mnu);
                    request.getRequestDispatcher("RstPrs.jsp").forward(request, response);
                    
                    break;

                case "3":
                     System.out.println("se vino switch case 3 " + Act_mnu);
                    request.getRequestDispatcher("AnularPrsn.jsp").forward(request, response);
                    
                    break;

                case "4":
                     System.out.println("se vino switch case 4 " + Act_mnu);
                    request.getRequestDispatcher("AsingTurn.jsp").forward(request, response);
                    
                    break;

                case "5":
                     System.out.println("se vino switch case 5 " + Act_mnu);
                    request.getRequestDispatcher("CtrlRfcs.jsp").forward(request, response);
                    
                    break;

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Nav_Principal.class.getName()).log(Level.SEVERE, null, ex);
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
