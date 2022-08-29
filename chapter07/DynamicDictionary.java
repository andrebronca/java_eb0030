package chapter07;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Escreva uma descrição da classe DynamicDictionary aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class DynamicDictionary{
    private ArrayList<String> allWords;
    
    public DynamicDictionary(){
        allWords = new ArrayList<>();
        allWords.add("crocodile");
        allWords.add("zither");
        allWords.add("cake");
        allWords.add("xylophone");
        allWords.add("cat");
        allWords.add("flower");
        allWords.add("forest");
    }
    
    public void listWords(){
        for(String w : allWords){
            System.out.println(w);
        }
    }
    
    public void sortWords(){
        Collections.sort(allWords);
    }
}
