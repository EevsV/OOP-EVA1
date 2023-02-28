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
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseB objB = new ClaseB();
        //objB.defaultB
        //objB.publicB
        
        //Paquete 2
        ClaseE objE = new ClaseE();
        //objE.publicE
    }
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
