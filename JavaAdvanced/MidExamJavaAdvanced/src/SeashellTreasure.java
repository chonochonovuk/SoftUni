import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SeashellTreasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        char[][] shellsOnTheBeach = new char[rows][];
        List<String> shellCollection = new ArrayList<>();
        int stolenShells = 0;
        for (int i = 0; i < rows; i++) {
           String[] column = scanner.nextLine().split("\\s+");
           shellsOnTheBeach[i] = new char[column.length];
            for (int j = 0; j < shellsOnTheBeach[i].length; j++) {
                shellsOnTheBeach[i][j] = column[j].charAt(0);
            }
        }
        String comm;
        while (!"Sunset".equals(comm = scanner.nextLine())){
            String[] arrComm = comm.split("\\s+");
            switch (arrComm[0]){
                case "Collect":
                    int rowCollect = Integer.parseInt(arrComm[1]);
                    int colCollect = Integer.parseInt(arrComm[2]);
                    if (isInRange(rowCollect,colCollect,shellsOnTheBeach)){
                        String collect = String.valueOf(shellsOnTheBeach[rowCollect][colCollect]);
                        shellCollection.add(collect);
                        shellsOnTheBeach[rowCollect][colCollect] = '-';
                    }
                    break;
                case "Steal":
                    int row = Integer.parseInt(arrComm[1]);
                    int col = Integer.parseInt(arrComm[2]);
                    if (isInRange(row,col,shellsOnTheBeach)){
                        switch (arrComm[3]){
                            case "up":
                                for (int i = 0; i < 4; i++) {
                                    if (isInRange(row,col,shellsOnTheBeach) && shellsOnTheBeach[row][col] != '-'){
                                        shellsOnTheBeach[row][col] = '-';
                                        stolenShells++;
                                    }
                                    row--;
                                }
                                break;
                            case "down":
                                for (int i = 0; i < 4; i++) {
                                    if (isInRange(row,col,shellsOnTheBeach) && shellsOnTheBeach[row][col] != '-'){
                                        shellsOnTheBeach[row][col] = '-';
                                        stolenShells++;
                                    }
                                    row++;
                                }
                                break;
                            case "left":
                                for (int i = 0; i < 4; i++) {
                                    if (isInRange(row,col,shellsOnTheBeach) && shellsOnTheBeach[row][col] != '-'){
                                        shellsOnTheBeach[row][col] = '-';
                                        stolenShells++;
                                    }
                                    col--;
                                }
                                break;
                            case "right":
                                for (int i = 0; i < 4; i++) {
                                    if (isInRange(row,col,shellsOnTheBeach) && shellsOnTheBeach[row][col] != '-'){
                                        shellsOnTheBeach[row][col] = '-';
                                        stolenShells++;
                                    }
                                    col++;
                                }
                                break;
                        }
                    }

                    break;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < shellsOnTheBeach[i].length; j++) {
                System.out.print(shellsOnTheBeach[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Collected seashells: ");
        if (shellCollection.isEmpty()){
            System.out.print(0);
        }else {
            System.out.print(shellCollection.size()+ " -> "+ shellCollection.toString().replaceAll("[\\[\\]]",""));
        }
        System.out.println();
        System.out.printf("Stolen seashells: %d%n",stolenShells);


    }

    private static boolean isInRange(int rowCollect, int colCollect, char[][] shellsOnTheBeach) {
        return (rowCollect >= 0 && rowCollect < shellsOnTheBeach.length) && (colCollect >= 0 && colCollect < shellsOnTheBeach[rowCollect].length);
    }


}
