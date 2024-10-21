package Persistencia;

import java.sql.Connection;

public class MesaData {
    
    private Connection con = null;
    
    public MesaData(){
        con = Conexion.getConexion();
    }
    
    public void actualizarMesa(){
        
    }
    
    
    
        
}
