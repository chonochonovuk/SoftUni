import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine().replaceAll("\\D+","");
        int degrees = Integer.parseInt(command);
        int rotations = 0;
        if (degrees != 0){
            rotations = degrees / 90;
            rotations = rotations % 4;
        }

        String lines;
        Deque<String> allLines = new ArrayDeque<>();
        int maxCols = 0;
        while (!"END".equals(lines = scanner.nextLine())){
            int length = lines.length();
            if (length > maxCols){
                maxCols = length;
            }
            allLines.offer(lines);
        }
        int row = allLines.size();
        char[][] enterTheMatrix = new char[row][maxCols];
        for (int i = 0; i < row; i++) {
            String toFill = allLines.poll();
            for (int j = 0; j < toFill.length(); j++) {

                enterTheMatrix[i][j] = toFill.charAt(j);
            }
        }

        switch (rotations){
            case 0:
                normalPrint(enterTheMatrix);
                break;
            case 1:
                print90(enterTheMatrix,row,maxCols);
                break;
            case 2:
                print180(enterTheMatrix,row,maxCols);
                break;
            case 3:
                print270(enterTheMatrix,row,maxCols);
                break;
        }
    }

    private static void print270(char[][] enterTheMatrix, int row, int maxCols) {
        for (int i = maxCols - 1; i >= 0; i--) {
            for (int j = 0; j < row; j++) {
                char toCheck = '\u0000';
                if (enterTheMatrix[j][i] == toCheck){
                    System.out.print(" ");
                    continue;
                }
                System.out.print(enterTheMatrix[j][i]);
            }
            System.out.println();
        }
    }

    private static void print180(char[][] enterTheMatrix, int row, int maxCols) {
        for (int i = row - 1; i >= 0; i--) {
            for (int j = maxCols - 1; j >= 0; j--) {
                char toCheck = '\u0000';
                if (enterTheMatrix[i][j] == toCheck){
                    System.out.print(" ");
                    continue;
                }
                System.out.print(enterTheMatrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void print90(char[][] enterTheMatrix,int row,int col) {
        for (int i = 0; i < col; i++) {
            for (int j = row - 1; j >= 0; j--) {
                char toCheck = '\u0000';
                if (enterTheMatrix[j][i] == toCheck){
                    System.out.print(" ");
                    continue;
                }
                System.out.print(enterTheMatrix[j][i]);
            }
            System.out.println();
        }
    }

    private static void normalPrint(char[][] enterTheMatrix) {
        for (int i = 0; i < enterTheMatrix.length; i++) {
            for (int j = 0; j < enterTheMatrix[i].length; j++) {
                char toCheck = '\u0000';
                if (enterTheMatrix[i][j] == toCheck) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(enterTheMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
