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
    
    /**
     * A superclasse já verifica se name e uniCost são null ou > 0.0
     * Aqui a validação é feita apenas para o atributo de instância.
     * Caso retorne valor padrão de algum atributo: null, 0
     * significa que na inserção foi fornecido algum valor inválido
     */
    public Fruit(String name, double unitCost, int quantity){
        super(name, unitCost);
        if (quantity > 0){
            this.quantity = quantity;
        }
    }

    public double calculateCost(){
        return quantity * super.getUnitCost();
    }
    
    public void describeItem(){
        System.out.println("\t"+ super.getName() +"\n"
            +"\t\tUnit Cost: $"+ String.format("%.2f", super.getUnitCost()) +"\n"
            +"\t\tQuantity: "+ quantity
        );
    }
}
