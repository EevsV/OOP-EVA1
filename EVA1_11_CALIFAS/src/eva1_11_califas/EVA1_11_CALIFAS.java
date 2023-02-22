/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_califas;

/**
 *
 * @author invitado
 */
public class EVA1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calificacion: 100 = " + calif(100));
        System.out.println("Calificacion: 90 = " + calif(90));
        System.out.println("Calificacion: 80 = " + calif(80));
        System.out.println("Calificacion: 75 = " + calif(75));
        System.out.println("Calificacion: 60 = " + calif(60));
    }
    
    public static char calif(int n){
        if (n > 90 && n <= 100){
            return 'A';
        }
        else if (n > 80 && n <= 90){
            return 'B';
        }
        else if (n > 70 && n <= 80){
            return 'C';
        }
        else if (n <= 70){
            return 'D';
        }
        else
            return 'N';
        }
    }
   
