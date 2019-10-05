import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String take = scanner.nextLine();
        int area = w*l;
        int left = 0;

        while (!take.equals("STOP")){
            int t = Integer.parseInt(take);
            left += t;

            if(left > area){
               left -= area;
                System.out.printf("No more cake left! You need %d pieces more.",left);
                break;
            }

            take = scanner.nextLine();
        }

        if(take.equals("STOP")){
            area -= left;
            System.out.printf("%d pieces are left.",area);
        }
    }
}
