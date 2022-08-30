package chapter07;


/**
 * Escreva uma descrição da classe Card aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Card
{
    private char value; //e.g. '1','2' .. 'Q','K'
    private String suit;    //e.g. "Diamonds", "Spades"
    
    public Card(char value, String suit){
        this.value = value;
        this.suit = suit;
    }
    
    public char getValue(){
        return value;
    }
}
