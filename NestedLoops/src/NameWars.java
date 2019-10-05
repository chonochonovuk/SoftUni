import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int max = 0;

        String maxName = "";

        while (!name.equals("Stop")){

            int tot =0;

            for(int i = 0;i < name.length();i++){
                tot += (int)name.charAt(i);
            }

            if(tot > max){
                max = tot;
                maxName = name;
            }

            name = scanner.nextLine();

        }

        System.out.printf("Winner is %s - %d!",maxName,max);

    }
}
