package chapter07;


/**
 * Escreva uma descrição da classe SmallDictionary aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class SmallDictionary{
    private String[] myWords;
    
    public SmallDictionary(){
        myWords = new String[10];
        myWords[0] = "crocodile";
        myWords[1] = "zebra";
        myWords[2] = "gnu";
        myWords[9] = new String("parrot");
    }
    
    public void displayWords(){
        for (int x = 0; x < myWords.length; x++){
            System.out.println(myWords[x]);
        }
    }
}
