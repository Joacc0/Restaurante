package Modelo;

public class Producto {

    private int idProducto;

    private String nombre;

    private double precio;

    private String categoria;

    private boolean estado;

    private int stock;

    public Producto(int idProducto, String nombre, double precio, String categoria, boolean estado, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.estado = estado;
        this.stock = stock;
    }

    public Producto() {
    }

    public Producto(String nombre, double precio, String categoria, boolean estado, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.estado = estado;
        this.stock = stock;
    }
    
    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
