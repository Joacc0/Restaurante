package restaurante;

import Modelo.Mesa;
import Persistencia.MesaData;

public class Restaurante {

    public static void main(String[] args) {
        
        Mesa mesa1 = new Mesa(1,true,3,"derecha");
        
        MesaData controlMesa = new MesaData();
        controlMesa.guardarMesa(mesa1);
    }
    
}
