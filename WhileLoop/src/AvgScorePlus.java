import java.util.Scanner;

public class AvgScorePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int years = 0;
        int yAll = 12;
        int low = 0;
        double all = 0;
        while (years < yAll){
            double sc = Double.parseDouble(scanner.nextLine());
            if(sc < 4.00){
                low++;
                if(low > 1){

                    System.out.printf("%s has been excluded at %d grade",name,years);
                   break;
                }
            }
            all += sc;
            years++;
        }
        if(years == yAll) {
            double total = all / yAll;
            System.out.printf("%s graduated. Average grade: %.2f", name, total);
        }
    }
}
