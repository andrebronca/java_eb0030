package chapter07;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


/**
 * Escreva uma descrição da classe IterationExample aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class IterationExample
{
    private ArrayList<String> myList;
    private HashMap<String, String> myMap;
    private HashSet<String> mySet;
    
    public IterationExample(){
        myList = new ArrayList<>();
        myMap = new HashMap<>();
        mySet = new HashSet<>();
    }
    
    public void listExample(){
        myList.add("egg");
        myList.add("potato");
        myList.add("beans");
        System.out.println("------- ArrayList ----------");
        
        //using a for loop
        System.out.println("------- for");
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
        
        //using a for each style loop
        System.out.println("------- foreach");
        for(String s : myList){
            System.out.println(s);
        }
        
        //using a iterator
        Iterator iterator = myList.iterator();
        System.out.println("------- Iterator");
        while(iterator.hasNext()){
            System.out.println( (String) iterator.next() );
        }
    }
    
    public void mapExample(){
        myMap.put("John Smith", "pilot");
        myMap.put("Jenny Howell", "artist");
        myMap.put("Neville Jones", "writer");
        System.out.println("------- HashMap ----------");
        
        //using an iterator - fetching pairs
        Iterator it = myMap.entrySet().iterator();
        System.out.println("------- entrySet");
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            String k = (String) pair.getKey();
            String v = (String) pair.getValue();
            System.out.println(k +" = "+ v);
        }
        
        //using an iterator over the keySet()
        Iterator it2 = myMap.keySet().iterator();
        System.out.println("------- keySet");
        while(it2.hasNext()){
            String k = (String) it2.next();
            String v = myMap.get(k);
            System.out.println(k +" = "+ v);
        }
    }
    
    public void setExample(){
        mySet.add("Kirk");
        mySet.add("Spock");
        mySet.add("Scotty");
        System.out.println("------- HashSet ----------");
        
        //using an iterator
        Iterator it = mySet.iterator();
        System.out.println("------- iterator");
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
