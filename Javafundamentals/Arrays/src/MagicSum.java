import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strOfNum = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String[] numOut = strOfNum.split(" ");
        int[] nums = new int[numOut.length];
        for (int z = 0; z < nums.length ; z++){
            nums[z] = Integer.parseInt(numOut[z]);
        }

        for (int a = 0 ; a < nums.length - 1 ; a++){
            int y = nums[a];
            for (int b = 1 + a; b < nums.length; b++){
                int x = nums[b];
                if ((y + x) == n){
                    System.out.printf("%d %d%n",y,x);
                    break;
                }
            }
        }
    }
}
