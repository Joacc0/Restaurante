package restaurante;

import Modelo.*;

import Persistencia.*;

import java.time.LocalDate;

public class Restaurante {

    public static void main(String[] args) {
        
        
        
        Mesa mesa1 = new Mesa(4, 1, 1, false);
        System.out.println(mesa1.toString());
        
        MesaData mD1 = new MesaData();
        mD1.agregarMesa(mesa1);
        
        
       
       
     //  MesaData mD1 = new MesaData();
//        Mesa mesa1DIFERENTE = new Mesa(1,4, 3, 66, false);
//        mD1.actualizarMesa(mesa1DIFERENTE);
//
//
//       
//       
//        
//        Mesa mesa1cambio2 = new Mesa(1,6, 3, 3, false);
//        mD1.actualizarMesa(mesa1cambio2);

 //cargo 5 mesas más
           // Mesa mesa1 = new Mesa(2, 1, 1, false);
//            Mesa mesa2 = new Mesa(4, 1, 2, false);
//            Mesa mesa3 = new Mesa(6, 1, 3, false);
//            Mesa mesa4 = new Mesa(8, 1, 4, false);
//            Mesa mesa5 = new Mesa(10, 1, 5, false);
            
            //cargar con constructor de 2 argumentos capacidad-numMesa
            
             Mesa mesa2 = new Mesa(10, 6);
            Mesa mesa3 = new Mesa(12, 7);
            Mesa mesa4 = new Mesa(6, 8);
            Mesa mesa5 = new Mesa(4, 9);
         //   MesaData mD1 = new MesaData();
//            mD1.agregarMesa(mesa1);
            mD1.agregarMesa(mesa2);           
            mD1.agregarMesa(mesa3);
            mD1.agregarMesa(mesa4);
            mD1.agregarMesa(mesa5);   

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
//            Mesero mesero1 = new Mesero(11111111,"Ana","Lopez", false);
//            Mesero mesero2 = new Mesero(22222222,"Pedro","Garcia", false);
//            Mesero mesero3 = new Mesero(33333333,"Juan","Llopis", false);
//            Mesero mesero4 = new Mesero(44444444,"Maria","Perez", false);
//            Mesero mesero5 = new Mesero(55555555,"Laura","Olano", false);
//            
//            MeseroData mesD = new MeseroData();
//            mesD.guardarMesero(mesero1);
//            mesD.guardarMesero(mesero2);
//            mesD.guardarMesero(mesero3);
//            mesD.guardarMesero(mesero4);
//            mesD.guardarMesero(mesero5);
            
//            mesD.buscarMeseroPorIDBD(8);
//            
//            mesD.listarMeseros();
//            
//          
//            
//            mesD.listarMeseros();
////          
////            //cargo 6 productos
//            Producto pro1=new Producto("coca", "de litro", 33, "bebidas", 24, false);
//            Producto pro2=new Producto("agua", "de medio", 5, "bebidas", 30, false);
//            Producto pro3=new Producto("cerveza", "latita", 80, "bebidas", 15, false);
//            Producto pro4=new Producto("alfajor", "chocolate", 6, "postre", 6, false);
//            Producto pro5=new Producto("helado", "frutilla", 10, "portre", 8, false);
//            Producto pro6=new Producto("sopa", "de verduras", 10, "comidas", 20, false);
////            
//            ProductoData productoD=new  ProductoData();
//            productoD.guardarProducto(pro1);
//            productoD.guardarProducto(pro2);
//            productoD.guardarProducto(pro3);
//            productoD.guardarProducto(pro4);
//       
//            pd.guardarProducto(pro5);
//            pd.guardarProducto(pro6);
//            
//            pd.buscarProductoPorIDBD(4);
//            pd.listarProductos();
//            
//            
//                                PEDIDO

//     MeseroData meseroData = new MeseroData();
//     MesaData mesaData = new MesaData();
//     PedidoData pedidoData= new PedidoData();
//
//    Mesa unaMesa = mesaData.buscarMesaPorIDBD(4);
//
//    System.out.println("mesa es: "+ unaMesa.toString());
//
//    Mesero unMesero = meseroData.buscarMeseroPorIDBD(9);
//
//    System.out.println("mesero es: "+ unMesero.toString());
//
//
//
//    Pedido pedido= new Pedido(unaMesa, unMesero);
//
//    System.out.println("pedido= "+pedido.toString());
//
//    pedidoData.guardarPedido(pedido);
//
//    pedidoData.cobrarPedido(1);
//    pedido= pedidoData.buscarPedidoPorIDBD(2);
//    pedidoData.cobrarPedido(pedido);
//
//
//
//                                //DETALLE
//
//          ProductoData productoData= new  ProductoData();
//          PedidoData pedidoData= new PedidoData();
//          DetalleData detalleData= new DetalleData();
//          
//          Producto unProducto= productoData.buscarProductoPorIDBD(1);
//          System.out.println("producto es: "+ unProducto.toString());
//          
//          Pedido unPedido= pedidoData.buscarPedidoPorIDBD(1);
//          System.out.println("pedido es: "+ unPedido.toString());
//          
//          int cantidad=5; 
//          Detalle detalle= new Detalle(unProducto,cantidad,unPedido);
////          System.out.println("detalle es: "+ detalle.toString());
////          System.out.println("AHORA GUARDAR");
//          detalleData.guardarDetalle(detalle);
//          System.out.println("detalle desde JAVA"+ detalle.toString());
//          System.out.println("imprimo mismo detalle trayendo de BD"+ detalleData.buscarDetallePorIDBD(4).toString());
//          
//          
//          //probando los constructores de detalle
//         Detalle constructor1= new Detalle(unProducto, 3, unPedido, 50, false); //la idea es q el importe cantidad x precio se calcule sola
//          System.out.println("detalle es: "+ constructor1.toString());
//          System.out.println("AHORA GUARDAR");
//          detalleData.guardarDetalle(constructor1);
//
//            Detalle constructor2= new Detalle(unProducto, 2, unPedido);
//          System.out.println("detalle es: "+ constructor2.toString());
//          System.out.println("AHORA GUARDAR");
//          detalleData.guardarDetalle(constructor2);
//
//
////
//            Producto producto2= productoData.buscarProductoPorIDBD(2);
//             System.out.println("producto es: "+ producto2.toString());
//          
//            Pedido pedido2= pedidoData.buscarPedidoPorIDBD(2);
//            System.out.println("pedido es: "+ pedido2.toString());
//            Detalle nuevoDetalle= new Detalle(producto2, 4, pedido2);
//          System.out.println("detalle es: "+ nuevoDetalle.toString());
//           
//          detalleData.guardarDetalle(nuevoDetalle);
//          
          //tiene sout en el metodo
//          detalleData.listarDetalles();
          
//          detalleData.listarDetallesDeUnPedido(2);
          
//          System.out.println("el total a pagar en el pedido 1 es: "+
//                  detalleData.sumarSubtotalesDeUnPedido(1));


    }
    
}
