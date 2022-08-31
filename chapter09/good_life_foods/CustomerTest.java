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
    public void setUp(){
        
    }

    
    @AfterEach
    public void tearDown(){
        
    }
    
    @Test
    public void placeAnOrder(){
        c.addItemToOrder(new Fruit("Apples", 0.2, 5));
        c.addItemToOrder(new Vegetable("Potatoes", 1.0, 2.0));
        c.addItemToOrder(new HealthyCake("Chocolate Cake", 10.0
            , "Happy Birthday"));
        
        //delete the potatoes for now ...
        c.deleteItemFromOrder(1);
        assertEquals(c.getOrder().getNumberOfItems(), 2);
        
        c.deleteItemFromName("Apples");
        assertEquals(c.getOrder().getNumberOfItems(), 1);
        
        //calculate the costs and delivery charges
        //5 apples and cake should be $11.00
        //with a delivery charge of $5.0
        //costs are compared to the nearest penny
        double cost = c.calculateTotalCost();
        assertEquals(cost, 15.0, 0.01);        
        
        //summarise the order
        c.summariseOrder();
        c.displayDetailsOfOrder();
    }
}
