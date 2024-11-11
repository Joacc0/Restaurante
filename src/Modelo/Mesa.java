package Modelo;

public class Mesa {

    private int idMesa;     //autogeneradoBD
    private int capacidad;  //permite sentar X personas máximo   
    private int estadoMesa;     //1_libre 2_ocupadaARRANCA UN PEDIDO 3_atendida CARGANDO DETALLES-> cuando es cobrada pasa a 1_libre
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
    
    public Mesa(int capacidad, int numeroMesa) {
        this.capacidad = capacidad;
        this.estadoMesa = 1; //TODAS LAS MESAS NACEN LIBRES
        this.numeroMesa = numeroMesa;
        this.baja = false; //TODAS LAS MESAS NACEN ACTIVAS
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
    public String imprimirSoloNumMesa() {
        return  ""+numeroMesa;
    }
    @Override
    public String toString() {
        return  "Num "+numeroMesa + " [Capacidad " + capacidad + "] [Estado " + estadoMesa+ "]";
    
    }   
}