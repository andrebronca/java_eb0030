package chapter09.good_life_foods;


/**
 * Escreva uma descrição da classe HealthyCake aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class HealthyCake extends Item
{
    private String msg;
    
    public HealthyCake(String name, double unitCost, String msg){
        super(name, unitCost);
        this.msg = msg;
    }

    public double calculateCost(){
        return super.getUnitCost();
    }
    
    public void describeItem(){
        
    }
}
