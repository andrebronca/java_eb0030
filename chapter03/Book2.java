package chapter03;


/**
 * Escreva uma descrição da classe Book2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Book2
{
    private String title;
    private String author;
    private double value;

    public Book2(String title, String author, double value) {
        this.title = title;
        this.author = author;
        this.value = value;
    }
    
    public double getValue(){
        return value;
    }
    
    public void setValue(double value){
        if (value > 0.0){
            this.value = value;
        } else {
            System.out.println("Not acceptable value: "+ value);
        }
    }
}
