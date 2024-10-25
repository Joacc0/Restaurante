package Modelo;

import java.util.Date;

public class Mesero {

    private int idMesero;
    private String nombre;
    private String apellido;
    private boolean baja;

    public Mesero() {
    }

    public Mesero(int idMesero, String nombre, String apellido, boolean baja) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.baja = baja;
    }

    public Mesero(String nombre, String apellido, boolean baja) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", nombre=" + nombre + ", apellido=" + apellido + ", baja=" + baja + '}';
    }

   
}
