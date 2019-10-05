import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int count = 1;
        boolean isBig = false;

        for(int r = 1; r <= n; r++){
            for (int c = 1; c <= r;c++){
                  if(count > n){
                      isBig = true;
                      break;
                  }
                    System.out.printf("%d ",count);
                    count++;
            }

            if(isBig){
                break;
            }
            System.out.println();
        }
    }
}
