import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int diff = 0;
        int max = Integer.MIN_VALUE;

        for(int k = 0; k < n; k++){
            int nn = Integer.parseInt(scanner.nextLine());

            sum += nn;


            if(nn > max){
                max = nn;
            }


        }

        if((sum - max) == max){

            System.out.printf("Yes\nSum = %d", max);

        }else {

            diff = Math.abs((sum - max) - max);
            System.out.printf("No\nDiff = %d", diff);

        }
    }
}
