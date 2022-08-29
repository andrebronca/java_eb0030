package chapter05;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe AntiqueShop aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AntiqueShop
{
    private ArrayList<Item> allItems;
    
    public AntiqueShop(){
        allItems = new ArrayList<Item>();
    }
    
    public void addStock(){
        Vase v1 = new Vase(0, "Dave", 50, "bronze");
        v1.showValue();
        Vase v2 = new Vase(100, "plaster");
        v2.showValue();
        Painting p1 = new Painting(100, "John", 50, 25, true, false);
        p1.showValue(); // inherited from Item super class
        Statue s1 = new Statue(1000, "Sheila", 20, "orange");
    }
}
