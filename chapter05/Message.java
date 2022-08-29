package chapter05;


/**
 * Escreva uma descrição da classe Message aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Message implements MyInterface
{
    private String content;
    private String from;
    private String to;
    
    public void displayMessage(){
        content = "Fish ";
        System.out.println(content);
        System.out.println(defaultMessage);
        System.out.println(appendToMessage(content, " and chips"));
    }
}
