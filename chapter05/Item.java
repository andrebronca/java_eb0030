package chapter05;


/**
 * Escreva uma descrição da classe Item aqui.
 * 
 * @author André
 * @version 1.0
 */
public class Item
{
    protected int value;
    protected String creator;
    
    public Item(int value, String creator){
        this.value = value;
        this.creator = creator;
    }
    
    protected void showValue(){
        System.out.println("This item is worth "+ value +" pounds");
    }
}
