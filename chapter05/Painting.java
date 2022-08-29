package chapter05;


/**
 * Escreva uma descrição da classe Painting aqui.
 * 
 * @author André
 * @version 1.0
 */
public class Painting extends Item
{
    public int height;
    public int width;
    public boolean isWatercolour;
    public boolean isFramed;
    
    public Painting(int value, String creator, int height, int width){
        super(value, creator);
        this.height = height;
        this.width = width;
    }
}
