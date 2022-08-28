package chapter03;


/**
 * Escreva uma descrição da classe Shelf2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Shelf2
{
    public Book2 b1;
    public Book2 b2;

    public Shelf2() {
        b1 = new Book2("100 Lobster Recipes", "Dan Smith", 10.5);
        b2 = new Book2("70s Rock Music", "Rick Flash", 20.0);
    }
    
    public void changeValues(){
        b1.setValue(9.5);
        b2.setValue(18.0);
    }

}
