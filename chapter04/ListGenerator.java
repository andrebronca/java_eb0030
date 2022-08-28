package chapter04;
import java.util.Random;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe ListGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ListGenerator {
    private ArrayList<Integer> myList;
    
    /**
     * Constructor
     * @param num number of initial elements in the list
     */
    public ListGenerator(int num){
        Random r = new Random();
        myList = new ArrayList<Integer>();
        for(int i = 0; i < num; i++){
            int x = r.nextInt(99) + 1;
            myList.add(new Integer(x));
        }
    }
    
    /**
     * Displays each number in the list on the console
     * @param none
     * @return none
     */
    public void displayList(){
        for(Integer i : myList){
            System.out.println(i.intValue());
        }
    }
}
