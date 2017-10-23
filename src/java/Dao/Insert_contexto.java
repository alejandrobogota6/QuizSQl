/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Vo.Contexto1;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bogotá
 */
public class Insert_contexto {

    public List<Contexto1> findAll() throws SQLException {
        List<Contexto1> departamentos = null;
        String query = "SELECT * FROM Contexto_de_Navegacion";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int id = 0;
            String nombre = null;
            int id2 = 0;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Contexto1>();
                }

                Contexto1 registro = new Contexto1();
                id = rs.getInt("Idcontexto");
                registro.setIdContexto(id);

                nombre = rs.getString("Link");
                registro.setNameContexto(nombre);

                id2 = rs.getInt("Idmodelo2");
                registro.setDesicion(id2);

                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return departamentos;
    }

    public boolean insert(Contexto1 t) throws SQLException, IOException, ClassNotFoundException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into Contexto_de_Navegacion (Idcontexto,Link,Idmodelo2) " + "values (?,?,?)";
        PreparedStatement preparedStmt = null;
        Conexion cox = new Conexion();

        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdContexto());
            preparedStmt.setString(2, t.getNameContexto());
            preparedStmt.setInt(3, cox.leer());
          

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


}
