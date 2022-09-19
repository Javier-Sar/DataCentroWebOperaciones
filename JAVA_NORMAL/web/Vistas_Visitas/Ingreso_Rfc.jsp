<%-- 
    Document   : Ingreso_Rfc
    Created on : 14 sept 2022, 17:22:00
    Author     : javie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRO DE INGRESO A CF</title>
        <jsp:include page="PRUEBA.jsp" />
        <link href="CSS/Estilos_RstPrs.css" rel="stylesheet" type="text/css"/>
        <script src="Javascript/newjavascript.js" type="text/javascript"></script>
        
    </head>
    <body>

        
        <div class="text-center">
            <h3>Ingreso a centro de computo CF</h3>
            <p>Para el registrar un nuevo ingreso fisico al centro de computo
                asegurese de ingresar todos
                los datos requeridos</p>
        </div>
        <div class="container">
            <div class="card text-center">
                <label for="fname">DATOS DE LA PERSONA ENCARGADA</label>
                <br>
                <br>

            </div>



            <form action="Procesamiento" method="POST" >
                <label for="fname">Nombre</label>
                <input type="text" id="fname" name="nombre" placeholder="Tu nombre ...">

                <label for="lname">Apellido</label>
                <input type="text" id="lname" name="apellido" placeholder="Tu apellido ...">

                <label for="lname">Corporativo</label>
                <input type="text" id="lname" name="corporativo" placeholder="Tu Corporativo ...">

                <label for="lname">Dependencia</label>
                <input type="text" id="lname" name="dependencia" placeholder="Tu dependencia ...">


                <label for="country">TIPO DE VISITA</label>
                <select id="country" name="tp_visita">
                    <option value="SOPORTE">SOPORTE</option>
                    <option value="TECNICO">TECNICO</option>
                    <option value="RFC">RFC</option>
                    <option value="MONITOREO">MONITOREO</option>
                </select>
                
                
                <label for="lname">RFC Relacionado</label>
                <input type="text" id="lname" name="rfc" placeholder="No RFC ...">




                <p></p>
                <label for="subject">Comentarios</label>
                <textarea id="subject" name="comentarios" placeholder="Comentarios (256 max)..." style="height:200px"></textarea>

                <input type="submit" value="Registrar" onclick="hola();">


            </form>
        </div>

        <p>

        </p>

        <div class="container">


        </div>

    </body>




</html>
