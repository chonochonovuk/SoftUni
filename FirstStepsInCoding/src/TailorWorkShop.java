import java.util.Scanner;

public class TailorWorkShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tableCount = Integer.parseInt(scanner.nextLine());
        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWidth = Double.parseDouble(scanner.nextLine());
        double tableClothBig = (tableCount*(tableLength + 2*0.30)*(tableWidth + 2*0.30));
        double tableClothSmall = (tableCount*(tableLength/2)*(tableLength/2));
        double totalUsd = ((tableClothBig*7)+(tableClothSmall*9));
        double totalBgn = (totalUsd*1.85);
        System.out.printf("%.2f USD%n",totalUsd);
        System.out.printf("%.2f BGN",totalBgn);
    }
}
