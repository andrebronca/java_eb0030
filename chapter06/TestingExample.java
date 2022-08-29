package chapter06;
import java.util.Scanner;


/**
 * Escreva uma descrição da classe TestingExample aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TestingExample
{
    private int x;
    
    /**
     * Enters a value for x using Scanner
     */
    public void userEntersValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for x:");
        x = sc.nextInt();
    }
    
    /**
     * Alternative for automated system testing
     * @param int value of x
     */
    public void userEntersValueTest(int x){
        System.out.println("User enters x: "+ x);
        this.x = x;
    }
}
