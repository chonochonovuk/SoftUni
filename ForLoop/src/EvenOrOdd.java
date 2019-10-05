import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int e = 0;
        int even = 0;
        int odd = 0;
        int diff = 0;

        for(int k = 0; k < n; k++){
            int eo = Integer.parseInt(scanner.nextLine());
            if(e == 0){

                even += eo;

            }else if(e == 1) {
                odd += eo;
                e = -1;
            }
            e++;
        }

        if(even == odd){
            System.out.println("Yes");
            System.out.println("Sum = " + even);
        }else {
            diff = Math.abs(even - odd);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
