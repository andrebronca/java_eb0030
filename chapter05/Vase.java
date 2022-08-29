package chapter05;


/**
 * Escreva uma descrição da classe Vase aqui.
 * 
 * @author André
 * @version 1.0
 */
public class Vase extends Item
{
    private int height;
    private String material;
    
    public Vase(int value, String creator, int height, String material){
        super(value, creator);
        this.height = height;
        this.material = material;
    }
    
    public Vase(int height, String material){
        super(0, "unknown");
        this.height = height;
        this.material = material;
    }
    
    @Override
    public void showValue(){
        if (value > 0){
            System.out.println("This vase is worth "+ value +" pounds");
        } else {
            System.out.println("Vase value not yet determined");
        }
    }
}
