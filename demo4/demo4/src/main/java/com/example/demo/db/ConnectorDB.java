package com.example.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase que permite hacer consultas a la base de datos
 * 
 * @author Santos Sanchez
 */
public class ConnectorDB {
    private static Connection conn;
    private static Statement st;

    static {
         // Conexión a la base de datos
         try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/peliculas", "root", "");

            
            // Creación de un statement para ejecutar consultas
            st= conn.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error en base de datos");
        }

    }

    public static Connection getConn() {
        return conn;
    }



    public static Statement getSt() {
        return st;
    }


}
