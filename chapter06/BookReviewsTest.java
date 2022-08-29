package chapter06;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste BookReviewsTest.
 *
 * @author  André
 * @version 1.1
 */
public class BookReviewsTest
{
    private BookReviews b1;
    
    public BookReviewsTest()
    {
        b1 = new BookReviews("fishing", "smith");
    }

    
    @Test
    public void test1(){
        assertEquals(
            b1.addReview("A splendid read - highly recomended", 5), 
            true);
    }
    
    @Test
    public void blankStringTest(){
        assertEquals(b1.addReview(" ", 0), false); 
    }
    
    @Test
    public void textoTamanhoZero(){
        assertEquals(b1.addReview("", 2), false);
    }
    
    // @Test
    // public void nullText(){
        // assertEquals(b1.addReview(null, 2), false);
    // }
    
    @Test
    public void invalidRatingMaiorQueMaximo(){
        assertEquals(b1.addReview("study",6), false);
    }
    
    @Test
    public void invalidRatingMenorQueMinimo(){
        assertEquals(b1.addReview("study", -1), false);
    }
}
