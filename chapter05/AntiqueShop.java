package chapter05;


/**
 * Escreva uma descrição da classe AntiqueShop aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AntiqueShop
{
    public Vase v1;
    
    public void addStock(){
        v1 = new Vase();
        v1.value = 100;
        v1.showValue(); // inherited from Item super class
    }
}
