import java.util.Scanner;

public class Wedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int turns = Integer.parseInt(scanner.nextLine());
        int t = 0;

        for(int a = 1; a <= men ; a++){
            for (int b = 1;b <= women; b++){
                t++;
                if (t == turns){
                    System.out.printf("(%d <-> %d) ",a,b);
                   return;
                }else {
                    System.out.printf("(%d <-> %d) ",a,b);
                }

            }
        }
    }
}
