package chapter08.mvc;


/**
 * Classe estilo: model
 * Aplicando MVC para GUI
 * @author André
 * @version 1.0
 */
public class NumberApp
{
   private int value;
   
   public NumberApp(){
       value = 0;
   }
   
   public String getValueAsString(){
       return String.valueOf(value);
   }
   
   /**
    * Increases value by 1
    * @return true if value is < 10, false otherwise
    */
   public boolean incValue(){
       if (value < 10){
           value++;
           return true;
       } else {
           return false;
       }
   }
   
   /**
    * Decreases value by 1
    * @return true is value is > 0, false otherwise
    */
   public boolean decValue(){
       if (value > 0){
           value--;
           return true;
       } else {
           return false;
       }
   }
   
   public void resetCount(){
       value = 0;
   }
}
