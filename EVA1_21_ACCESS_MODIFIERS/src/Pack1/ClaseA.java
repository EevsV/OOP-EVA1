/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pack1;

import Pack2.ClaseE;

/**
 *
 * @author invitado
 */
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void Prueba(){
        //PUBLIC Y DEFAULT = SIN RESTRICCIONES EN EL MISMO PAQUETE
        ClaseB objB = new ClaseB();
        //objB.publicB y defaultB
        ClaseC objC = new ClaseC();
        //objC.defaultC
        //objC.publicC
        ClaseD objD = new ClaseD();
        //objD.defaultD
        //objD.publicD
        
        //PAQUETE 2
        ClaseE objE = new ClaseE();
        //objE.publicE
        
        //ClaseF --> default, no visible
    }
}

class ClaseB {
    public int publicB;
    int defaultB;
    private int privateB;
}
