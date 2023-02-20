/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_circulo;

/**
 *
 * @author invitado
 */
public class EVA1_5_Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circ1 = new Circle();
        Circle circ2 = new Circle(50);
        Circle circ3 = new Circle(100);
        Circle circ4 = new Circle();
        
       
        
        System.out.println("Area: " + circ1.calcularArea());
        System.out.println("Perimetro: " + circ1.calcularPeri());
        System.out.println("---");
        
        System.out.println("Area: " + circ2.calcularArea());
        System.out.println("Perimetro: " + circ2.calcularPeri());
        System.out.println("---");
        
        System.out.println("Area: " + circ3.calcularArea());
        System.out.println("Perimetro: " + circ3.calcularPeri());
        System.out.println("---");
        
        circ4.setRadio(150);
        circ4.getRadio();
        System.out.println("Area: " + circ4.calcularArea());
        System.out.println("Perimetro: " + circ4.calcularPeri());
    }
    
}
