/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_18_static;

/**
 *
 * @author invitado
 */
public class EVA_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba oof = new Prueba();
        
        oof.mensaje();
        Prueba.mensajeEstatico();
        System.out.println(Math.PI);
    }
    
}

class Prueba{
    public void mensaje(){ //sin static = solo al crear objetos
        System.out.println("die");
}
    public static void mensajeEstatico(){ //static = solo directamente de la clase
        System.out.println("die (estatico)");
    }
}

class Otra{
    
}