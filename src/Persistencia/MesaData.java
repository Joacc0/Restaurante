package Persistencia;

import Modelo.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MesaData {
    
    private Connection con = null;
    
    public MesaData(){
        con = Conexion.getConexion();
    }
    
    //ALTA
    public void agregarMesa(Mesa mesa){     //damos de alta nueva mesa ID en BD automático autoincremental
       
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
         try {
            String sql = "UPDATE mesa SET capacidad= ?, estadoMesa= ?,numeroMesa= ?,baja= ? "
                    + "WHERE idMesa = ?";
           
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
   

    //BAJA MESA BAJA LÓGICA
    public void eliminarMesaLogica(int numeroMesa){
        try{
            String sql = "UPDATE mesa SET baja = 1 WHERE numeroMesa = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, numeroMesa);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
               JOptionPane.showMessageDialog(null,"Se dió de baja a la mesa " + numeroMesa);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error no se pudo dar de baja a la mesa "+ex.getMessage());
        }
    }
    //2= MESA OCUPADA 
    public void ocuparMesaEstado2(int numeroMesa){
        try{
            String sql = "UPDATE mesa SET estadoMesa = 2 WHERE numeroMesa = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, numeroMesa);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
               JOptionPane.showMessageDialog(null,"Se OCUPÓ la mesa " + numeroMesa);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error no se pudo OCUPAR la mesa "+ex.getMessage());
        }
    }
     //3= MESA ATENDIDA
    public void atenderMesaEstado3(int numeroMesa){
        try{
            String sql = "UPDATE mesa SET estadoMesa = 3 WHERE numeroMesa = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, numeroMesa);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
               JOptionPane.showMessageDialog(null,"ATENDEMOS la mesa " + numeroMesa);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error no se pudo ATENDER la mesa "+ex.getMessage());
        }
    }
    
    //1=  MESA LIBRE (CUANDO TODOS LOS PEDIDOS DE ESA MESA SON COBRADOS) 
    public void liberarMesaEstado1(int numeroMesa){
        try{
            String sql = "UPDATE mesa SET estadoMesa = 1 WHERE numeroMesa = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, numeroMesa);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
               JOptionPane.showMessageDialog(null,"LIBERAMOS la mesa " + numeroMesa);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error no se pudo LIBERAR la mesa "+ex.getMessage());
        }
    }
    //ELIMINAR MESA
    
    public void eliminarMesa(int numeroMesa) {
    
    try  {
        String sql = "DELETE FROM mesa WHERE numeroMesa = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setInt(1, numeroMesa);
        
        int exitoFila = ps.executeUpdate();
        
        if (exitoFila == 1) {
            JOptionPane.showMessageDialog(null, "Mesa eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la mesa.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la mesa: " + ex.getMessage());
    }
}

    //CONSULTA MESA
    
    //desde fuera creo que no buscaremos por ID de la BD, sino por numero de mesa
 public Mesa buscarMesaPorIDBD(int id){
        Mesa mesa = null;
        try{
            String sql = "SELECT capacidad,estadoMesa,numeroMesa,baja FROM mesa "
                    + "WHERE idMesa = ? AND baja = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(id);
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstadoMesa(rs.getInt("estadoMesa"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setBaja(rs.getBoolean("baja"));
                
//                //show mensaje antes de return mesa
//                JOptionPane.showMessageDialog(null,"se encontró esta mesa en buscarMesaPorIDBD= "+mesa.toString());
//                
            }else{
                JOptionPane.showMessageDialog(null, "buscarMesaPorIDBD= No existe la mesa con idBD: " + id);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de MESA p/buscarMesaPorIDBD= "+ex.getMessage());
        }
        
        return mesa;
    }
 
    //buscar mesa por el numero de mesa (si usamos objeto entero sobra con la busqueda x id
 public Mesa buscarMesaPorNumeroMesa(int numeroMesa){
        Mesa mesa = null;
        try{
            String sql = "SELECT capacidad,estadoMesa,numeroMesa,idMesa,baja FROM mesa "
                    + "WHERE numeroMesa = ? AND baja = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,numeroMesa);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstadoMesa(rs.getInt("estadoMesa"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setBaja(rs.getBoolean("baja"));
                
//                //show mensaje antes de return mesa
//                JOptionPane.showMessageDialog(null,"se encontró esta mesa en buscarMesaPorNumeroMesa= "+mesa.toString());
                
            }else{
                JOptionPane.showMessageDialog(null, "buscarMesaPorNumeroMesa= No existe la mesa con NumeroMesa: " + numeroMesa);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de MESA p/buscarMesaPorNumeroMesa= "+ex.getMessage());
        }
        
        return mesa;
    }
 
 
    //listar todas las mesas Que no estén baja=true(las de borrado lógico)
 public List<Mesa> listarMesas(){
        List<Mesa> mesas = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM mesa WHERE baja = 0 ORDER BY numeroMesa";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstadoMesa(rs.getInt("estadoMesa"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setBaja(rs.getBoolean("baja"));
                mesas.add(mesa);
                
//                //luego se podrá comentar
//                System.out.println(mesa.toString());
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa "+ ex.getMessage());
            
        }
        return mesas;
        
    }
 
 
 }