
package Modelo;

public class Config {
    private int id;
    private String ruc;
    private String nombre;
    private String telefono;
    private String direccion;
    private String mensaje;
    private String ImpresoraC;
    private String ImpresoraB;
    
    public Config(){
        
    }

    public Config(int id, String ruc, String nombre, String telefono, String direccion, String mensaje, String ImpresoraC, String ImpresoraB) {
        this.id = id;
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mensaje = mensaje;
        this.ImpresoraC = ImpresoraC;
        this.ImpresoraB = ImpresoraB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String getImpresoraC()
    {
        return ImpresoraC;
    }
    
    public void setImpresoraC(String impresoraC)
    {
        this.ImpresoraC = impresoraC;
    }
    
    public String getImpresoraB()
    {
        return ImpresoraB;
    }
    
    public void setImpresoraB(String impresoraB)
    {
        this.ImpresoraB = impresoraB;
    }
}
