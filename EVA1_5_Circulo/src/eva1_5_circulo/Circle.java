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
public class Circle {
    private double r;
    
    public Circle(){
        r = 10;
    }
    
    public Circle(double valor){
        r = valor;
    }
    
    public void setRadio(double valor){
        r = valor;
    }
    
    public double getRadio(){
        return r;
    }
    
    public double calcularArea(){
    double a;
    a = Math.PI * (r*r);
    return a;
}
    public double calcularPeri(){
        double p;
        p = Math.PI * (r*2);
        return p;
    }
    
}
