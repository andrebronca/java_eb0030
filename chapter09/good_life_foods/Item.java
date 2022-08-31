package chapter09.good_life_foods;


/**
 * Escreva uma descrição da classe Item aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Item
{
    String name;
    double unitCost;
    
    public Item(String name, double unitCost){
        if (name != null && unitCost > 0.0){
            this.name = name.trim();
            this.unitCost = unitCost;
        }
    }
    
    public String getName(){
        return name;
    }
    
    public double getUnitCost(){
        return unitCost;
    }
    
    abstract double calculateCost();
    
    abstract void describeItem();
}
