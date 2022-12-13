package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PlatosDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps,ps2;
    ResultSet rs;

    public boolean Registrar(Platos pla) {
        String sql = "INSERT INTO platos (nombre, precio, fecha, categoria, sub_categoria) VALUES (?,?,?,?,?)";
        String sql2 = "ALTER TABLE platos AUTO_INCREMENT = 0";
        try {
            con = cn.getConnection();
            ps2 = con.prepareStatement(sql2);
            ps2.execute();
            ps = con.prepareStatement(sql);
            ps.setString(1, pla.getNombre());
            ps.setDouble(2, pla.getPrecio());
            ps.setString(3, pla.getFecha());
            ps.setString(4, pla.getCategoria());
            ps.setString(5, pla.getSubCategoria());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public List ListarCateg(String valor, String fecha) {
        List<Platos> Lista = new ArrayList();
        String sql = "SELECT * FROM platos";
        String consulta = "SELECT * FROM platos WHERE categoria LIKE '%"+valor+"%'";
        try {
            con = cn.getConnection();
            if(valor.equalsIgnoreCase("")){
                ps = con.prepareStatement(sql);
            }else{
                ps = con.prepareStatement(consulta);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Platos pl = new Platos();
                pl.setId(rs.getInt("id"));
                pl.setNombre(rs.getString("nombre"));
                pl.setPrecio(rs.getDouble("precio"));
                pl.setCategoria(rs.getString("categoria"));
                pl.setSubCategoria(rs.getString("sub_categoria"));
                
                Lista.add(pl);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
        
        return Lista;
    }

    public List Listar(String valor, String fecha) {
        List<Platos> Lista = new ArrayList();
        String sql = "SELECT * FROM platos";
        String consulta = "SELECT * FROM platos WHERE nombre LIKE '%"+valor+"%'";
        try {
            con = cn.getConnection();
            if(valor.equalsIgnoreCase("")){
                ps = con.prepareStatement(sql);
            }else{
                ps = con.prepareStatement(consulta);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Platos pl = new Platos();
                pl.setId(rs.getInt("id"));
                pl.setNombre(rs.getString("nombre"));
                pl.setPrecio(rs.getDouble("precio"));
                pl.setCategoria(rs.getString("categoria"));
                pl.setSubCategoria(rs.getString("sub_categoria"));
                
                Lista.add(pl);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
        return Lista;
    }

    public boolean Eliminar(int id) {
        String sql = "DELETE FROM platos WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public boolean Modificar(Platos pla) {
        String sql = "UPDATE platos SET nombre=?, precio=?, categoria=?, sub_categoria=? WHERE id=?";
        String sql2 = "ALTER TABLE platos AUTO_INCREMENT = 0";
        try {
            con = cn.getConnection();
            ps2 = con.prepareStatement(sql2);
            ps2.execute();
            ps = con.prepareStatement(sql);
            ps.setString(1, pla.getNombre());
            ps.setDouble(2, pla.getPrecio());
            ps.setString(3, pla.getCategoria());
            ps.setString(4, pla.getSubCategoria());
            ps.setInt(5, pla.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

}
