package Modelo;

// relacion MUCHOS A MUCHOS entre PEDIDO y PRODUCTO

import java.util.Date;

// nace la clase DETALLE
public class Detalle {

    private int idDetalle;

    private Mesa idMesa;
    
    private String nombreCliente;
    
    private Date fecha;
    
    private int CantidadProductos;

    private boolean baja;//para borrado lógico

    public Detalle(int idDetalle, Mesa idMesa, String nombreCliente, Date fecha, int CantidadProductos, boolean baja) {
        this.idDetalle = idDetalle;
        this.idMesa = idMesa;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.CantidadProductos = CantidadProductos;
        this.baja = baja;
    }

    public Detalle(Mesa idMesa, String nombreCliente, Date fecha, int CantidadProductos, boolean baja) {
        this.idMesa = idMesa;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.CantidadProductos = CantidadProductos;
        this.baja = baja;
    }

    public Detalle() {
    }

    
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Mesa getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Mesa idMesa) {
        this.idMesa = idMesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidadProductos() {
        return CantidadProductos;
    }

    public void setCantidadProductos(int CantidadProductos) {
        this.CantidadProductos = CantidadProductos;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

   
    
    
}
