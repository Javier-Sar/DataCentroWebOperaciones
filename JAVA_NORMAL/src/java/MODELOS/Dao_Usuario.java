/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELOS;

import CONTROLADORES.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class Dao_Usuario {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int r;

    public Cls_Valida_User Valida_Usr(String usr, String pass) throws ClassNotFoundException {

        String consulta = "EXEC VALIDA_USR '" + usr + "','" + pass + "';";
        System.out.println("Consulta hacia bd: " + consulta);
        List<Cls_Valida_User> lista = new ArrayList();

        try {
            con = cn.open();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {

                Cls_Valida_User usrr = new Cls_Valida_User();
                usrr.setResultado(rs.getString("RESULTADO"));
                System.out.println("Resultado del loguin" + usrr.getResultado());

                lista.add(usrr);

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dao_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cls_Valida_User res = new Cls_Valida_User();
        res = lista.get(0);

        return res;
    }// fin de funcion valida_usr

    public List Lst_usr() throws ClassNotFoundException {

        String consulta = "SELECT U.ID, U.USUARIO, U.PASS, E.DESCRIPCION_E, P.DESCRIPCION_P from TB_USERS U,TB_EST_USER E, TB_PERFIL P\n"
                + "WHERE U.ESTADO= E.ID AND\n"
                + "U.PERFIL = P.ID";
        System.out.println("Consulta hacia bd: " + consulta);
        List<Cls_Usuarios> lista = new ArrayList();

        try {
            con = cn.open();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cls_Usuarios usr = new Cls_Usuarios();
                usr.setId(rs.getInt("ID"));
                System.out.println(usr.getId());
                usr.setUsuario(rs.getString("USUARIO"));
                System.out.println(usr.getUsuario());
                usr.setPass(rs.getString("PASS"));
                System.out.println(usr.getPass());
                usr.setRol(rs.getString("DESCRIPCION_P"));
                System.out.println(usr.getRol());
                usr.setEstado(rs.getString("DESCRIPCION_E"));
                System.out.println(usr.getEstado());
                lista.add(usr);

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dao_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;

    }/// fin de listar usuarios

    public Cls_Usuarios Inf_Usr(String usrr) throws ClassNotFoundException {

        String consulta = "SELECT U.ID, U.USUARIO, U.PASS, E.DESCRIPCION_E, P.DESCRIPCION_P from TB_USERS U,TB_EST_USER E, TB_PERFIL P\n"
                + "WHERE U.ESTADO= E.ID AND\n"
                + "U.PERFIL = P.ID AND\n"
                + "U.USUARIO ='" + usrr + "'";
        System.out.println("Consulta hacia bd: " + consulta);
        List<Cls_Usuarios> lista = new ArrayList();

        try {
            con = cn.open();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cls_Usuarios usr = new Cls_Usuarios();
                usr.setId(rs.getInt("ID"));
                System.out.println(usr.getId());
                usr.setUsuario(rs.getString("USUARIO"));
                System.out.println(usr.getUsuario());
                usr.setPass(rs.getString("PASS"));
                System.out.println(usr.getPass());
                usr.setRol(rs.getString("DESCRIPCION_P"));
                System.out.println(usr.getRol());
                usr.setEstado(rs.getString("DESCRIPCION_E"));
                System.out.println(usr.getEstado());
                lista.add(usr);

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dao_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        Cls_Usuarios res = new Cls_Usuarios();
        res = lista.get(0);

        return res;
    }//info usuarios

}
