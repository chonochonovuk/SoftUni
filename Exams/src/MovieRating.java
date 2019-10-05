import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        String movieName = "";
        double rating = 0.0;
        HashMap<String,Double> ExactMovie = new HashMap<String,Double>();
        double avg = 0.0;

        for (int i=0;i<x;i++){
            movieName = scanner.nextLine();
            rating = Double.parseDouble(scanner.nextLine());
            ExactMovie.put(movieName,rating);
            avg += rating;
        }

        avg = avg/x;
        String maxKey = Collections.max(ExactMovie.entrySet(), Map.Entry.comparingByValue()).getKey();
        double maxValue = ExactMovie.get(maxKey);
        String minKey = Collections.min(ExactMovie.entrySet(), Map.Entry.comparingByValue()).getKey();
        double minValue = ExactMovie.get(minKey);
        System.out.printf("%s is with highest rating: %.1f%n",maxKey,maxValue);
        System.out.printf("%s is with lowest rating: %.1f%n",minKey,minValue);
        System.out.printf("Average rating: %.1f%n",avg);

    }
}
