/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_4_television;

/**
 *
 * @author invitado
 */
public class Television {
    
    
   private boolean power;
   private int vol;
   private int canal;
   
   public Television(){
       power = false;
       vol = 0;
       canal = 5;
   }
   
   public void cambiarPower(){
       if (power == false){
           power = true;
           System.out.println("Television Encendida");
       }
       else{
           power = false;
           System.out.println("Television Apagada");
       }
   }
   
   public void subirVol(){
       if (power == true){
           if (vol < 100){
               vol = vol + 5;
               System.out.println("Volumen: " + vol + "%");
           }
       }
   }
   
      public void bajarVol(){
       if (power == true){
           if (vol > 0){
               vol = vol - 5;
               System.out.println("Volumen: " + vol + "%");
           }
       }
   }
      public void subirCanal(){
          if (power == true){
              if (canal < 100){
                  canal = canal + 1;
                  System.out.println("Canal " + canal);
              }
              else if (canal == 100){
                  canal = 0;
                  System.out.println("Canal " + canal);
              }
          }
      }
      
       public void bajarCanal(){
          if (power == true){
              if (canal > 0){
                  canal = canal - 1;
                  System.out.println("Canal " + canal);
              }
              else if (canal == 0){
                  canal = 100;
                  System.out.println("Canal " + canal);
              }
          }
      }
}
