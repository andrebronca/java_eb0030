package chapter07;
import java.util.Comparator;


/**
 * Escreva uma descrição da classe YearCreatedComparator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class YearCreatedComparator implements Comparator<Antique>
{
    //to complete the Comparator interface
    public int compare(Antique a1, Antique a2){
        if (a1.getYearCreated() == a2.getYearCreated()){
            return 0;
        }
        else if (a1.getYearCreated() < a2.getYearCreated()){
            return -1;
        } else {
            return 1;
        }
    }
}
