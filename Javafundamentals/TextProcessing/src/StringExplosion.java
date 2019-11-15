import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder explode = new StringBuilder(input);
        int search = 0;
        int left = 0;
        char exp = 0;
        while (explode.indexOf(">",search) != -1){
            int index = explode.indexOf(">",search) + 1;
            int strength = Integer.parseInt(String.valueOf(explode.charAt(index)));
            if (strength == 0){
                explode.deleteCharAt(index);
                search = index;
                continue;
            }

            strength += left;
            while (strength != 0){
                explode.deleteCharAt(index);
                strength--;
                left = strength;
                search = index;
                if (search >= explode.length()){
                    break;
                }
                exp = explode.charAt(index);
                if (exp == '>'){
                    break;
                }
            }
        }

        System.out.println(explode);
    }

}
