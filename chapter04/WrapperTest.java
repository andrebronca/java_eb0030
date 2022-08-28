package chapter04;


/**
 * Escreva uma descrição da classe WrapperTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WrapperTest {
    private Integer x1, x2;
    
    public WrapperTest(){
        x1 = new Integer(10);
        x2 = new Integer("123");
    }
    
    public void accessValues(){
        int y1 = x1.intValue();
        int y2 = x2.intValue();
        int y3 = y1 + y2;
        System.out.println("y3 = "+ y3);
    }
}
