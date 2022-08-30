package chapter09.good_life_foods;


/**
 * Escreva uma descrição da classe Vegetable aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Vegetable extends Item
{
    private double weight;
   
    public Vegetable(String name, double unitCost, double weight){
        super(name, unitCost);
        this.weight = weight;
    }

    public double calculateCost(){
        return weight * super.getUnitCost();
    }
    
    public void describeItem(){
        
    }
}
