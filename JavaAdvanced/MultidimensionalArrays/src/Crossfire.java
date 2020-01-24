import java.util.*;

public class Crossfire {
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
        int rowStart = Math.max((bombRow - bombRadius), 0);
        int rowEnd = Math.min((bombRow + bombRadius), matrix.size());
        int colStart = Math.max((bombCol - bombRadius), 0);
        int colEnd = Math.min((bombCol + bombRadius),matrix.get(bombRow).size());

        for (int i = rowStart; i < rowEnd ; i++) {
            if ((i != bombRow) && matrix.get(i).size() >= bombCol) {
                matrix.get(i).remove(bombCol);
            }
            if (i == bombRow) {
                for (int j = colStart; j < colEnd; j++) {
                    matrix.get(i).remove(colStart);
                }
            }
        }
    }
}
