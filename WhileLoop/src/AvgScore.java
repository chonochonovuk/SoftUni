import java.util.Scanner;

public class AvgScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int years = 0;
        int yAll = 12;
        double all = 0;
        while (years < yAll){
            double sc = Double.parseDouble(scanner.nextLine());
            if(sc < 4.00){
                sc = Double.parseDouble(scanner.nextLine());
            }
            all += sc;
            years++;
        }
        double total = all/yAll;
        System.out.printf("%s graduated. Average grade: %.2f",name,total);
    }
}
