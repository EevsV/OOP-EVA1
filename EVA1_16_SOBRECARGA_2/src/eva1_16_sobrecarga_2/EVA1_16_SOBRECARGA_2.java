/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_sobrecarga_2;

/**
 *
 * @author invitado
 */
public class EVA1_16_SOBRECARGA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(suma(5,10));
        System.out.println(suma(5.5,3.6));
        System.out.println(suma("deez ", "nuts"));
        suma();
    }
    
    // suma de dos numeros
    
    public static int suma(int n, int m){
        return n + m;
    }
    public static double suma(double n, double m){
        return n + m;
    }
    public static String suma(String n, String m){
        return n + m;
    }
    public static void suma(){
        System.out.println("sin argumento");
    }
    
}
