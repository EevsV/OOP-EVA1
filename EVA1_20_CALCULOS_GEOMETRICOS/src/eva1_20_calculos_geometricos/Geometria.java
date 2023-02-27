/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_calculos_geometricos;

/**
 *
 * @author invitado
 */
public class Geometria {
    // constantes
    public static final double PI = 3.1416;
    
    public static double periCirculo(double r){
        return PI * (r*2);
    }
    
    public static double areaCirculo(double r){
        return PI * (r*r);
    }
    public static double volumenEsfera(double r){
        return (4.0 / 3.0) * (PI * (r*r*r));
    }
}

