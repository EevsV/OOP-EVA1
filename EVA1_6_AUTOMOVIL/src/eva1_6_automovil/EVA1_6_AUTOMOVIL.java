/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_automovil;

/**
 *
 * @author invitado
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro car1 = new Carro("Coroya","Toyota","AM0GU5",2005,"Sebastian Gardea");
        Carro car2 = new Carro("Corolla","Toyota","AM0GU4",2025,"Amon Goeth");
        
        car1.setDebt();
        car1.getDebt();
        car1.leerDatos();
        
        System.out.println("---");
        
        car2.setDebt();
        car2.getDebt();
        car2.leerDatos();
    }
    
}
