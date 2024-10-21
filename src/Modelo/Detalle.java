package Modelo;

// relacion MUCHOS A MUCHOS entre PEDIDO y PRODUCTO

import java.util.Date;

// nace la clase DETALLE
public class Detalle {

    private int idDetalle;

    private Mesa idMesa;
    
    private String nombreCliente;
    
    private Date fechaReserva;
    
    private int CantidadPersonas;

    private boolean estado;//para borrado lógico

    public Detalle(int idDetalle, Mesa idMesa, String nombreCliente, Date fechaReserva, int CantidadPersonas, boolean estado) {
        this.idDetalle = idDetalle;
        this.idMesa = idMesa;
        this.nombreCliente = nombreCliente;
        this.fechaReserva = fechaReserva;
        this.CantidadPersonas = CantidadPersonas;
        this.estado = estado;
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

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(int CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
    
    
}
