/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

 
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
public class ProductoData {
    
 
    
    private Connection con = null;
    
    public ProductoData(){
        con = Conexion.getConexion();
    }
    
    //ALTA
    public void guardarProducto(Producto producto){     //damos de alta nuevo Producto ID en BD automático autoincremental
       
        //atributos de producto en orden: (String nombre, String descripcion, double precio, String categoria, int stock, boolean baja)
        String sql="INSERT INTO producto (nombreProducto, descripcion,precio, categoria, stock, baja)"
                + "VALUES(?,?,?,?,?,?)";    
            try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           
           ps.setString(1, producto.getNombreProducto() );
           ps.setString(2, producto.getDescripcion());
           ps.setDouble(3, producto.getPrecio());
           ps.setString(4, producto.getCategoria());
           ps.setInt(5, producto.getStock());
           ps.setBoolean(6, producto.isBaja());//baja=false,(damos de alta new Mesero) porque sólo ponemos baja true cuando hay borrado lógico
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           while (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto guardado");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto"+ex.getMessage());
        
    }
 }
    
    //MODIFICA
    public void actualizarProducto(Producto producto){      //recibo producto existente
         try {
             
//        producto en orden: (String nombre, String descripcion, double precio, String categoria, int stock, boolean baja)
//        String sql="INSERT INTO producto (nombreProducto,descripcion,precio,categoria,stock,baja)"
//
//             
            String sql = "UPDATE producto SET nombreProducto= ?,descripcion= ?,precio= ?,"
                    + "categoria= ?,stock= ?,baja= ? "
                    + "WHERE idProducto = ?";
           
            PreparedStatement ps = con.prepareStatement(sql);
            
           
           ps.setString(1, producto.getNombreProducto());
           ps.setString(2, producto.getDescripcion());
           ps.setDouble(3, producto.getPrecio());
           ps.setString(4, producto.getCategoria());
           ps.setInt(5, producto.getStock());
           ps.setBoolean(6,producto.isBaja());//baja=false
           ps.setInt(7, producto.getIdProducto());
            
            int exitoFila = ps.executeUpdate();
            
            if (exitoFila ==1) {
                JOptionPane.showMessageDialog(null, "Producto Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de Producto p/actualizarProducto"+ex.getMessage());
        }  
    }
    
    
        //BAJA PRODUCTO BAJA LÓGICA
   public void eliminarProducto(int id){
        try{
            String sql = "UPDATE producto SET baja = 1 WHERE idProducto = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int filas = ps.executeUpdate();
            if (filas == 1) {
               JOptionPane.showMessageDialog(null,"Se eliminó el producto");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error no se pudo eliminar el producto "+ex.getMessage());
        }
    }


    //CONSULTA PRODUCTO
    
    //desde fuera creo que no buscaremos por ID de la BD, sino por numero de producto
 public Producto buscarProductoPorIDBD(int id){
        Producto producto = null;
        try{
            String sql = "SELECT nombreProducto,descripcion,precio,categoria,stock,baja FROM producto "
                    + "WHERE idProducto = ? AND baja = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(id);
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setStock(rs.getInt("stock"));
                producto.setBaja(rs.getBoolean("baja"));
                
                //show mensaje antes de return producto
                JOptionPane.showMessageDialog(null,"se encontró el producto en buscarProductoPorIDBD= "+producto.toString());
                
            }else{
                JOptionPane.showMessageDialog(null, "buscarProductoPorIDBD= No existe el Producto con idBD: " + id);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de Producto p/buscarProductoPorIDBD= "+ex.getMessage());
        }
        
        return producto;
    }
 
    
    //listar todas los Producto Que no estén baja=true(las de borrado lógico)
 public List<Producto> listarProductos(){
        List<Producto> productos = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM producto WHERE baja = 0 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setStock(rs.getInt("stock"));
                producto.setBaja(rs.getBoolean("baja"));
                productos.add(producto);
                
                //luego se podrá comentar
                System.out.println(producto.toString());
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto "+ ex.getMessage());
            
        }
        return productos;
        
    }
 
   
    
}
