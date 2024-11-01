package restaurante;

import Modelo.Mesa;
import Modelo.Mesero;
import Modelo.Producto;
import Persistencia.MesaData;
import Persistencia.MeseroData;
import Persistencia.ProductoData;

public class Restaurante {

    public static void main(String[] args) {
        
        
        
//        Mesa mesa1 = new Mesa(4, 1, 1, false);
//        System.out.println(mesa1.toString());
//        
//        MesaData mD1 = new MesaData();
//        mD1.guardarMesa(mesa1);
//        
//        
//       
//       
//       MesaData mD1 = new MesaData();
//        Mesa mesa1DIFERENTE = new Mesa(1,4, 3, 66, false);
//        mD1.actualizarMesa(mesa1DIFERENTE);
//
//
//       
//       
//        
//        Mesa mesa1cambio2 = new Mesa(1,6, 3, 3, false);
//        mD1.actualizarMesa(mesa1cambio2);
//
// cargo 5 mesas más
//            Mesa mesa1 = new Mesa(2, 1, 1, false);
//            Mesa mesa2 = new Mesa(4, 1, 2, false);
//            Mesa mesa3 = new Mesa(6, 1, 3, false);
//            Mesa mesa4 = new Mesa(8, 1, 4, false);
//            Mesa mesa5 = new Mesa(10, 1, 5, false);
//            
//            MesaData mD1 = new MesaData();
//            mD1.guardarMesa(mesa1);
//            mD1.guardarMesa(mesa2);           
//            mD1.guardarMesa(mesa3);
//            mD1.guardarMesa(mesa4);
//            mD1.guardarMesa(mesa5);   
//
//                MesaData mD1 = new MesaData();
//                Mesa mesa1DIFERENTE = new Mesa(1,2, 1, 0, false);
//                mD1.actualizarMesa(mesa1DIFERENTE);
//            
//            MesaData mD1 = new MesaData();
//                
//                mD1.eliminarMesa(1);//baja logica de la mesa ID 1
//                    
//                mD1.buscarMesaPorIDBD(5);
//                mD1.buscarMesaPorNumeroMesa(3);
//                mD1.listarMesas();
//
//            cargo 5 meseros 
            Mesero mesero1 = new Mesero(11111111,"Ana","Lopez", false);
            Mesero mesero2 = new Mesero(22222222,"Pedro","Garcia", false);
            Mesero mesero3 = new Mesero(33333333,"Juan","Llopis", false);
            Mesero mesero4 = new Mesero(44444444,"Maria","Perez", false);
            Mesero mesero5 = new Mesero(55555555,"Laura","Olano", false);
            
            MeseroData mesD = new MeseroData();
            mesD.guardarMesero(mesero1);
            mesD.guardarMesero(mesero2);
            mesD.guardarMesero(mesero3);
            mesD.guardarMesero(mesero4);
            mesD.guardarMesero(mesero5);
            
//            mesD.buscarMeseroPorIDBD(8);
//            
//            mesD.listarMeseros();
//            
//          
//            
//            mesD.listarMeseros();
//          
//            //cargo 6 productos
//            Producto pro1=new Producto("coca", "de litro", 33, "bebidas", 24, false);
//            Producto pro2=new Producto("agua", "de medio", 5, "bebidas", 30, false);
//            Producto pro3=new Producto("cerveza", "latita", 80, "bebidas", 15, false);
//            Producto pro4=new Producto("alfajor", "chocolate", 6, "postre", 6, false);
//            Producto pro5=new Producto("helado", "frutilla", 10, "portre", 8, false);
//            Producto pro6=new Producto("sopa", "de verduras", 10, "comidas", 20, false);
//            
//            ProductoData pd=new  ProductoData();
//            pd.guardarProducto(pro1);
//            pd.guardarProducto(pro2);
//            pd.guardarProducto(pro3);
//            pd.guardarProducto(pro4);
//            pd.guardarProducto(pro5);
//            pd.guardarProducto(pro6);
//            
//            pd.buscarProductoPorIDBD(4);
//            pd.listarProductos();
            
            
            
    }
    
}
