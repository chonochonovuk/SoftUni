import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        String trying = "1 2 3 |4 5 6 |  7  8";
        String delStr;
        String newStr;


        trying = trying.replace(trying.substring(0, 4), "");

        System.out.println(trying);


        //List<String> tryMe = Arrays.stream(trying.split("\\|")).collect(Collectors.toList());

        //String[] two = new String[0];

    }
}
