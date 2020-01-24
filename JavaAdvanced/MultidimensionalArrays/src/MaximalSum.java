import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        int sum = 0;
        int minSum = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
                if ((i > 1 && i < row) && (j > 1 && j < col) ){
                    sum = matrix[i][j] + matrix[i - 2][j - 2] + matrix[i - 1][j - 1] + matrix[i - 1][j - 2]
                            + matrix[i][j - 2] + matrix[i - 2][j - 1] + matrix[i - 2][j] + matrix[i][j - 1] + matrix[i - 1][j];
                    if (sum > minSum){
                        minSum = sum;
                        x = i;
                        y = j;
                    }
                }

            }
        }

        System.out.println("Sum = " + minSum);
        for (int i = x - 2; i <= x; i++) {
            for (int j = y - 2; j <= y; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
} 
