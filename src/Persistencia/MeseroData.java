/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Mesa;
import Modelo.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mgts
 */
public class MeseroData {
    
    private Connection con = null;
    
    public MeseroData(){
        con = Conexion.getConexion();
    }
    
    //ALTA
    public void guardarMesero(Mesero mesero){     //damos de alta nueva mesero ID en BD automático autoincremental
       
        //atributos de mesero en orden: (int dni, String nombre, String apellido, boolean baja)
        String sql="INSERT INTO mesero (dni,nombre,apellido,baja)"
                + "VALUES(?,?,?,?)";    
            try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, mesero.getDni());
           ps.setString(2, mesero.getNombre() );
           ps.setString(3, mesero.getApellido());
           ps.setBoolean(4, mesero.isBaja());//baja=false,(damos de alta new Mesero) porque sólo ponemos baja true cuando hay borrado lógico
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           while (rs.next()) {
                mesero.setIdMesero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesero guardado");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla mesero"+ex.getMessage());
        
    }
 }
    //MODIFICA
    public void actualizarMesero(Mesero mesero){      //recibo mesero existente
         try {
            String sql = "UPDATE mesero SET dni= ?,nombre= ?, apellido= ?,baja= ? "
                    + "WHERE idMesero = ?";
           
            PreparedStatement ps = con.prepareStatement(sql);
            
           ps.setInt(1, mesero.getDni());
           ps.setString(2, mesero.getNombre());
           ps.setString(3,mesero.getApellido());
           ps.setBoolean(4,mesero.isBaja());//baja=false
           ps.setInt(5, mesero.getIdMesero());
            
            int exitoFila = ps.executeUpdate();
            
            if (exitoFila ==1) {
                JOptionPane.showMessageDialog(null, "Mesero Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de MESERO p/actualizarMesero"+ex.getMessage());
        }  
    }
   

    //BAJA MESERO BAJA LÓGICA por id BD
    public void eliminarMesero(int id){
        try{
            String sql = "UPDATE mesero SET baja = 1 WHERE idMesero = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
               JOptionPane.showMessageDialog(null,"Se eliminó el mesero");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error no se pudo eliminar el mesero "+ex.getMessage());
        }
    }
    //BAJA MESERO BAJA LÓGICA por id BD
    public void resucitarMesero(int id){
        try{
            String sql = "UPDATE mesero SET baja = 0 WHERE idMesero = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
               JOptionPane.showMessageDialog(null,"Se resucitó el mesero");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error no se pudo resucitar el mesero "+ex.getMessage());
        }
    }

    //CONSULTA MESERO
    
    //desde fuera creo que no buscaremos por ID de la BD, sino por numero de DNI
 public Mesero buscarMeseroPorIDBD(int id){
        Mesero mesero = null;
        try{
            String sql = "SELECT dni,nombre,apellido,baja FROM mesero "
                    + "WHERE idMesero = ? AND baja = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                mesero = new Mesero();
                mesero.setIdMesero(id);
                mesero.setDni(rs.getInt("dni"));
                mesero.setNombre(rs.getNString("nombre"));
                mesero.setApellido(rs.getNString("apellido"));
                
                mesero.setBaja(rs.getBoolean("baja"));
                
                //show mensaje antes de return mesero
                JOptionPane.showMessageDialog(null,"se encontró esta mesero en buscarMeseroPorIDBD= "+mesero.toString());
                
            }else{
                JOptionPane.showMessageDialog(null, "buscarMeseroPorIDBD= No existe el mesero con idBD: " + id);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de MESERO p/buscarMeseroPorIDBD= "+ex.getMessage());
        }
        
        return mesero;
    }
 
    //buscar mesero por el numero de DNI
  public Mesero buscarMeseroPorDNI(int dni){
        Mesero mesero = null;
        try{
            String sql = "SELECT dni,nombre,apellido,baja FROM mesero "
                    + "WHERE dni = ? AND baja = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,dni);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setDni(rs.getInt("dni"));
                mesero.setNombre(rs.getNString("nombre"));
                mesero.setApellido(rs.getNString("apellido"));
                
                mesero.setBaja(rs.getBoolean("baja"));
                
                //show mensaje antes de return mesero
                JOptionPane.showMessageDialog(null,"se encontró esta mesero en buscarMeseroPorDNI= "+mesero.toString());
                
            }else{
                JOptionPane.showMessageDialog(null, "buscarMeseroPorIDBD= No existe el mesero con DNI: " + dni);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de MESERO p/buscarMeseroPorDNI= "+ex.getMessage());
        }
        
        return mesero;
    }

 
    //listar todas las meseros Que no estén baja=true(las de borrado lógico)
 public List<Mesero> listarMeseros(){
        List<Mesero> meseros = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM mesero WHERE baja = 0 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Mesero mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setDni(rs.getInt("dni"));
                mesero.setNombre(rs.getNString("nombre"));
                mesero.setApellido(rs.getNString("apellido")); 
                mesero.setBaja(rs.getBoolean("baja"));
                meseros.add(mesero);
                
                //luego se podrá comentar
                System.out.println(mesero.toString());
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero "+ ex.getMessage());
            
        }
        return meseros;
        
    }
 
 
}
