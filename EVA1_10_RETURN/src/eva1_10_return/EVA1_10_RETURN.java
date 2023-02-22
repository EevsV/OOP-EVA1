/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_return;

/**
 *
 * @author invitado
 */
public class EVA1_10_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        square(10); //llamada funcion que no procesa resulta
        int resu;
        resu = square(3); //llamada funcion, almacena resultado
        System.out.println(resu);
        System.out.println(square(5)); //llamada funcion, envia el resultado sin almacenar
    }
    public static int square(int num){
        return num*num;
    }
}
