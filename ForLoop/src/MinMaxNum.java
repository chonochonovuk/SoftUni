import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int m = 0; m < n ; m++){
            int l = Integer.parseInt(scanner.nextLine());
            if(l < min){
                min = l;
            }
            if (l > max){
                max = l;
            }
        }

        System.out.printf("Max number: %d\n",max);
        System.out.printf("Min number: %d\n",min);
    }
}
