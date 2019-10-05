import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int max = 0;
        String player = "";

        while (!name.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());

            if(goals > max){
                max = goals;
                player = name;

                if(max >= 10){
                    break;
                }


            }
            name = scanner.nextLine();
        }

        if (max >= 3){
            System.out.printf("%s is the best player!\n",player);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",max);
        }else {
            System.out.printf("%s is the best player!\n",player);
            System.out.printf("He has scored %d goals.",max);
        }
    }
}
