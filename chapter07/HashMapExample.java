package chapter07;

import java.util.HashMap;

/**
 * Escreva uma descrição da classe HashMapExample aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class HashMapExample
{
    private HashMap<String, String> allRecords;
    
    public HashMapExample(){
        allRecords = new HashMap<>();
        allRecords.put("John Smith", "Carpenter");
        allRecords.put("Mario", "Plumber");
        allRecords.put("Sheila Hughes", "Teacher");
        allRecords.put("Fred Twist", "Teacher");
    }
    
    public boolean searchFor(String s){
        String r = allRecords.get(s);
        if (r != null){
            return true;
        } else {
            return false;
        }
    }
}
