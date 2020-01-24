import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crossfire2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int fill = 1;
        List<List<Integer>> multiMatrix = new ArrayList<>(rows);
        for (int i = 0; i < rows; i++) {
            multiMatrix.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                multiMatrix.get(i).add(fill++);
            }
        }
        String destroy;
        while (!"Nuke it from orbit".equals(destroy = scanner.nextLine())){
            String[] coordinates = destroy.split("\\s+");
            explodedDamage(coordinates,multiMatrix);

        }

        printMatrix(multiMatrix);

    }

    private static void printMatrix(List<List<Integer>> multiMatrix) {
        for (int i = 0; i < multiMatrix.size(); i++) {
            for (int j = 0; j < multiMatrix.get(i).size(); j++) {
                System.out.print(multiMatrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static void explodedDamage(String[] coordinates, List<List<Integer>> matrix) {
        int bombRow = Integer.parseInt(coordinates[0]);
        int bombCol = Integer.parseInt(coordinates[1]);
        int bombRadius = Integer.parseInt(coordinates[2]);
        int rowStart = bombRow - bombRadius;
        int rowEnd = bombRow + bombRadius;
        int colStart = bombCol - bombRadius;
        int colEnd = bombCol + bombRadius;

        for (int i = rowStart; i < rowEnd ; i++) {
            if (i >= 0 && i < matrix.size() && bombCol >= 0 && bombCol < matrix.get(i).size()) {
                matrix.get(i).remove(bombCol);
            }
        }
            for (int j = colEnd; j > colStart; j--) {
                if(bombRow >= 0 && bombRow < matrix.size() && j >= 0 && j < matrix.get(bombRow).size()){
                    matrix.get(bombRow).remove(j);
                }
            }

            matrix.removeIf(List::isEmpty);
    }
}
