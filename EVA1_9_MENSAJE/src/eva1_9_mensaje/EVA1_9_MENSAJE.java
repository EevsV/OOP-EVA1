/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_mensaje;

/**
 *
 * @author invitado
 */
public class EVA1_9_MENSAJE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nPrintln("bruh", 5);
    }
    
    public static void nPrintln(String message, int n){
        for (int i= 0; i < n; i++){
            System.out.println(message);
        }
    }
        
}