package Modelo;

// relacion MUCHOS A MUCHOS entre PEDIDO y PRODUCTO

import java.util.Date;

// nace la clase DETALLE
public class Detalle {

    private int idDetalle;
    private Producto producto;
    private int CantidadProductos;
    private Pedido pedido;
    private double importe;
    private boolean baja;//para borrado lógico

    public Detalle() {
    }

    public Detalle(int idDetalle, Producto producto, int CantidadProductos, Pedido pedido, double importe, boolean baja) {
        this.idDetalle = idDetalle;
        this.producto = producto;
        this.CantidadProductos = CantidadProductos;
        this.pedido = pedido;
        this.importe = importe;
        this.baja = baja;
    }

    public Detalle(Producto producto, int CantidadProductos, Pedido pedido, double importe, boolean baja) {
        this.producto = producto;
        this.CantidadProductos = CantidadProductos;
        this.pedido = pedido;
        this.importe = importe;
        this.baja = baja;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadProductos() {
        return CantidadProductos;
    }

    public void setCantidadProductos(int CantidadProductos) {
        this.CantidadProductos = CantidadProductos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "Detalle{" + "idDetalle=" + idDetalle + ", producto=" + producto + ", CantidadProductos=" + CantidadProductos + ", pedido=" + pedido + ", importe=" + importe + ", baja=" + baja + '}';
    }
    
   
}
