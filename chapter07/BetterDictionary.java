package chapter07;


/**
 * Escreva uma descrição da classe BetterDictionary aqui.
 * Matriz com quantidade de coluna diferente para cada linha.
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class BetterDictionary{
    private String[][] allWords;
    
    public BetterDictionary(){
        //Note we do not specify the second dimension size
        allWords = new String[26][];
        
        //we can setup our Strings in a number of ways
        String[] aWords = {"aardvark", "act", "apple", "azure"};
        allWords[0] = aWords;
        String[] bWords = {"bake", "banana", "byte"};
        allWords[1] = bWords;
        allWords[2] = new String[2];
        allWords[2][0] = "cat";
        allWords[2][1] = new String("crayon");
    }
    
    /**
     * Display words starting with letter at row
     * position c.
     * @param int c where a = 0, b = 1 and so on.
     */
    public void displayWordsForLetter(int c){
        System.out.println("Words for letter "+ c);
        for(int x = 0; x < allWords[c].length; x++){
            System.out.print(allWords[c][x] +" ");
        }
    }
}
