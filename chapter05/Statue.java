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
    
    
}
