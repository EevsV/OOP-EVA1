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
public class Persona {
    //DATOS -> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    
    //METODOS -> COMPORTAMIENTO
    //LEER Y ESCRIBIR LOS ATRIBUTOS
    //LEER --> GET
    //ESCRIBIR --> SET
    
    //modificador de acceso valor de retorno, nombre del metodo (argumentos) {implementacion}
    
    public String getNombre(){
        return nombre;
    }
    
    //Si no regresa nada, void
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String valor){
        apellidos = valor;
    }
    
     public int getEdad(){
        return edad;
    }
    
    public void setEdad(int valor){
        edad = valor;
    }
    
     public char getGenero(){
        return genero;
    }
    
    public void setGenero(char valor){
        genero = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad + " años");
        if (genero == 'H'){
            System.out.println("Hombre");
        }
        else if(genero == 'M'){
            System.out.println("Mujer");
        }
        
        else{
            System.out.println("Genero no identificado perdon :c");
        } 
    }
    
}
