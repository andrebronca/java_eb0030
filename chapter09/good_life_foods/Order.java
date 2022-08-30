package chapter09.good_life_foods;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe Order aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Order
{
    private String uniqueReference;
    private ArrayList<Item> allItems;
    private double costOfItems;     //mínimo 10 no total
    private double deliveryCharge;  //de 10 a 30 + 5, > 30 é free
    
    public Order(Item item, double costOfItems, double deliveryCharge){
        allItems = new ArrayList<>();
        this.costOfItems = costOfItems;
        this.deliveryCharge = deliveryCharge;
        allItems.add(item);
    }
    
    public void summarise(){
        
    }
    
    public double calculatetotalCost(){
        return 0.0;
    }
    
    public int getNumberOfItems(){
        return 0;
    }
}
