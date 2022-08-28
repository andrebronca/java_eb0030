package chapter03;


/**
 * Escreva uma descrição da classe Shelf aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Shelf
{
    public Book b1;
	public Book b2;

	public Shelf() {
		b1 = new Book("100 Lobster Recipes", "Dan Smith", 10.5);
		b2 = new Book("70s Rock Music", "Rick Flash", 20.0);
	}

	public void changeValues() {
		b1.value = 9.5;
		b2.value = 18.0;
	}
}
