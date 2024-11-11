/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Mesa;
import Modelo.Mesero;
import Modelo.Pedido;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mgts
 */
public class PedidoData {
    
//    private int idPedido;
//    private Mesa mesa;
//    private LocalDate fechaYhoraPedido;
//    private Mesero mesero;
//    private boolean cobrada; //
//    private boolean baja; // para borrado logico
    

        private Connection con = null;
        private MesaData mesaData =new MesaData();
        private MeseroData meseroData =new MeseroData();

    
    public PedidoData(){
        con = Conexion.getConexion();//ESTABLECE CONECCIÓN
        
    }

    //ALTA
    public void guardarPedido(Pedido pedido){     //damos de alta nuevo pedido ID en BD automático autoincremental
        //Date fecha= new Date();
        //java.sql.Date sqlFecha= new java.sql.Date(fecha.getTime());
        //atributos de PEDIDO en orden: (Mesa mesa, LocalDate fechaYhoraPedido, Mesero mesero, boolean cobrada, boolean baja)
        String sql="INSERT INTO pedido (idMesa,fechaYhoraPedido, idMesero, cobrada, baja)"
                + "VALUES(?,?,?,?,?)";   
//            String sql="INSERT INTO pedido (idMesa,account_date, idMesero, cobrada, baja)"
//                + "VALUES(?,?,?,?,?)";   
          try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, pedido.getMesa().getIdMesa());
        ps.setTimestamp(2, Timestamp.valueOf(pedido.getFechaYhoraPedido()));  // Conversión correcta a Timestamp
        ps.setInt(3, pedido.getMesero().getIdMesero());
        ps.setBoolean(4, pedido.isCobrada());
        ps.setBoolean(5, pedido.isBaja());

        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            pedido.setIdPedido(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Pedido guardado" + pedido.toString());
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido: " + ex.getMessage());
    }
 }
    
     //MODIFICA
    public void actualizarPedido(Pedido pedido){      //recibo pedido existente
         try {
             

             
            String sql = "UPDATE pedido SET idMesa= ?, fechaYhoraPedido= ?,idMesero= ?,cobrada= ?,baja= ? "
                    + "WHERE idPedido = ?";
           
            PreparedStatement ps = con.prepareStatement(sql);
            
           ps.setInt(1, pedido.getMesa().getIdMesa());
           ps.setTimestamp(2, Timestamp.valueOf(pedido.getFechaYhoraPedido()));  
           ps.setInt(3, pedido.getMesero().getIdMesero());
           ps.setBoolean(4, pedido.isCobrada());
           ps.setBoolean(5,pedido.isBaja());//baja=false
           ps.setInt(6, pedido.getIdPedido());
            
            int exitoFila = ps.executeUpdate();
            
            if (exitoFila ==1) {
                JOptionPane.showMessageDialog(null, "pedido Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de pedido p/actualizarPedido"+ex.getMessage());
        }  
    }

   //BAJA PEDIDO BAJA LÓGICA
   public void eliminarPedido(int id){
        try{
            String sql = "UPDATE pedido SET baja = 1 WHERE idPedido = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
               JOptionPane.showMessageDialog(null,"Se eliminó el pedido");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error no se pudo eliminar el pedido "+ex.getMessage());
        }
    }
   
   //CONSULTA PEDIDO
    
    public List<Pedido> listarPedidos(){
        List<Pedido> pedidos = new ArrayList<>();
        //ProductoData productoData = new ProductoData();
//        MesaData mesaData = new MesaData();
//        MeseroData meseroData = new MeseroData();
        
        String sql = "SELECT * FROM pedido WHERE baja = 0";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                
                //Pedido(Mesa mesa, LocalDate fechaYhoraPedido, Mesero mesero, boolean cobrada, boolean baja)
                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa= mesaData.buscarMesaPorIDBD(rs.getInt("idMesa"));
                pedido.setMesa(mesa);
                pedido.setFechaYhoraPedido(rs.getTimestamp("fechaYhoraPedido").toLocalDateTime());                
                Mesero mesero= meseroData.buscarMeseroPorIDBD(rs.getInt("idMesero"));
                pedido.setMesero(mesero);
                pedido.setCobrada(rs.getBoolean("cobrada"));
                pedido.setBaja(rs.getBoolean("baja"));
                pedidos.add(pedido);
                

//                System.out.println(pedido.toString());
                
            }
             ps.close();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido "+ ex.getMessage());
        }
        return pedidos;
    }

    public Pedido buscarPedidoPorIDBD(int id) {
       Pedido pedido = null;
//       MesaData mesaData = new MesaData();
//       MeseroData meseroData = new MeseroData();
         
        try{
            String sql = "SELECT * FROM pedido "
                    + "WHERE idPedido = ? AND baja = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                pedido = new Pedido();
                
                //Pedido(Mesa mesa, LocalDate fechaYhoraPedido, Mesero mesero, boolean cobrada, boolean baja)
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setMesa(mesaData.buscarMesaPorIDBD(rs.getInt("idMesa")));
                pedido.setFechaYhoraPedido(rs.getTimestamp("fechaYhoraPedido").toLocalDateTime());

                pedido.setMesero(meseroData.buscarMeseroPorIDBD(rs.getInt("idMesero")));
                pedido.setCobrada(rs.getBoolean("cobrada"));
                pedido.setBaja(rs.getBoolean("baja"));
                
//                //show mensaje antes de return pedido
//                JOptionPane.showMessageDialog(null,"se encontró este Pedido en buscarPedidoPorIDBD= "+pedido.toString());
                
            }else{
                JOptionPane.showMessageDialog(null, "buscarPedidoPorIDBD= No existe el Pedido con idBD: " + id);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de Pedido p/buscarPedidoePorIDBD= "+ex.getMessage());
        }
        
        return pedido;
    }
    
                    //  COBRAR PEDIDO
    public void cobrarPedido(Pedido pedido){      //recibo pedido existente
         try {
                String sql = "UPDATE pedido SET cobrada= 1 WHERE idPedido = ?";//AHORA ESTÁ COBRADO EL PEDIDO
           
            PreparedStatement ps = con.prepareStatement(sql);
            
       //AHORA ESTÁ COBRADO EL PEDIDO
           
           ps.setInt(1, pedido.getIdPedido());
           
           int exitoFila = ps.executeUpdate();
            
            if (exitoFila ==1) {
                JOptionPane.showMessageDialog(null, "pedido COBRADO");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de pedido p/ COBRAR Pedido"+ex.getMessage());
        }  
    }
    
    public List<Pedido> listarPedidosPorMesero(int idMesero){
         
        List<Pedido> pedidos = new ArrayList<>();
        //ProductoData productoData = new ProductoData();
//        MesaData mesaData = new MesaData();
//        MeseroData meseroData = new MeseroData();
        int tienePedidos=0;
        
        String sql = "SELECT * FROM pedido "
                    + "WHERE idMesero = ? AND baja = 0";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idMesero);
             
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                tienePedidos++;
                //Pedido(Mesa mesa, LocalDate fechaYhoraPedido, Mesero mesero, boolean cobrada, boolean baja)
                
                Mesa mesa= mesaData.buscarMesaPorIDBD(rs.getInt("idMesa"));
                pedido.setMesa(mesa);
               pedido.setFechaYhoraPedido(rs.getTimestamp("fechaYhoraPedido").toLocalDateTime());

                Mesero mesero= meseroData.buscarMeseroPorIDBD(rs.getInt("idMesero"));
                pedido.setMesero(mesero);
                pedido.setCobrada(rs.getBoolean("cobrada"));
                pedido.setBaja(rs.getBoolean("baja"));
                pedidos.add(pedido);
                
                
                //luego se podrá comentar
                System.out.println("idMesero "+idMesero + "///" +pedido.toString());
                
            }
             ps.close();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido "+ ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, " Este Mesero tiene "+ tienePedidos+ " Pedidos ");
        return pedidos;
    }
    
