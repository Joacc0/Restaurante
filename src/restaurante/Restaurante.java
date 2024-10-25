package restaurante;

import Modelo.Mesa;
import Persistencia.MesaData;

public class Restaurante {

    public static void main(String[] args) {
        
        /*
        Mesa mesa1 = new Mesa(4, 1, 1, false);
        System.out.println(mesa1.toString());
        
        MesaData mD1 = new MesaData();
        mD1.guardarMesa(mesa1);
        */
        
        MesaData mD1 = new MesaData();
        Mesa mesa1DIFERENTE = new Mesa(1,4, 2, 1, false);
        mD1.actualizarMesa(mesa1DIFERENTE);
        
    }
    
}
