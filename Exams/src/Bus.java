import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passengers = Integer.parseInt(scanner.nextLine());
        int stops = Integer.parseInt(scanner.nextLine());
        int checkers = 2;
        int tot = 0;
        for(int i = 1;i <= stops;i++){
            int out = Integer.parseInt(scanner.nextLine());
            int in = Integer.parseInt(scanner.nextLine());

            if(i%2 == 0){
                passengers -=(checkers + out);
                passengers += in;
            }else{
                passengers -= out;
                passengers += in + checkers;
            }
        }

        System.out.printf("The final number of passengers is : %d", passengers);
    }
}
