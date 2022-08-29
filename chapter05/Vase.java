package chapter05;


/**
 * Escreva uma descrição da classe Vase aqui.
 * 
 * @author André
 * @version 1.0
 */
public class Vase extends Item
{
    public int height;
    public String material;
    
    public Vase(int value, String creator, int height, String material){
        super(value, creator);
        this.height = height;
        this.material = material;
    }
}
