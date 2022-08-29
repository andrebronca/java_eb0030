package chapter05;


/**
 * Escreva uma descrição da classe Game aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Game {
    private int x, y;
    
    public Game(){
        System.out.println("Instance up and running");
    }
    
    public void method1(){
        System.out.println("Play the game");
    }
    
    public static void main(String[] args){
        Game g1 = new Game();
        g1.method1();
    }
}
