package Modelo;

// relacion MUCHOS A MUCHOS entre PEDIDO y PRODUCTO

import java.util.Date;

// nace la clase DETALLE
public class Detalle {

    private int idDetalle;
    private Producto producto;
    private int cantidadProductos;
    private Pedido pedido;
    private double importe;
    private boolean baja;//para borrado lógico

    public Detalle() {
    }

    public Detalle(int idDetalle, Producto producto, int cantidadProductos, Pedido pedido, double importe, boolean baja) {
        this.idDetalle = idDetalle;
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
        this.pedido = pedido;
        this.importe = importe;
        this.baja = baja;
    }

    

    public Detalle(Producto producto, int cantidadProductos, Pedido pedido, double importe, boolean baja) {
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
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
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
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
        return "Detalle{" + "idDetalle=" + idDetalle + ", producto=" + producto + ", cantidadProductos=" + cantidadProductos + ", pedido=" + pedido + ", importe=" + importe + ", baja=" + baja + '}';
    }
    
   
}
