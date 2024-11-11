package Modelo;

import java.time.LocalDate;


public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private LocalDate fechaYhoraPedido;
    private Mesero mesero;
    private boolean cobrada; //
    private boolean baja; // para borrado logico

    public Pedido() {
    }

    public Pedido(int idPedido, Mesa mesa, LocalDate fechaYhoraPedido, Mesero mesero, boolean cobrada, boolean baja) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.fechaYhoraPedido = fechaYhoraPedido;
        this.mesero = mesero;
        this.cobrada = cobrada;
        this.baja = baja;
    }

    public Pedido(Mesa mesa, LocalDate fechaYhoraPedido, Mesero mesero, boolean cobrada, boolean baja) {
        this.mesa = mesa;
        this.fechaYhoraPedido = fechaYhoraPedido;
        this.mesero = mesero;
        this.cobrada = cobrada;
        this.baja = baja;
    }
    
    public Pedido(Mesa mesa, Mesero mesero) {
        this.mesa = mesa;
        this.fechaYhoraPedido = LocalDate.now();
        this.mesero = mesero;
        this.cobrada = false;
        this.baja = false;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public LocalDate getFechaYhoraPedido() {
        return fechaYhoraPedido;
    }

    public void setFechaYhoraPedido(LocalDate fechaYhoraPedido) {
        this.fechaYhoraPedido = fechaYhoraPedido;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "idPedido=" + idPedido + "/ mesa:" + mesa.getNumeroMesa() + "/ mesero:" + mesero.getNombre() + "/ cobrada:" + cobrada;
    }
    

    
}
