package Modelo;

public class Mesa {

    private int idMesa;
    private int capacidad;   
    private int estado;
    private int numeroMesa;
    private String ubicacion;

    public Mesa(int idMesa, int capacidad, int estado, int numeroMesa,String ubicacion) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.estado = estado;
        this.numeroMesa = numeroMesa;
        this.ubicacion = ubicacion;
    }

    public Mesa() {
    }

    public Mesa(int capacidad, int estado, int numeroMesa, String ubicacion) {
        this.capacidad = capacidad;
        this.estado = estado;
        this.numeroMesa = numeroMesa;
        this.ubicacion = ubicacion;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    
}
