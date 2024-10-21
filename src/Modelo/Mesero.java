package Modelo;

import java.util.Date;

public class Mesero {

    private int idMesero;
    private String nombre;
    private String apellido;
    private long telefono;
    private String correo;
    private Date fechaContratacion;

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", nombre=" + nombre + ", apellido=" + apellido + '}';
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Mesero(int idMesero, String nombre, String apellido, long telefono, String correo, Date fechaContratacion) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaContratacion = fechaContratacion;
    }
    
    
    
  

    
    
}
