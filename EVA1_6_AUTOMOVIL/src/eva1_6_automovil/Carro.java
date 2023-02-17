/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_automovil;

/**
 *
 * @author invitado
 */
public class Carro {
   private String model;
   private String brand;
   private String plate;
   private int year;
   private String owner;
   private double debt;
    
    public Carro(String m,String b,String p, int y, String o){
        model = m;
        brand = b;
        plate = p;
        year = y;
        owner = o;
    }
    
    public void setModel(String m){
        model = m;
    }
    public void setBrand(String b){
        brand = b;
    }
    public void setPlate(String p){
        plate = p;
    }
    public void setYear (int y){
        year = y;
    }
    public void setOwner (String o){
        owner = o;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getPlate(){
        return plate;
    }
    public int getYear(){
        return year;
    }
    public String getOwner(){
        return owner;
    }
    
    public void setDebt(){
        if (year <= 2023){
            if (year <= 2000){            
                debt = 1500;
            }
            else if (year >= 2001 && year <= 2005){
                debt = 2000;
            }
            else if (year >= 2006 && year <= 2010){
                debt = 2500;
            }
            else if (year >= 2010 && year <= 2015){
                debt = 3000;
            }
            else if (year >= 2015 && year < 2024){
                debt = 4000;
            }
        }
        else{
            debt = 0;
        }
    }
    public double getDebt(){
        return debt;
    }
    
    public void leerDatos(){
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: "+ model);
        System.out.println("Año: " + year);
        System.out.println("Placa: " + plate);
        System.out.println("Dueño: " + owner);
        System.out.println("Deuda del carro: ");
        if (debt == 0){
            System.out.println("Año Invalido");
        }
        else{
            System.out.println(debt + "$");
        }
    }
}
