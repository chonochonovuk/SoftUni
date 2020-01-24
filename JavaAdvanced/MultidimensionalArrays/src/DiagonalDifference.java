import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        int[][] diagonals = new int[row][row];
        int left = 0;
        int right = row - 1;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                diagonals[i][j] = scanner.nextInt();
            }
            sum1 += diagonals[i][left++];
            sum2 += diagonals[i][right--];
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}
