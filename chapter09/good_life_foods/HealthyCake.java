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
    
    /**
     * A superclasse já verifica se name e uniCost são null ou > 0.0
     * Aqui a validação é feita apenas para o atributo de instância.
     * Caso retorne valor padrão de algum atributo: null, 0
     * significa que na inserção foi fornecido algum valor inválido
     */
    public HealthyCake(String name, double unitCost, String msg){
        super(name, unitCost);
        if (msg != null){
            this.msg = msg;
        }
    }

    public double calculateCost(){
        return super.getUnitCost();
    }
    
    public void describeItem(){
        System.out.println("\t"+ super.getName() +"\n"
            +"\t\tUnit Cost: $"+ String.format("%.2f", super.getUnitCost()) +"\n"
            +"\t\tMensagem: "+ msg
        );
    }
}
