import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = 97;
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        String[][] triChars = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char middle = (char) (first + j);
                triChars[i][j] = String.format("%c%c%c",first,middle,first);
                System.out.print(triChars[i][j] + " ");
            }
            System.out.println();
            first++;
        }

    }

}
