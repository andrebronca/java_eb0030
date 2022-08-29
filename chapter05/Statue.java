package chapter05;


/**
 * Escreva uma descrição da classe Statue aqui.
 * 
 * @author André
 * @version 1.0
 */
public class Statue extends Item
{
    private int weight;
    private String colour;
    
    public Statue(int value, String creator, int weight, String colour){
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }
    
    public void displayDetails(){
        System.out.println("------ Statue ------");
        System.out.println("This statue was created by "+ creator);
        System.out.println("It has a value of "+ value +" pounds");
        System.out.println("It weighs "+ weight +" kg");
        System.out.println("It is "+ colour +" in colour");
    }
}
