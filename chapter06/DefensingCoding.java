package chapter06;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe DefensingCoding aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class DefensingCoding{
    private int x;
    private ArrayList<String> someList;
    
    public void betterCoding(){
        someList = new ArrayList<>();
        someList.add("crocodile");
        someList.add("gnu");
        
        //uma forma de impedir o loop infinito é limitar ao tamanho da lista
        for (int y = 0; y < someList.size(); y++){
            System.out.println(someList.get(y));
        }
        
        //iterator automático, não precisa explicitar o limite do loop
        for (String s : someList){
            System.out.println(s);
        }
    }
}
