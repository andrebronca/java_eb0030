package chapter09.good_life_foods;


/**
 * Escreva uma descrição da classe Fruit aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Fruit extends Item
{
    private int quantity;
    
    public Fruit(String name, double unitCost, int quantity){
        super(name, unitCost);
        this.quantity = quantity;
    }

    public double calculateCost(){
        return quantity * super.getUnitCost();
    }
    
    public void describeItem(){
        
    }
}
