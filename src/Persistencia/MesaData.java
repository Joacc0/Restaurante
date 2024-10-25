package Persistencia;

import Modelo.Mesa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MesaData {
    
    private Connection con = null;
    
    public MesaData(){
        con = Conexion.getConexion();
    }
    
    //ALTA
    public void guardarMesa(Mesa mesa){     //damos de alta nueva mesa ID en BD automático autoincremental
       
        //atributos de mesa en orden: (int capacidad, int estado, int numeroMesa, boolean baja)
        String sql="INSERT INTO mesa (capacidad,estadoMesa,numeroMesa,baja)"
                + "VALUES(?,?,?,?)";    
            try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, mesa.getCapacidad() );
           ps.setInt(2, mesa.getEstadoMesa());//aceptará 1, 2 o 3
           ps.setInt(3, mesa.getNumeroMesa());
           ps.setBoolean(4, mesa.isBaja());//baja=false,(damos de alta new Mesa) porque sólo ponemos baja true cuando hay borrado lógico
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           while (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesa guardada");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla mesa"+ex.getMessage());
        
    }
 }
    //MODIFICA
    public void actualizarMesa(Mesa mesa){      //recibo mesa existente
        
            String sql = "UPDATE mesa SET capacidad= ?, estadoMesa= ?,numeroMesa= ?,baja= ? "
                    + "WHERE idMesa = ?";
            try {
            PreparedStatement ps = con.prepareStatement(sql);
            
           ps.setInt(1, mesa.getCapacidad() );
           ps.setInt(2, mesa.getEstadoMesa());//aceptará 1, 2 o 3
           ps.setInt(3, mesa.getNumeroMesa());
           ps.setBoolean(4,mesa.isBaja());//baja=false
           ps.setInt(5, mesa.getIdMesa());
            
            int exitoFila = ps.executeUpdate();
            
            if (exitoFila ==1) {
                JOptionPane.showMessageDialog(null, "Mesa Modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de MESA p/actualizarMesa"+ex.getMessage());
        }  
    }
    }

    //BAJA MESA
    //CONSULTA MESA
    

