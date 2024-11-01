package Modelo;

import java.util.Date;

public class Mesero {

    private int idMesero;
    private int dni;
    private String nombre;
    private String apellido;
    private boolean baja;

    public Mesero() {
    }

    public Mesero(int idMesero, int dni, String nombre, String apellido, boolean baja) {
        this.idMesero = idMesero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.baja = baja;
    }

    public Mesero(int dni, String nombre, String apellido, boolean baja) {
        this.dni = dni;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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
        return  dni + "  " + apellido.toUpperCase() + "  " + nombre.toUpperCase();
    }

    

   
}
