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
public class Dao_Visitas {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int r;

    public List Lst_Visitas() throws ClassNotFoundException {

        String consulta = "SELECT V.ID, V.NOMBRE_RESPONSABLE,V.APELLIDO_RESPONSABLE,V.CORPORATIVO,V.DEPENDENCIA,\n"
                + "V.TP_VISITA, V.RFC_RELACIONADO, V.COMENTARIOS, E.DESCRIPCION FROM TB_VISITA V, ESTADO_VISITA E\n"
                + "WHERE V.ESTADO = E.ID_ESTADO";
        System.out.println("Consulta hacia bd: " + consulta);
        List<Cls_Visita> lista = new ArrayList();

        try {
            con = cn.open();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cls_Visita v = new Cls_Visita();
                v.setID(rs.getInt("ID"));
                v.setNOMBRE_RESPONSABLE(rs.getString("NOMBRE_RESPONSABLE"));
                v.setAPELLIDO_RESPONSABLE(rs.getString("APELLIDO_RESPONSABLE"));
                v.setCORPORATIVO(rs.getString("CORPORATIVO"));
                v.setDEPENDENCIA(rs.getString("DEPENDENCIA"));
                v.setTP_VISITA(rs.getString("TP_VISITA"));
                v.setRFC_RELACIONADO(rs.getString("RFC_RELACIONADO"));
                v.setCOMENTARIOS(rs.getString("COMENTARIOS"));
                v.setESTADO(rs.getString("DESCRIPCION"));

                lista.add(v);

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dao_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }/// fin de listar usuarios

    public boolean Ingresar_Visita(Cls_Visita v) throws ClassNotFoundException {

        boolean res = false;

        String sentencia = "INSERT INTO TB_VISITA(NOMBRE_RESPONSABLE,"
                + "APELLIDO_RESPONSABLE,CORPORATIVO,DEPENDENCIA,TP_VISITA,"
                + "RFC_RELACIONADO,COMENTARIOS,ESTADO)\n"
                + "VALUES\n"
                + "('" + v.getNOMBRE_RESPONSABLE() + "','" + v.getAPELLIDO_RESPONSABLE() + "'"
                + ",'" + v.getCORPORATIVO() + "','" + v.getDEPENDENCIA() + "','" + v.getTP_VISITA() + "'"
                + ",'" + v.getRFC_RELACIONADO() + "','" + v.getCOMENTARIOS() + "',1)";

        //  String sentencia = "INSERT INTO usuarios (documento,nombre,correo,password,rol,estado) "
        //        + "VALUES (?,?,?,?,?,?)";
        try {
            cn.open();
            System.out.println("Query que se ejecutara" + sentencia);
            res = cn.executeSql(sentencia);
            cn.close();
            res=true;
        } catch (SQLException ex) {
            Logger.getLogger(Dao_Visitas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Dao_Visitas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }
}
