/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_sobrecarga_areas;

/**
 *
 * @author invitado
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Area del Circulo: " + calcularArea(10));
        System.out.println("Area del Triangulo: " + calcularArea(10, 5));
        System.out.println("Area del Trapecio: " + calcularArea(15, 10, 5));
        calcularArea();
    }
    
    public static void calcularArea(){
        System.out.println("Sin argumentos");
    }
    
    // Area del Circulo
    public static double calcularArea(double r){
        return Math.PI * (r*r);
    }
    // Area del Triangulo
    public static double calcularArea(double b, double h){
        return (b*h) / 2.0;
    }
    // Area del Trapecio
    public static double calcularArea(double bmay, double bmen, double h){
        return (h*(bmay*bmen))/2.0;
    }
    
  
}
