import java.util.Scanner;

public class CenturyToYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int century = Integer.parseInt(scanner.nextLine());
        int year = century*100;
        int day = (int) (year*365.2422);
        int hours = day*24;
        long minutes = hours*60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",century,year,day,hours,minutes);
    }
}
