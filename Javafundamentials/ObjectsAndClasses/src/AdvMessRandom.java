import java.util.*;

public class AdvMessRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        Random random = new Random();

        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < times ; i++) {
            int phraseIndex = random.nextInt(phrases.size());
            int event = random.nextInt(events.size());
            int author = random.nextInt(authors.size());
            int city = random.nextInt(cities.size());

            System.out.printf("%s %s %s – %s%n",phrases.get(phraseIndex),events.get(event),authors.get(author),cities.get(city));

        }

    }
}
