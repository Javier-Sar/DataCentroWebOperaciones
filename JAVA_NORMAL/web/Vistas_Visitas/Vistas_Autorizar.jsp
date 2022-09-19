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
                            <th scope="col">NOMBRE RESPONSABLE</th>
                            <th scope="col">APELLIDO RESPONSABLE</th>
                            <th scope="col">CORPORATIVO</th>
                            <th scope="col">DEPENDENCIA</th>
                            <th scope="col">TIPO DE VISITA</th>
                            <th scope="col">RFC RELACIONADO</th>
                            <th scope="col">COMENTARIOS</th>
                            <th scope="col">ESTATUS</th>
                            <th scope="col">ACCIONES</th>
                            </tr>
                    </thead>
                    <tbody>
                       
                        <c:forEach var="v" items="${Visitas}">
                        <tr>
                            <th scope="row">${v.getID()}</th>
                            <td>${v.getNOMBRE_RESPONSABLE()}</td>
                            <td>${v.getAPELLIDO_RESPONSABLE()}</td>
                            <td>${v.getCORPORATIVO()}</td>
                            <td>${v.getDEPENDENCIA()}</td>
                            
                            <td>${v.getTP_VISITA()}</td>
                            <td>${v.getRFC_RELACIONADO()}</td>
                            <td>${v.getCOMENTARIOS()}</td>
                            <td>${v.getCOMENTARIOS()}</td>
                            <td>
                                <a class="btn btn-warning" href="Csontrolador?menu=Productos&accion=Cargar&id=">Autorizar</a>
                                  <a class="btn btn-danger" href="Controlador?menu=Productos&accion=Eliminar&id=">Denegar</a>
                              
                                   
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
