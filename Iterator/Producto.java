package TallerDSTienda.Iterator;

public class Producto {

    private String id;

    private String nombre;

    private int cantidad;

    private String tienda;

    private String estado;

    public Producto(String id, String nombre, int cantidad, String tienda, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tienda = tienda;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
}
