import java.util.Scanner;

public class fillTheMatrixSmart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toFill = scanner.nextLine().split(",\\s+");
        int size = Integer.parseInt(toFill[0]);
        int[][] multi = new int[size][size];
        int c = 1;
        switch (toFill[1]){
            case "A":
                for (int row = 0; row < size; row++){
                    for (int col = 0; col < multi.length; col++) {
                        multi[col][row] = c++;
                    }
                }
                fillColumn(multi);
                break;
            case "B":
                for (int row = 0; row < size; row++){
                    if (row % 2 == 0) {
                        for (int col = 0; col < multi.length; col++) {
                            multi[col][row] = c++;
                        }
                    }else {

                        for (int col = 0; col < multi.length; col++) {
                            multi[multi.length - 1 -col][row] = c++;
                        }

                    }

                }
                fillColumn(multi);
                break;
        }
        System.out.println();
    }

    private static void fillColumn(int[][] multi) {
        for (int row = 0; row < multi.length; row++){
            for (int col = 0; col < multi.length; col++) {
                System.out.print(multi[row][col] + " ");
            }
            System.out.println();
        }
    }
}
