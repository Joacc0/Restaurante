package Modelo;

import java.time.LocalDate;

public class Pedido {

    private int idPedido;
    private Mesa idMesa;
    private LocalDate fechaYhora;
    private boolean estado;
    private Double total;
    private Producto idProducto;
    private String nombre;
    private String descripcion;
    private Double precio;
    private String categoria;
    private int disponibilidad;
    private Mesero idMesero;

    public Pedido(int idPedido, Mesa idMesa, LocalDate fechaYhora, boolean estado, Double total, Producto idProducto, String nombre, String descripcion, Double precio, String categoria, int disponibilidad, Mesero idMesero) {
        this.idPedido = idPedido;
        this.idMesa = idMesa;
        this.fechaYhora = fechaYhora;
        this.estado = estado;
        this.total = total;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
        this.idMesero = idMesero;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Mesa idMesa) {
        this.idMesa = idMesa;
    }

    public LocalDate getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDate fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Mesero getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(Mesero idMesero) {
        this.idMesero = idMesero;
    }

 

    
}
