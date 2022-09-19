<%-- 
    Document   : PrsRgt
    Created on : 30 ago 2022, 20:38:53
    Author     : javie
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
                  <title>Personas Registradas</title>
        <jsp:include page="PRUEBA.jsp" />
        <link href="CSS/Estilos_PrsRst.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container justify-content-center" >
            <div class="hijo text-center">
            <h2>Personal Registrado</h2>
        
            <div class="col-md-9" >
                <table class="table table-striped" style="margin-left:auto;margin-right:auto;">
                    <thead>
                           <tr>
                            <th scope="col">ID</th>
                            <th scope="col">USUARIO</th>
                            <th scope="col">PASS</th>
                            <th scope="col">ESTADO</th>
                            <th scope="col">ROL</th>
                            </tr>
                    </thead>
                    <tbody>
                       
                        <c:forEach var="Cls_Usuarios" items="${usuario}">
                        <tr>
                            <th scope="row">${Cls_Usuarios.getId()}</th>
                            <td>${Cls_Usuarios.getUsuario()}</td>
                            <td>${Cls_Usuarios.getPass()}</td>
                            <td>${Cls_Usuarios.getEstado()}</td>
                            <td>${Cls_Usuarios.getRol()}</td>
                            <td>
                                <a class="btn btn-warning" href="Csontrolador?menu=Productos&accion=Cargar&id=">Actualizar</a>
                                  <a class="btn btn-danger" href="Controlador?menu=Productos&accion=Eliminar&id=">Eliminar</a>
                              
                                   
                            </td>
                           </tr>
                          </c:forEach>
                    </tbody>
                </table>
            </div>
            </div>
        </div>
    </body>
</html>
