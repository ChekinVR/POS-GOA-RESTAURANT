package Modelo;

public class Platos {
    private int id;
    private String nombre;
    private double precio;
    private String fecha;
    private String categoria;
    private String subcategoria;

    public Platos() {
    }

    public Platos(int id, String nombre, double precio, String fecha, String categoria, String subcategoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getSubCategoria(){
        return subcategoria;
    }
    
    public void setSubCategoria(String subcategoria){
        this.subcategoria = subcategoria;
    }

    
    
    
}
