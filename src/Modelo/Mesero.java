package Modelo;

public class Mesero {

    private int idMesero;

    private String nombre;
    
    private boolean baja;

    public Mesero(int idMesero, String nombre, boolean baja) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.baja = baja;
    }

    public Mesero() {
    }

    public Mesero(String nombre, boolean baja) {
        this.nombre = nombre;
        this.baja = baja;
    }
    
    

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }
    
    
}
