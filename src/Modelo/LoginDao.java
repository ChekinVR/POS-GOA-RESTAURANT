
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginDao {
    private static final Logger logger = LoggerFactory.getLogger(LoginDao.class);
    Connection con;
    PreparedStatement ps,ps2;
    ResultSet rs;
    
    public login log(String correo, String pass){
        login l = new login();
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND pass = ?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs= ps.executeQuery();
            if (rs.next()) {
                l.setId(rs.getInt("id"));
                l.setNombre(rs.getString("nombre"));
                l.setCorreo(rs.getString("correo"));
                l.setPass(rs.getString("pass"));
                l.setRol(rs.getString("rol"));
                
            }
        } catch (SQLException e) {
            logger.error("Op error "+ e.toString());
        }
        return l;
    }
    
    public boolean Registrar(login reg){
        String sql = "INSERT INTO usuarios (nombre, correo, pass, rol) VALUES (?,?,?,?)";
        String sql2 = "ALTER TABLE usuarios AUTO_INCREMENT = 0";
        try {
            con = Conexion.getConnection();
            ps2 = con.prepareStatement(sql2);
            ps2.execute();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getNombre());
            ps.setString(2, reg.getCorreo());
            ps.setString(3, reg.getPass());
            ps.setString(4, reg.getRol());
            ps.execute();
            return true;
        } catch (SQLException e) {
            logger.error("Op error "+ e.toString());
            return false;
        }
    }
    
    public boolean Update(login reg, int id){
        String sql = "UPDATE usuarios u SET u.nombre = ?, u.correo = ?, u.pass = ?, u.rol = ? WHERE u.id = ?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getNombre());
            ps.setString(2, reg.getCorreo());
            ps.setString(3, reg.getPass());
            ps.setString(4, reg.getRol());
            ps.setInt(5, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            logger.error(e.toString());
            return false;
        }
    }
    
    public boolean Eliminar(int id){
        String sql = "DELETE FROM usuarios WHERE usuarios.id = ?";
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
    
    public List ListarUsuarios(){
       List<login> Lista = new ArrayList();
       String sql = "SELECT * FROM usuarios";
       try {
           con = Conexion.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               login lg = new login();
               lg.setId(rs.getInt("id"));
               lg.setNombre(rs.getString("nombre"));
               lg.setCorreo(rs.getString("correo"));
               lg.setRol(rs.getString("rol"));
               Lista.add(lg);
           }
       } catch (SQLException e) {
           logger.error("Op error "+ e.toString());
       }
       return Lista;
   }
    
    public boolean ModificarDatos(Config conf){
        String sql = "UPDATE config SET ruc=?, nombre=?, telefono=?, direccion=?, mensaje=?, ImpresoraC=?, ImpresoraB=? WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, conf.getRuc());
            ps.setString(2, conf.getNombre());
            ps.setString(3, conf.getTelefono());
            ps.setString(4, conf.getDireccion());
            ps.setString(5, conf.getMensaje());
            ps.setString(6, conf.getImpresoraB());
            ps.setString(7, conf.getImpresoraC());
            ps.setInt(8, conf.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            logger.error("Op error "+ e.toString());
            return false;
        }
    }
    
    public Config datosEmpresa(){
        Config conf = new Config();
        String sql = "SELECT * FROM config";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs= ps.executeQuery();
            if (rs.next()) {
                conf.setId(rs.getInt("id"));
                conf.setRuc(rs.getString("ruc"));
                conf.setNombre(rs.getString("nombre"));
                conf.setTelefono(rs.getString("telefono"));
                conf.setDireccion(rs.getString("direccion"));
                conf.setMensaje(rs.getString("mensaje"));
                
            }
        } catch (SQLException e) {
            logger.error("Op error "+ e.toString());
        }
        return conf;
    }
}
