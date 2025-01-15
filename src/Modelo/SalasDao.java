
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SalasDao {
    
    private static final Logger logger = LoggerFactory.getLogger(SalasDao.class);
    
    Connection con;
    PreparedStatement ps, ps2;
    ResultSet rs;

    public boolean RegistrarSala(Salas sl){
        String sql = "INSERT INTO salas(nombre, mesas) VALUES (?,?)";
        String sql2 = "ALTER TABLE salas AUTO_INCREMENT = 0";
        try {
           con = Conexion.getConnection();
           ps2 = con.prepareStatement(sql2);
           ps2.execute();
           ps = con.prepareStatement(sql);
           ps.setString(1, sl.getNombre());
           ps.setInt(2, sl.getMesas());
           ps.execute();
           return true;
        } catch (SQLException e) {
            logger.error("Op error "+ e.toString());
            return false;
        }
    }
    
    public List Listar(){
        List<Salas> Lista = new ArrayList();
        String sql = "SELECT * FROM salas";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Salas sl = new Salas();
                sl.setId(rs.getInt("id"));
                sl.setNombre(rs.getString("nombre"));
                sl.setMesas(rs.getInt("mesas"));
                Lista.add(sl);
            }
            
        } catch (SQLException e) {
            logger.error("Op error "+ e.toString());
        }
        return Lista;
    }
    
    public boolean Eliminar(int id){
        String sql = "DELETE FROM salas WHERE id = ? ";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            logger.error("Op error "+ e.toString());
            return false;
        }
    }
    
    public boolean Modificar(Salas sl){
        String sql = "UPDATE salas SET nombre=?, mesas=? WHERE id=?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, sl.getNombre());
            ps.setInt(2, sl.getMesas());
            ps.setInt(3, sl.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            logger.error("Op error "+ e.toString());
            return false;
        }
    }
}
