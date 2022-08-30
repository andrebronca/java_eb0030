package chapter08.mvc;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste NumberAppTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class NumberAppTest
{
    NumberApp n;
    /**
     * Construtor default para a classe de teste NumberAppTest
     */
    public NumberAppTest()
    {
        n = new NumberApp();
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void test(){
        
        //value should be zero initially...
        assertEquals(n.getValueAsString(),"0");
        //try to decrease by 1, should stay at 0 and return false
        n.decValue();
        assertEquals(n.getValueAsString(),"0");
        //increase to 3
        n.incValue();
        n.incValue();
        n.incValue();
        assertEquals(n.getValueAsString(),"3");
        //reset to 0
        n.resetCount();
        assertEquals(n.getValueAsString(),"0");
        //increase to 10
        for(int i = 0; i < 10; i++){
            n.incValue();
        }
        assertEquals(n.getValueAsString(),"10");
        //try to inc again, should stay at 10
        assertEquals(n.getValueAsString(),"10");
        //return false if try to inc upper 10
        assertEquals(n.incValue(),false);
    }
}
