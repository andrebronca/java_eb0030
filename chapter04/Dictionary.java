package chapter04;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe Dictionary aqui.
 * 
 * @author André
 * @version 1.0
 */
public class Dictionary{
    private ArrayList<String> words;
    
    public Dictionary(){
        words = new ArrayList<String>();
        addInitialWords();
    }
    
    /**
     * Add some initial words to the words ARrayList.
     * @param none
     * @return none
     */
    public void addInitialWords(){
        words.add("crocodile");
        words.add("antelope");
        words.add("gnu");
        words.add("zebra");
        words.add("giraffe");
    }
    
    /**
     * Display all words in the ArrayList
     * @param none
     * @return none
     */
    public void displayAllWords(){
        for(int i = 0; i < words.size(); i++){
            //retrieve the String at position i
            String w = words.get(i);
            System.out.println(w);
        }
    }
    
    /**
     * Display all words in the ArrayList
     * @param none
     * @return none
     */
    public void displayAllWords2(){
        for(String w : words){
            System.out.println(w);
        }
    }
    
    /**
     * Add a new word to the ArrayList
     * @param word as a String
     * @return true if the word added is unique, false otherwise
     */
    public boolean addNewWord(String w){
        //está invertido no livro a lógica, página 71
        if (!checkWorkd(w)){
            return false;
        } else {
            words.add(w);
            return true;
        }
    }
    
    /**
     * 
     */
    public boolean checkWorkd(String w){
        boolean x;
        x = words.contains(w);
        if (x){
            //x is already in the dictionary, não é para adicionar
            return false;
        } else {
            return true;
        }
    }
}
