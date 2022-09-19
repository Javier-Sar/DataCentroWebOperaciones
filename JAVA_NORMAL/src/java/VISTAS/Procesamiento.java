/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package VISTAS;

import MODELOS.Cls_Persona;
import MODELOS.Cls_Visita;
import MODELOS.Dao_Visitas;
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
@WebServlet(name = "Procesamiento", urlPatterns = {"/Procesamiento"})
public class Procesamiento extends HttpServlet {

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
            /*
            Cls_Persona p = new Cls_Persona();
            p.setNombre(request.getParameter("nombre"));
            //String nombre=  request.getParameter("nombre");
            // System.out.println(nombre);
            p.setApellido(request.getParameter("apellido"));
            //String apellido=  request.getParameter("apellido");
            //System.out.println(apellido);

            p.setDpi(request.getParameter("dpi"));
            // String dpi = request.getParameter("dpi");
            //System.out.println(dpi);
            p.setDependencia(request.getParameter("dependencia"));
            // String depencia = request.getParameter("dependencia");
            //System.out.println(depencia);

            p.setCorp(request.getParameter("corporativo"));
            //String corporativo = request.getParameter("corporativo");
            //System.out.println(corporativo);

            p.setRol(Integer.parseInt(request.getParameter("rol")));
            //  String rol = request.getParameter("rol");
            // System.out.println(rol);

            p.setEstado(Integer.parseInt(request.getParameter("estado")));
            // String estado = request.getParameter("estado");
            // System.out.println(estado);
            p.setFecha(request.getParameter("fecha"));
            //  String fecha = request.getParameter("fecha");
            // System.out.println(fecha);

            p.setComentario(request.getParameter("comentarios"));
            // String comentarios = request.getParameter("comentarios");
            // System.out.println(comentarios);

             */
           Cls_Visita c = new Cls_Visita();
            Dao_Visitas daoVisita = new Dao_Visitas();
            List<Cls_Visita> lista = new ArrayList();
            boolean resultado = false;
            String accion = request.getParameter("accion");

            switch (accion) {

                case "0":
                 try {
                    lista = daoVisita.Lst_Visitas();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Procesamiento.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.setAttribute("Visitas", lista);
                request.getRequestDispatcher("Vistas_Autorizar.jsp").forward(request, response);

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
          Cls_Visita c = new Cls_Visita();
            Dao_Visitas daoVisita = new Dao_Visitas();
            List<Cls_Visita> lista = new ArrayList();
            boolean resultado = false;
            c.setNOMBRE_RESPONSABLE(request.getParameter("nombre"));
            // String comentarios = request.getParameter("comentarios");
            // System.out.println(comentarios);
            c.setAPELLIDO_RESPONSABLE(request.getParameter("apellido"));
            c.setCORPORATIVO(request.getParameter("corporativo"));
            c.setDEPENDENCIA(request.getParameter("dependencia"));
            c.setTP_VISITA(request.getParameter("tp_visita"));
            c.setRFC_RELACIONADO(request.getParameter("rfc"));
            c.setCOMENTARIOS(request.getParameter("comentarios"));

            try {
                resultado = daoVisita.Ingresar_Visita(c);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Procesamiento.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                lista = daoVisita.Lst_Visitas();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Procesamiento.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("Visitas", lista);
            request.getRequestDispatcher("Vistas_Autorizar.jsp").forward(request, response);

        
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
