import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        String[][] swapping = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                swapping[i][j] = scanner.next();
            }
        }
        String toAvoid = scanner.nextLine();
        String command;
        while (!"END".equals(command = scanner.nextLine())) {
            String[] commArr = command.split("\\s+");
            if ("swap".equals(commArr[0]) && commArr.length == 5) {
                int a = Integer.parseInt(commArr[1]);
                boolean checkA = (a >= 0 && a < row);
                int b = Integer.parseInt(commArr[2]);
                checkA = (b >= 0 && b < col);
                int c = Integer.parseInt(commArr[3]);
                checkA = (c >= 0 && c < row);
                int d = Integer.parseInt(commArr[4]);
                checkA = (d >= 0 && d < col);
                String toSwap = "";
                if (checkA) {
                    toSwap = swapping[a][b];
                    swapping[a][b] = swapping[c][d];
                    swapping[c][d] = toSwap;

                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print(swapping[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
