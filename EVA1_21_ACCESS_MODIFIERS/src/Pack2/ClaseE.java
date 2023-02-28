/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pack2;

import Pack1.ClaseA;

/**
 *
 * @author invitado
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
}

class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.publicA
        
        //ClaseD es default en otro paquete
    }
}
