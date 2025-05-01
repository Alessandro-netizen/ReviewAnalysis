
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Review[] reviews = {
                new Review(4, "Good! Thx"),
                new Review(3, "OK site"),
                new Review(5, "Great!"),
                new Review(2, "Poor! Bad."),
                new Review(3, "")
        };

        ReviewAnalysis r = new ReviewAnalysis(reviews);


        double averageRating = r.getAverageRating();
        System.out.println("Average Rating: " + averageRating);

        ArrayList<String> comments = r.collectComments();
        System.out.println("\nCollected Comments:");
        System.out.println(comments);
    }
}
