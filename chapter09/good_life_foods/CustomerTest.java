package chapter09.good_life_foods;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CustomerTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CustomerTest
{
    private Customer c;
    
    public CustomerTest(){
        c = new Customer("Smith", "John", "1 the avenue");
    }

   
    @BeforeEach
    public void setUp()
    {
    }

    
    @AfterEach
    public void tearDown()
    {
    }
}
