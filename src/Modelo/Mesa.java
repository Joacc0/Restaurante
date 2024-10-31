package Modelo;

public class Mesa {

    private int idMesa;     //autogeneradoBD
    private int capacidad;  //permite sentar X personas máximo   
    private int estadoMesa;     //1_libre 2_ocupada 3_atendida-> cuando es cobrada pasa a 1_libre
    private int numeroMesa; //número (descriptivo) introducido x mesero
    private boolean baja;

    public Mesa() {
    }

    public Mesa(int numeroMesa, int capacidad, int estadoMesa) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.estadoMesa = estadoMesa;
    }
    
    

    public Mesa(int idMesa, int capacidad, int estadoMesa, int numeroMesa, boolean baja) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.estadoMesa = estadoMesa;
        this.numeroMesa = numeroMesa;
        this.baja = baja;
    }

    public Mesa(int capacidad, int estadoMesa, int numeroMesa, boolean baja) {
        this.capacidad = capacidad;
        this.estadoMesa = estadoMesa;
        this.numeroMesa = numeroMesa;
        this.baja = baja;
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

    public int getEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(int estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", capacidad=" + capacidad + ", estadoMesa=" + estadoMesa + ", numeroMesa=" + numeroMesa + ", baja=" + baja + '}';
    }
    
}