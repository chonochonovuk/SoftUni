import java.util.Scanner;

public class EqualEvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int even = 0;
        int odd = 0;
        int nl = 0;
        for(int k = n1; k <= n2;k++){
            for (int l = 0; l < 6; l++){
                String m = "" + k;
                int z = Integer.parseInt("" + m.charAt(l));
                if(l == 1 || l == 3 || l == 5 ){
                    even += z;
                }else{
                    odd += z;
                }

               if(l == 5){
                   if(even == odd){

                       System.out.print(k + " ");

                   }

                   even = 0;
                   odd = 0;
               }
            }
        }
    }
}
