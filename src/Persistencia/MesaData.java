package Persistencia;

import Modelo.Mesa;
import java.sql.Connection;
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
    
    public void guardarMesa(Mesa mesa){
        
        String sql = "INSERT INTO `mesa`( `numero_mesa`, `estado_mesa`, `capacidad`, `ubicacion`) VALUES (?,?,?,?)";
            
            try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, mesa.getNumeroMesa() );
           ps.setBoolean(2, true);
           ps.setInt(3, mesa.getCapacidad());
           ps.setString(4, mesa.getUbicacion());
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           while (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesa guardada");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla mesa");
        
    }
 }
    
}
