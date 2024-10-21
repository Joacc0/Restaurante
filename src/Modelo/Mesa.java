package Modelo;

public class Mesa {

    private int idMesa;

    private int capacidad;

    private boolean estado;

    private boolean baja;

    private int numeroMesa;

    public Mesa(int idMesa, int capacidad, boolean estado, boolean baja, int numeroMesa) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.estado = estado;
        this.baja = baja;
        this.numeroMesa = numeroMesa;
    }

    public Mesa() {
    }

    public Mesa(int capacidad, boolean estado, boolean baja, int numeroMesa) {
        this.capacidad = capacidad;
        this.estado = estado;
        this.baja = baja;
        this.numeroMesa = numeroMesa;
    }
    
    

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    
}
