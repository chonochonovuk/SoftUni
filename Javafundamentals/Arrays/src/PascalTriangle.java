import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        printRows(rows);
    }

    private static void printRows(int rows) {
        int[] previousRow;
        int[] currentRow = {1};
        previousRow = currentRow;
        printArray(currentRow);

        for (int i = 2; i <= rows ; i++) {
            currentRow = new int[i];
            currentRow[0] = 1;
            currentRow[i - 1] = 1;

            for (int j = 0; j <= i - 3 ; j++) {

                currentRow[j + 1] = previousRow[j] + previousRow[j + 1];

            }

            printArray(currentRow);

            previousRow = currentRow;

        }
    }

    private static void printArray(int[] currentRow) {

        for (int i = 0; i < currentRow.length ; i++) {

            System.out.print(currentRow[i] + " ");

        }

        System.out.println();
    }
}
