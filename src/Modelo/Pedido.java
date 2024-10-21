package Modelo;

import java.time.LocalDate;

public class Pedido {

    private int idPedido;

    private LocalDate fechaYhora;

    private Mesero mesero;

    private boolean cobrada;

    private Mesa idMesa;

    private boolean baja;

    public Pedido(int idPedido, LocalDate fechaYhora, Mesero mesero, boolean cobrada, Mesa idMesa, boolean baja) {
        this.idPedido = idPedido;
        this.fechaYhora = fechaYhora;
        this.mesero = mesero;
        this.cobrada = cobrada;
        this.idMesa = idMesa;
        this.baja = baja;
    }

    public Pedido() {
    }

    public Pedido(LocalDate fechaYhora, Mesero mesero, boolean cobrada, Mesa idMesa, boolean baja) {
        this.fechaYhora = fechaYhora;
        this.mesero = mesero;
        this.cobrada = cobrada;
        this.idMesa = idMesa;
        this.baja = baja;
    }
    
    

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDate fechaYhora) {
        this.fechaYhora = fechaYhora;
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

    public Mesa getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Mesa idMesa) {
        this.idMesa = idMesa;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }
    
    
}
