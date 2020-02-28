package jediGalaxy;

import jediGalaxy.Evil;
import jediGalaxy.Matrix;
import jediGalaxy.Player;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix matrixs = getIntsAsMatrix(scanner);


        String command = scanner.nextLine();
            long sum = 0;
            while (!command.equals("Let the Force be with you")) {
                int[] ivoS = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
                int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                Evil evil = new Evil(evilCoordinates[0],evilCoordinates[1]);
                while (evil.checkXY())
                {
                    takenFromEvilPlayer(matrixs, evil);

                }


                Player player = new Player(ivoS[0],ivoS[1]);
                while (player.checkXY(0,matrixs.getMatrixColLength(1)))
                {

                    sum += takenFromPlayer(matrixs,player);

                }

                command = scanner.nextLine();
            }

        System.out.println(sum);


    }

    private static Matrix getIntsAsMatrix(Scanner scanner) {
        int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = dimestions[0];
        int y = dimestions[1];
        Matrix m = new Matrix(x,y);
        int value = 0;
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                m.setMatrixElement(i,j,value++);
            }
        }

        return m;
    }

    private static int takenFromPlayer(Matrix matrix, Player player) {
        int sum = 0;
        if (player.checkX(0,matrix.getMatrixRowLength()) && player.checkY(0,matrix.getMatrixColLength(0)))
        {
            sum = matrix.getMatrixElement(player.getX(),player.getY());
        }
        player.setY(player.getY() + 1);
        player.setX(player.getX() - 1);

        return sum;
    }

    private static void takenFromEvilPlayer(Matrix matrix, Evil evil) {
        if (evil.getX() >= 0 && evil.getX() < matrix.getMatrixRowLength() && evil.getY() >= 0 && evil.getY() < matrix.getMatrixColLength(0))
        {
            matrix.setMatrixElement(evil.getX(),evil.getY(),0);
        }
        evil.setX(evil.getX()-1);
        evil.setY(evil.getY() - 1);
    }


}
