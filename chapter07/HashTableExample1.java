package chapter07;


/**
 * Escreva uma descrição da classe HashTableExample1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class HashTableExample1
{
    private String s1 = "crocodile";
    private String s2 = "teapot";
    
    public void viewHash(){
        System.out.println(s1 +" "+ s1.hashCode());
        System.out.println(s2 +" "+ s2.hashCode());
    }
}
