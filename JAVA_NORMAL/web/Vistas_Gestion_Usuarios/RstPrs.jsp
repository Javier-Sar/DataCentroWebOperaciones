<%-- 
    Document   : RstPrs
    Created on : 30 ago 2022, 20:39:08
    Author     : javie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Persona</title>
        <jsp:include page="PRUEBA.jsp" />
        <link href="CSS/Estilos_RstPrs.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="text-center">
            <h3>Registro de nueva persona</h3>
            <p>Para el ingreso de una nueva persona al sistema asegurese de ingresar todos
                los datos requeridos</p>
        </div>
        <div class="container">
            <form action="Procesamiento">
                <label for="fname">Nombres</label>
                <input type="text" id="fname" name="nombre" placeholder="Tu nombre ...">

                <label for="lname">Apellidos</label>
                <input type="text" id="lname" name="apellido" placeholder="Tu apellido ...">
                
                <label for="lname">Dpi</label>
                <input type="text" id="lname" name="dpi" placeholder="Tu DPI ...">
                
                <label for="lname">Dependencia</label>
                <input type="text" id="lname" name="dependencia" placeholder="Tu dependencia ...">
                
                <label for="lname">Corporativo</label>
                <input type="text" id="lname" name="corporativo" placeholder="Corporativo ...">
                

                <label for="country">Rol</label>
                <select id="country" name="rol">
                    <option value="1">ADMINISTRADOR</option>
                    <option value="2">OPERADOR</option>
                    <option value="3">USUARIO</option>
                    <option value="4">MONITOREO</option>
                </select>
                
                <label for="country">Estado</label>
                <select id="country" name="estado">
                    <option value="1">ACTIVO</option>
                    <option value="2">INACTIVO</option>
                 </select>

                 <label for="lname">Fecha</label>
                <input type="date" id="lname" name="fecha" placeholder="Fecha ...">
                
                <p></p>
                <label for="subject">Comentarios</label>
                <textarea id="subject" name="comentarios" placeholder="Comentarios (256 max)..." style="height:200px"></textarea>

                <input type="submit" value="Registrar">
            </form>
        </div>

    </body>




</html>
