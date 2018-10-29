/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author CESDEDOCLAB04
 */
public class UtilDAO {
    
    /*
    retorna uno (1) cuando la actualizacion se completa
    y
    cero (0) cuando la actualizacion falla
    */
    public int ejecutarUpdate(String query) {
        Connection c = null;
        Statement stmt = null;
        int resultado = 0;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sigc_db",
                    "postgres", "123456");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            resultado = stmt.executeUpdate(query);

            //stmt.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //System.exit(0);
        }

        return resultado;
    }

    public ResultSet ejecutarQuery(String query) {
        Connection c = null;
        Statement stmt = null;
        ResultSet resultado = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sigc_db",
                    "postgres", "123456");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            boolean resul = stmt.execute(query);

            if (resul) {
                resultado = stmt.getResultSet();
            }

            //stmt.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //System.exit(0);
        }

        return resultado;
    }

        /*
    retorna uno (1) cuando la insercion se completa
    y
    cero (0) cuando la insercion falla
    */
    public int ejecutarInsert(String query) {
        Connection c = null;
        PreparedStatement stmt = null;
        int resultado = 0;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sigc_db",
                    "postgres", "123456");
            System.out.println("Opened database successfully");

            stmt = c.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("No se pudo guardar");
            }

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                resultado = generatedKeys.getInt(1);
            }

            //stmt.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //System.exit(0);
        }

        return resultado;
    }
}
