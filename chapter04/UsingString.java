package chapter04;


/**
 * Escreva uma descrição da classe UsingString aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class UsingString
{
    //separate declaration and initialisation
    String s1 = new String("Skywalker");
    //combined declaration and initialisation
    String s2 = new String("Leia");
    //combined and shortened syntax form
    String s3 = "Vader";
    String s4 = "Yoda";
    String s5 = "Dent";
    String s6;
    
    public void exibe(){
        s6 = s2;
        System.out.println(s1);
        System.out.println(s2);        
        System.out.println(s6); 
        s6 = "Ewok";
        System.out.println(s2);        
        System.out.println(s6); 
    }
    
    public void stringExamples(){
        String s1 = "Woodpecker";
        String s2 = "Starling";
        String s3 = " starling";
        
        exibe("s1 has "+ s1.length() +" chars");
        
        for (int x = 0; x < s1.length(); x++){
            exibe(s1.charAt(x));
        }
        
        s3 = s3.trim();
        
        int y;
        y = s2.compareTo(s3);
        exibe(y);
        
        int z;
        z = s2.compareToIgnoreCase(s3);
        exibe(z);
    }
    
    private void exibe(Object s){
        System.out.println(s);
    }
}
