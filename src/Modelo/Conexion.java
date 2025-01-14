package Modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Conexion {
    
    private static Logger logger = LoggerFactory.getLogger(Conexion.class);
    
    private static Conexion instance = null;

    private static final String URL = "jdbc:mysql://localhost:3306/restaurant_goa";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection con = null;
    
    // Constructor privado para evitar la creación de instancias fuera de esta clase
    private Conexion(){
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            logger.info("Connection was successfully");
        } catch (SQLException e){
            System.out.print(e);
        }
        
    };
    
    public static Connection getConnection(){
        if (instance == null) instance = new Conexion();
        
        return con;
    }
}