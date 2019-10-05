import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int mn = Integer.parseInt(scanner.nextLine());
        int comb = 0;

        for (int a = start; a <= end;a++){
            for (int b = start;b <= end;b++){
                comb++;

                if((a + b) == mn){
                    System.out.printf("Combination N:%d (%d + %d = %d)",comb,a,b,mn);
                    return;
                }

                if(a == end && b == end){
                    System.out.printf("%d combinations - neither equals %d",comb,mn);
                }

            }
        }


    }
}
