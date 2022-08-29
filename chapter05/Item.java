package chapter05;


/**
 * Escreva uma descrição da classe Item aqui.
 * 
 * @author André
 * @version 2.0
 */
public abstract class Item
{
    protected int value;
    protected String creator;
    
    //quando o objeto não for mais usado, como será decrementado?
    static int numInstances = 0;
    
    public Item(int value, String creator){
        this.value = value;
        this.creator = creator;
        numInstances++;
    }
    
    public void displayNumberOfInstances(){
        System.out.println(numInstances);
    }
    
    public void showValue(){
        System.out.println("This item is worth "+ value +" pounds");
    }
    
    public abstract void displayDetails();
}