//    public List<Pedido> listarPedidosPorMeseroyFecha(int idMesero, LocalDate fecha){
//         
//        List<Pedido> pedidos = new ArrayList<>();
//        //ProductoData productoData = new ProductoData();
////        MesaData mesaData = new MesaData();
////        MeseroData meseroData = new MeseroData();
//        
//        String sql = "SELECT * FROM pedido "
//                    + "WHERE idMesero = ? fechaYhoraPedido = ?, AND baja = 0";
//        try{
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1,idMesero);
//            ps.setDate(2,fecha.toLocalDate());
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Pedido pedido = new Pedido();
//                
//                //Pedido(Mesa mesa, LocalDate fechaYhoraPedido, Mesero mesero, boolean cobrada, boolean baja)
//                
//                Mesa mesa= mesaData.buscarMesaPorIDBD(rs.getInt("idMesa"));
//                pedido.setMesa(mesa);
//                pedido.setFechaYhoraPedido(rs.getDate("fechaYhoraPedido").toLocalDate());
//                Mesero mesero= meseroData.buscarMeseroPorIDBD(rs.getInt("idMesero"));
//                pedido.setMesero(mesero);
//                pedido.setCobrada(rs.getBoolean("cobrada"));
//                pedido.setBaja(rs.getBoolean("baja"));
//                pedidos.add(pedido);
//                
////                //luego se podrá comentar
////                System.out.println(pedido.toString());
//                
//            }
//             ps.close();
//        }catch(SQLException ex){
//             JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido "+ ex.getMessage());
//        }
//        return pedidos;
//    }
//       
}
