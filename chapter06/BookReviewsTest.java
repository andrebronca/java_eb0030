package chapter06;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste BookReviewsTest.
 *
 * @author  André
 * @version 1.0
 */
public class BookReviewsTest
{
    /**
     * Construtor default para a classe de teste BookReviewsTest
     */
    public BookReviewsTest()
    {
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
    public void test1(){
        BookReviews b1 = new BookReviews("fishing", "smith");
        assertEquals(
            b1.addReview("A splendid read - highly recomended", 5), 
            true);
    }
}
