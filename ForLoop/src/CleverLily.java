import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        double wm = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double toysum = 0;
        double cash = 0;
        double cashs = 0;
        double sum = 0;
        int e = 0;
        for(int k = 0; k < years ; k++){

            if(e == 0){
                toysum += toyPrice;
            }else if(e == 1){
                cash += 10;
                cashs += cash - 1;
                e = -1;
            }

            e++;
        }
         sum = toysum + cashs;

        if(sum >= wm){
            System.out.printf("Yes! %.2f",(sum - wm));
        }else {
            System.out.printf("No! %.2f",(wm - sum));
        }
    }
}
