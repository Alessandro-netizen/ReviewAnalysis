import java.util.ArrayList;

public class ReviewAnalysis {
    /** All user reviews to be included in this analysis */
    private Review[] allReviews;

    /** Initializes allReviews to contain all the Review objects to be analyzed */
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    /**
     * Returns a double representing the average rating of all the Review objects to
     * be
     * analyzed, as described in part (a)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     */
    public double getAverageRating() {
        if (allReviews == null || allReviews.length == 0) {
            return 0.0; // Handle empty array case
        }
        double sum = 0;
        for (Review review : allReviews) {
            sum += review.getRating();
        }
        return (double) sum / allReviews.length;
    }


    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<>();
        for (int i = 0; i < allReviews.length; i++) {
            String s = i + "-" + allReviews[i].getComment();
            String last = "";
            if (s.length() > 0) {
                last = s.substring(s.length() - 1);
            }

            if (!last.equals(".") && !last.equals("!")) {
                s += ".";
            }

            if (s.indexOf("!") > 0) {
                comments.add(s);
            }
        }
        return comments;
    }
}
