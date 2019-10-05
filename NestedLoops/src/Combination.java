import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for(int k = n; k >= 1; k--){
            if(k == n){

                for (int m = 0;m < l;m++){

                    System.out.printf("L%d%d ",k,m);

                }

                System.out.println();

            }else if( k % 2 == 0){

                for (int m = 0;m < l;m++){

                    System.out.printf("O%d%d ",k,m);

                }

                System.out.println();

            } else {

                for (int m = 0;m < l;m++){

                    System.out.printf("A%d%d ",k,m);
                }

                System.out.println();
            }

        }

    }
}
