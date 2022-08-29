package chapter07;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Escreva uma descrição da classe AntiqueShop aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AntiqueShop
{
    private ArrayList<Antique> allAntiques;
    
    public AntiqueShop(){
        allAntiques = new ArrayList<>();
        allAntiques.add(new Antique("ming vase", 5000, 1400));
        allAntiques.add(new Antique("painting1", 10_000, 1950));
        allAntiques.add(new Antique("harrison watch", 8000, 1750));
        allAntiques.add(new Antique("sketchbook", 200, 1978));
    }
    
    public void showAllAntiques(){
        for (Antique a : allAntiques){
            a.showDetails();
        }
    }
    
    public void sortAntiques(){
        Collections.sort(allAntiques);
    }
    
    public void sortByAgeCreated(){
        Collections.sort(allAntiques, new YearCreatedComparator());
    }
}
