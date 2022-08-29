package chapter07;


/**
 * Escreva uma descrição da classe Antique aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Antique implements Comparable<Antique>
{
    private String name;
    private double value;
    private int yearCreated;
    
    public Antique(String name, double value, int yearCreated){
        this.name = name;
        this.value = value;
        this.yearCreated = yearCreated;
    }
    
    //need to allow Collections.sort to access value
    public double getValue(){
        return value;
    }
    
    public String getName(){
        return name;
    }
    
    public int getYearCreated(){
        return yearCreated;
    }
    
    // to complete the Comparable interface
    //será a referência para ordenação
    public int compareTo(Antique x){
        if (value == x.getValue()){
            return 0;
        }
        else if (value < x.getValue()){
            return -1;
        } else {
            return 1;
        }
    }
    
    public void showDetails(){
        System.out.println(name +", worth $"+
            String.format("%.2f",value) +" pounds");
    }
}