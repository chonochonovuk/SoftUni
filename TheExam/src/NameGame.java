import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int points = 0;
        int max = 0;
        String nameW = "";

        while (!name.equals("Stop")){
            for (int i = 0; i < name.length(); i++){
                int n = Integer.parseInt(scanner.nextLine());
                int val = (int)name.charAt(i);

                if (n == val){
                    points += 10;
                }else {
                    points += 2;
                }
            }

            if(points >= max){
                max = points;
                nameW = name;
            }
            points = 0;
            name = scanner.nextLine();
        }
        if (name.equals("Stop")) {
            System.out.printf("The winner is %s with %d points!", nameW, max);
        }
    }
}
