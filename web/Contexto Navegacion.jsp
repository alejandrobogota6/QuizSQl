<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Connection"%>
<%@page import="Dao.Conexion"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Quiz</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
   

    <center>
        <p>&nbsp;</p>
        <h1>Contexto Navegacion</h1>
        
      

    </center>



    <center>
        <table >
            <tr >
                <th><strong>ID</strong></th>
                <th><strong>LINK</strong></th>

            </tr>
            <form action="Contexto" method="post"> 
            <tr >

                <td><input class="contact" type="text" name="ID" value="" /></td>
                <td><input class="contact" type="text" name="NAME" value="" /></td>
                <td ><input style="background-color: #F9F8F8" class="submit" type="submit" name="crear"  value="Crear " onClick="value = 1" > <td> 
                <td> <input style="background-color: #F9F8F8" class="submit" type="submit" name="modificar"  value="Modificar" onClick="value = 2" > <td>
                <td> <input style="background-color: #F9F8F8" class="submit" type="submit" name="eliminar"  value="Eliminar" onClick="value = 3" > <td>
            
            </form>
            </tr>


        </table>

        <p>&nbsp;</p>


        <table >
            <tr>
                <td> <a href="UnidadAbstractaInformacion.jsp"> <input style="background-color: #F9F8F8" class="submit" type="submit" name="venta_registrada" value="Crear Unidad Abstracta" /> </td>
                <td> <a href="List.jsp" ><input style="background-color: #F9F8F8" class="submit" type="submit" name="venta_registrada" value="Listar todo" /> </td>              
                
            </tr>
        </table>

    </center>




</body>
</html>
