import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new LinkedList<>();
        List<String> destroyed = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String decode = scanner.nextLine();
            int countSTAR = starFound(decode);
            StringBuilder newCode = theNewDecoder(decode, countSTAR);
            String regex = "(@[A-Za-z]+)([^@!:>\\-]*)(:\\d+)([^@!:>\\-]*)(![AD]!)([^@!:>\\-]*)(->\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(newCode.toString());
            String planet = "";
            String command = "";
            if (matcher.find()){
                planet = matcher.group(1).replace("@","");
                planet = Character.toUpperCase(planet.charAt(0)) + planet.substring(1);
                command = matcher.group(5).replaceAll("!","");
            }

            if (command.equals("A")){
                attacked.add(planet);
            }

            if (command.equals("D")){
                destroyed.add(planet);
            }
        }
        if (attacked.size() > 0){
            System.out.printf("Attacked planets: %d%n",attacked.size());
            if (attacked.size() > 1){
                Collections.sort(attacked);
            }
            for (String s : attacked) {
                System.out.println("-> " + s);
            }
        }else {
            System.out.printf("Attacked planets: %d%n",attacked.size());
        }

        if (destroyed.size() > 0){
            System.out.printf("Destroyed planets: %d%n",destroyed.size());
            if (destroyed.size() > 1){
                Collections.sort(destroyed);
            }
            for (String s : destroyed) {
                System.out.println("-> " + s);
            }
        }else {
            System.out.printf("Destroyed planets: %d%n",destroyed.size());
        }





    }


    private static StringBuilder theNewDecoder(String decode, int countSTAR) {
        StringBuilder decoder = new StringBuilder();

        for (char c: decode.toCharArray()
        ) {
           c = (char) ((char) c - countSTAR);
           decoder.append(c);
        }
        return decoder;
    }

    private static int starFound(String decode) {
        int count = 0;
        for (char c: decode.toCharArray()
        ) {
            if ("starSTAR".indexOf(c) >= 0){
                count++;
            }
        }
        return count;
    }
}
