<%-- 
    Document   : PRUEBA
    Created on : 15 sept 2022, 16:39:26
    Author     : javie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>

        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <div class="container-fluid">
                <button class="btn" type="button" data-bs-toggle="offcanvas" data-bs-target="#demo">
  <img src="bi.jpg" alt="Logo" style="width:60px;" class="rounded-pill"/>
  </button>
              
              
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="Nav_Principal?accion=0">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Nav_Principal?accion=4" id="4">Turnos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Nav_Principal?accion=5" id="5">Control Ingresos CF</a>
                        </li>  
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Personal</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="Nav_Principal?accion=1" id="1" name="1">Personal Registrado</a></li>
                                <li><a class="dropdown-item" href="Nav_Principal?accion=2" id="2">Registral Personal</a></li>
                                <li><a class="dropdown-item" href="Nav_Principal?accion=3" id="3">Dar de baja a personal</a></li>
                            </ul>
                        </li>
                       
                    </ul>
                    
                </div>
                
            </div>
            <div class="dropdown">
  <button type="button" class="btn btn-danger dropdown-toggle" data-bs-toggle="dropdown">
    Cerrar Sesion
  </button>
  <ul class="dropdown-menu">
    <li><a class="dropdown-item" href="#"></a></li>
    <li><a class="dropdown-item" href="#">Link 2</a></li>
    <li><a class="dropdown-item" href="#">Link 3</a></li>
  </ul>
</div>
        </nav>

        
        <div class="offcanvas offcanvas-start" id="demo">
  <div class="offcanvas-header">
    <h1 class="offcanvas-title">DATA CENTRO CF</h1>
    <button type="button" class="btn-close" data-bs-dismiss="offcanvas"></button>
  </div>
  <div class="offcanvas-body">
    <p>Centro de computo CF </p>
    <p>Centro de computo BRS</p>
    <br><!-- comment -->
    <br><br>
  <a class="btn btn-primary" href="Dashboard.jsp">Dashboard</a>
  </div>
</div>


 
</div>

       
    </body>
</html>

