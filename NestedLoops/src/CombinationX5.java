import java.util.Scanner;

public class CombinationX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for(int k = 0; k <= n;k++){
            for (int l = 0; l <= n;l++){
                for (int m = 0;m <= n;m++){
                    for (int o = 0;o <= n;o++){
                        for (int p = 0; p <= n;p++){


                          if( (k+l+m+o+p) == n ){

                              count++;

                          }


                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
