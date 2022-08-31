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
   
    /**
     * A superclasse já verifica se name e uniCost são null ou > 0.0
     * Aqui a validação é feita apenas para o atributo de instância.
     * Caso retorne valor padrão de algum atributo: null, 0
     * significa que na inserção foi fornecido algum valor inválido
     */
    public Vegetable(String name, double unitCost, double weight){
        super(name, unitCost);
        if (weight > 0.0){
            this.weight = weight;
        }
    }

    public double calculateCost(){
        return weight * super.getUnitCost();
    }
    
    public void describeItem(){
        System.out.println("\t"+ super.getName() +"\n"
            +"\t\tUnit Cost: $"+ String.format("%.2f", super.getUnitCost()) +"\n"
            +"\t\tWeight: "+ String.format("%.2f", weight)
        );
    }
}
