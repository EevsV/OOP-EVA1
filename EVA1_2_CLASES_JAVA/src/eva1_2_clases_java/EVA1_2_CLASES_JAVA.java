/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        // CREAR OBJETO
        // INSTANCIACION
        // INSTANCIAR --> DAR MEMORIA RAM
        // NOMBRE DE LA CLASE IDENTIFICADOR = new CONSTRUCTOR DE LA CLASE
        Persona perso1 = new Persona();
        
        /* perso1.apellidos = "Gardea Saucedo";
        perso1.nombre = "Sebastian";
        System.out.println(perso1.nombre + " " + perso1.apellidos);
                */
     
        
       perso1.setNombre("Sebastian");
       perso1.setApellidos("Gardea Saucedo");
       perso1.setEdad(18);
       perso1.setGenero('H');
        /* System.out.println(perso1.getNombre() + " " + perso1.getApellidos());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getGenero()); */
       perso1.imprimirDatos();
       
       //---
       
       System.out.println("---");
       
       Persona perso2 = new Persona();
       perso2.setNombre("Candice");
       perso2.setApellidos("Knots");
       perso2.setEdad(25);
       perso2.setGenero('M');
       perso2.imprimirDatos();
    }
    
}
