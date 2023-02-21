/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_funcion;

/**
 *
 * @author invitado
 */
public class EVA1_8_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INICIA MAIN");
        A();
        System.out.println("TERMINA MAIN");
    }
    
    public static void A(){
        System.out.println("inicia A");
        B();
        System.out.println("Termina A");
    }
    
     public static void B(){
        System.out.println("inicia B");
        
        System.out.println("Termina B");
    }
}
