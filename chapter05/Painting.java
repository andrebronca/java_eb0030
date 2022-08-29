package chapter05;


/**
 * Escreva uma descrição da classe Painting aqui.
 * 
 * @author André
 * @version 1.0
 */
public class Painting extends Item
{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    
    public Painting(int value, String creator, int height, int width,
        boolean isWatercolour, boolean isFramed){
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    
    public void trimPainting(){
        width -= 1;
    }
    
    public void trimPainting(int amount){
        width -= amount;
    }
}
