import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

        if (allReviews == null || allReviews.length == 0) {
            return 0.0; 
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
