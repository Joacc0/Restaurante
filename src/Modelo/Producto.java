package Modelo;

public class Producto {

    private int idProducto;

    private String nombreProducto;
    
    private String descripcion;

    private double precio;

    private String categoria;    

    private int stock;
    
    private boolean baja;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, String descripcion, double precio, String categoria, int stock, boolean baja) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.baja = baja;
    }

    public Producto(String nombreProducto, String descripcion, double precio, String categoria, int stock, boolean baja) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.baja = baja;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombreProducto + ", PRECIO: " + precio + ", STOCK: " + stock ;
    }
    
   
   
}
