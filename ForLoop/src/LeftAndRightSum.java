import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        int sum = 0;
        for(int k = 0; k < n ; k++){
            int l = Integer.parseInt(scanner.nextLine());
            left += l;
        }

        for(int w = 0; w < n ; w++){
            int r = Integer.parseInt(scanner.nextLine());
            right += r;
        }
        if(left == right){
            System.out.println("Yes, sum = " + left);
        }

        if(left != right) {
            sum = Math.abs(left - right);
            System.out.println("No, diff = " + sum);
        }
    }
}
