import java.util.Scanner;

public class CombinationX6xNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int k = 0; k <= 9;k++){
            for (int l = 0; l <= 9;l++){
                for (int m = 0;m <= 9;m++){
                    for (int o = 0;o <= 9;o++){
                        for (int p = 0; p <= 9;p++){
                            for(int q = 0; q <= 9;q++)

                            if(k*l*m*o*p*q == n){

                                System.out.printf("%d%d%d%d%d%d ",k,l,m,o,p,q);
                            }


                        }
                    }
                }
            }
        }


    }
}
