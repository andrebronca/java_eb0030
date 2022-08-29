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
        Painting p1 = new Painting(100, "John", 50, 25, true, false);
        Statue s1 = new Statue(1000, "Sheila", 20, "orange");
        allItems.add(v1);
        allItems.add(p1);
        allItems.add(s1);
    }
    
    public void showAllStock(){
        for (Item i : allItems){
            i.displayDetails();
        }
    }
}
