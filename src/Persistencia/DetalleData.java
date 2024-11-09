/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Detalle;
import Modelo.Pedido;
import Modelo.Producto;
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
public class DetalleData {
    
     private Connection con = null;
    
    public DetalleData(){
        con = Conexion.getConexion();
    }
    
    //ALTA
    //INSERT INTO `detalle`(`idDetalle`, `idProducto`, `cantidadProductos`, `idPedido`, `importe`, `baja`)
    //VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')
    public void guardarDetalle(Detalle detalle){     //damos de alta nuevo detalle ID en BD automático autoincremental
       
        //atributos de detalle en orden: (Producto producto, int cantidadProductos, Pedido pedido, double importe, boolean baja)
        String sql="INSERT INTO detalle (idProducto,cantidadProductos,idPedido,importe,baja)"
                + "VALUES(?,?,?,?,?)";    
            try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, detalle.getProducto().getIdProducto());
           ps.setInt(2, detalle.getCantidadProductos());
           ps.setInt(3, detalle.getPedido().getIdPedido());
           ps.setDouble(4, detalle.getImporte());
           ps.setBoolean(5, detalle.isBaja());//baja=false,(damos de alta new DETALLE) porque sólo ponemos baja true cuando hay borrado lógico
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           while (rs.next()) {
                detalle.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle guardado");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla detalle"+ex.getMessage());
        
    }
 }
    
    //MODIFICA
    public void actualizarDetalle(Detalle detalle){      //recibo detalle existente
         try {
             

             
            String sql = "UPDATE detalle SET idProducto= ?, cantidadProductos= ?,idPedido= ?,importe= ?,baja= ? "
                    + "WHERE idMesa = ?";
           
            PreparedStatement ps = con.prepareStatement(sql);
            
           ps.setInt(1, detalle.getProducto().getIdProducto());
           ps.setInt(2, detalle.getCantidadProductos());
           ps.setInt(3, detalle.getPedido().getIdPedido());
           ps.setDouble(4, detalle.getImporte());
           ps.setBoolean(5,detalle.isBaja());//baja=false
           ps.setInt(6, detalle.getIdDetalle());
            
            int exitoFila = ps.executeUpdate();
            
            if (exitoFila ==1) {
                JOptionPane.showMessageDialog(null, "Detalle Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de DETALLE p/actualizarDetalle"+ex.getMessage());
        }  
    }
    
    
    //BAJA DETALLE BAJA LÓGICA
   public void eliminarDetalle(int id){
        try{
            String sql = "UPDATE detalle SET baja = 1 WHERE idDetalle = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
               JOptionPane.showMessageDialog(null,"Se eliminó el detalle");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error no se pudo eliminar el detalle "+ex.getMessage());
        }
    }

//CONSULTA DETALLE
    
 public List<Detalle> listarDetalles(){
        List<Detalle> detalles = new ArrayList<>();
        ProductoData productoData = new ProductoData();
        PedidoData pedidoData = new PedidoData();
        String sql = "SELECT * FROM detalle WHERE baja = 0"; 
        //(idProducto,cantidadProductos,idPedido,importe,baja)
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Detalle detalle = new Detalle();
                
                //(Producto producto, int cantidadProductos, Pedido pedido, double importe, boolean baja)
                
                detalle.setIdDetalle(rs.getInt("idDetalle"));
                
                detalle.setProducto(productoData.buscarProductoPorIDBD(rs.getInt("idProducto")));
                detalle.setCantidadProductos(rs.getInt("cantidadProductos"));
                
                detalle.setPedido(pedidoData.buscarPedidoPorIDBD(rs.getInt("idPedido")));
                detalle.setImporte(rs.getDouble("importe"));
                detalle.setBaja(rs.getBoolean("baja"));
                detalles.add(detalle);
                
               
                //luego se podrá comentar
                System.out.println(detalle.toString());
                
            }
             ps.close();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Detalle "+ ex.getMessage());
        }
        return detalles;
    }
       
    //busquda de 1 detalle
 
 public Detalle buscarDetallePorIDBD(int id){
        Detalle detalle = null;
        ProductoData productoData = new ProductoData();
        PedidoData pedidoData = new PedidoData();
        try{
            String sql = "SELECT * FROM detalle "
                    + "WHERE idDetalle = ? AND baja = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                detalle = new Detalle();
                detalle.setIdDetalle(rs.getInt("idDetalle"));
                Producto producto = productoData.buscarProductoPorIDBD(rs.getInt("idProducto"));
                detalle.setProducto(producto);
                detalle.setCantidadProductos(rs.getInt("cantidadProductos"));
                Pedido pedido = pedidoData.buscarPedidoPorIDBD(rs.getInt("idPedido"));
                detalle.setPedido(pedido);
                detalle.setImporte(rs.getDouble("importe"));
                detalle.setBaja(rs.getBoolean("baja"));
                
                
                
                //show mensaje antes de return detalle
                JOptionPane.showMessageDialog(null,"se encontró esta detalle en buscarDetallePorIDBD= "+detalle.toString());
                
            }else{
                JOptionPane.showMessageDialog(null, "buscarDetallePorIDBD= No existe el Detalle con idBD: " + id);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de Detalle p/buscarDetallePorIDBD= "+ex.getMessage());
        }
        
        return detalle;
    }
}
