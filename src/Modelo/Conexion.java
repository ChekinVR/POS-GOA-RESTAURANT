package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Conexion {

    
    private static Conexion instance;

    private static final String URL = "jdbc:mysql://localhost:3306/restaurant_goa";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection con;
    
    // Constructor privado para evitar la creación de instancias fuera de esta clase
    private Conexion(){};
    
    public static Connection getConnection(){
        if (instance == null) instance = new Conexion();
        try {
            
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}