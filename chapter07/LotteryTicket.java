package chapter07;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;


/**
 * Escreva uma descrição da classe LotteryTicket aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class LotteryTicket{
    private int[] numbers;
    
    public LotteryTicket(){
        numbers = new int[6];
        Random r = new Random();
        
        for(int x = 0; x < numbers.length; x++){
            //set each number in the range 1-99
            int num = r.nextInt(98) + 1;
            numbers[x] = num;
        }
        
        Arrays.sort(numbers);
    }
    
    public void displayNumbers(){
        
        System.out.println("The numbers are: ");
        for (int x = 0; x < numbers.length; x++){
            System.out.print(numbers[x] +" ");
        }
        System.out.println("Good luck!");
    }
    
    //não funciona pq o numbers é do tipo primitivo
    // public void reverseSort(){
        // Arrays.sort(numbers, Collections.reverseOrder());
        // displayNumbers();
    // }
}
