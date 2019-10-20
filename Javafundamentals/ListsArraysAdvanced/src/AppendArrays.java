import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toArrays = scanner.nextLine();

        List<String> ArraysTo = Arrays.stream(toArrays.split("\\|")).collect(Collectors.toList());
        List<String> trimmed = new ArrayList<>();


        for (int i = 0; i < ArraysTo.size(); i++) {

            String conv = ArraysTo.get(i).trim();

            trimmed.add(conv);

        }

        Collections.reverse(trimmed);
            String splt = "";
        for (int i = 0; i < trimmed.size(); i++) {

            splt  += trimmed.get(i) + " ";

        }

        trimmed = Arrays.stream(splt.split("\\s+")).collect(Collectors.toList());

        System.out.println(trimmed.toString().replaceAll("[\\[\\],]",""));

    }
}
