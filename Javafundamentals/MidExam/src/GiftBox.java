import java.util.Scanner;

public class GiftBox {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double boxSide = Double.parseDouble(scanner.nextLine());;
        int sheets = Integer.parseInt(scanner.nextLine());
        double sheetArea = Double.parseDouble(scanner.nextLine());;

        percentCovered(boxSide,sheets,sheetArea);
    }

    private static void percentCovered(double boxSide, int sheets, double sheetArea) {
        double boxAre = 6*boxSide*boxSide;
        double allSheets = 0;
        for (int i = 1; i <= sheets; i++) {
            if (i % 3 == 0){
                allSheets += (sheetArea*0.25);
                continue;
            }
            allSheets += sheetArea;
        }
        char c = '%';
        double percent = (allSheets*1.0/boxAre)*100;
        System.out.printf("You can cover %.2f%c of the box.",percent,c);
    }


}
