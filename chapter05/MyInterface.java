package chapter05;


/**
 * Escreva a descrição da interface MyInterface aqui.
 * 
 * @author (seu nome aqui) 
 * @version (um número da versão ou data aqui)
 */

public interface MyInterface
{
    //interface attribute
    public String defaultMessage = "Hello World";
    
    // interface method
    public void displayMessage();
    
    default String appendToMessage(String msg, String msg2){
        return msg + msg2;
    }
}
