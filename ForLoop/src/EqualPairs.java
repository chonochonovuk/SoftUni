import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int max = Integer.MIN_VALUE;

        for(int k = 0; k < n; k++){
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());


            if(k!=0){
              if((sum1 - n1 - n2) != 0 && max < Math.abs(sum1 - n1 - n2) ){
                  max = Math.abs(sum1 - n1 - n2);
              }
            }

            sum1 = n1 +n2;

        }


        if(max == Integer.MIN_VALUE){
            System.out.println("Yes, value=" + sum1 );
        }else{
            System.out.println("No, maxdiff=" + max);
        }
    }
}
