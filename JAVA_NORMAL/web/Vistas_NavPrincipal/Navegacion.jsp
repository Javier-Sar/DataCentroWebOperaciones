<%-- 
    Document   : Navegacion
    Created on : 21 ago 2022, 17:07:00
    Author     : javie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Data Centro Zona 4</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
           </head>
    <body>

        
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="Nav_Principal?accion=0" >Data Centro</a>

                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="Nav_Principal?accion=0">Inicio</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Personal <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="Nav_Principal?accion=1" id="1" name="1">Personal Registrado</a></li>
                            <li><a href="Nav_Principal?accion=2" id="2">Registrar Personal</a></li>
                            <li><a href="Nav_Principal?accion=3" id="3">Dar de baja</a></li>
                        </ul>
                    </li>
                    <li><a class="navbar-brand" href="Nav_Principal?accion=4" id="4">Asignación de Turnos</a></li>
                    <li><a class="navbar-brand" href="Nav_Principal?accion=5" id="5">Control Ingresos CF</a></li>
                </ul>

                <ul class="nav navbar-nav navbar-right">

                    <div class="dropdown">
                        <button class="btn btn-danger dropdown-toggle" type="button" data-toggle="dropdown">Cerrar Sesión
                            <span class="caret text-center"></span></button>
                        <ul class="dropdown-menu text-center">
                            <li><a class="text-center" ><img src="imagenes/sesion.jpg" alt="" width="80" height="80"/> </a></li>
                            
                            <li><a class="text-center" >${info.getUsuario()}</a></li>
                             <li><a class="text-center" >${info.getEstado()}</a></li>
                             <li><a class="text-center" >${info.getRol()}</a></li>
                            <li><a class="btn btn-danger text-center" href="login_inicial.jsp">Salir</a></li>
                        </ul>
                    </div>


                </ul>
            </div>


        </nav>



    </body>

</html>