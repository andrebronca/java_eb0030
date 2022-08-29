package chapter06;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe BookReviews aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class BookReviews
{
    private ArrayList<String> allReviews;
    private double rating;
    private String bookTitle;
    private String bookAuthor;
    
    public BookReviews(String bookTitle, String bookAuthor){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        rating = 0.0;
        allReviews = new ArrayList<>();
    }
    
    /**
     * A method to add a review to the list of reviews.
     * @param String with the text of the review
     * @param int with the rating out of 5
     * @return true if the review was accepted
     */
    public boolean addReview(String review, int myRating){
        if ((myRating < 0) || (myRating > 5)){
            System.out.println("Rating must in range 0 to 5");
            return false;
        } 
        else if (review.isEmpty()){
            System.out.println("Review text is empty");
            return false;
        } else {
            allReviews.add(review);
            //update the average socre
            if (allReviews.size() == 1){
                rating = (double) myRating;
            } else {
                double x = rating * (allReviews.size() - 1);
                x += (double) myRating;
                rating = x / allReviews.size();
            }
            return true;
        }
    }
    
    /**
     * A method to display all reviews and the average rating
     * @param none
     * @return none
     */
    public void displayReviews(){
        if (allReviews.size() > 0){
            for (String r : allReviews){
                System.out.println(r);
            }
            //display rating to 2 decimal places
            System.out.println("Current rating: "+ 
                String.format("%.2f", rating));
        } else {
            System.out.println("No reviews yet");
        }
    }
}
