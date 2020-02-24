import java.util.Arrays;
import java.util.Scanner;

public class ReVolt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int count =Integer.parseInt(scanner.nextLine());
        String[][] playerMatrix = new String[size][size];
        int rowPlayer = 0;
        int colPl = 0;
        for (int i = 0; i < playerMatrix.length; i++) {
            String sequence = scanner.nextLine();
            for (int j = 0; j < playerMatrix[i].length; j++) {
                if (sequence.charAt(j) == 'f'){
                    rowPlayer = i;
                    colPl = j;
                }
                playerMatrix[i][j] = String.valueOf(sequence.charAt(j));

            }
        }
        String position = "";
        for (int i = 0; i < count; i++){

            String comm = scanner.nextLine();
            checkMoves(rowPlayer,colPl,playerMatrix);
            switch (comm){
                case "up":
                    position = checkMoves(rowPlayer = checkIf(rowPlayer - 1,playerMatrix),colPl,playerMatrix);
                    while (!position.equals("f") && !position.equals("F")){
                        if (position.equals("B")){
                            position = checkMoves(rowPlayer = checkIf(rowPlayer - 1,playerMatrix),colPl,playerMatrix);
                        }
                        if (position.equals("T")){
                            position = checkMoves(rowPlayer = checkIf(rowPlayer + 1,playerMatrix),colPl,playerMatrix);
                        }
                    }

                    break;
                case "down":
                    position = checkMoves(rowPlayer = checkIf(rowPlayer + 1,playerMatrix),colPl,playerMatrix);
                    while (!position.equals("f") && !position.equals("F")){
                        if (position.equals("B")){
                           position = checkMoves(rowPlayer = checkIf(rowPlayer + 1,playerMatrix),colPl,playerMatrix);
                        }
                        if (position.equals("T")){
                            position = checkMoves(rowPlayer = checkIf(rowPlayer - 1,playerMatrix),colPl,playerMatrix);
                        }
                    }

                    break;
                case "left":
                    position = checkMoves(rowPlayer,colPl = checkIf(colPl - 1,playerMatrix),playerMatrix);
                    while (!position.equals("f") && !position.equals("F")){
                        if (position.equals("B")){
                           position = checkMoves(rowPlayer,colPl = checkIf(colPl - 1,playerMatrix),playerMatrix);
                        }
                        if (position.equals("T")){
                           position = checkMoves(rowPlayer,colPl = checkIf(colPl + 1,playerMatrix),playerMatrix);
                        }
                    }

                    break;
                case "right":
                    position = checkMoves(rowPlayer,colPl = checkIf(colPl + 1,playerMatrix),playerMatrix);
                    while (!position.equals("f") && !position.equals("F")){
                        if (position.equals("B")){
                           position = checkMoves(rowPlayer,colPl = checkIf(colPl + 1,playerMatrix),playerMatrix);
                        }
                        if (position.equals("T")){
                           position = checkMoves(rowPlayer,colPl = checkIf(colPl - 1,playerMatrix),playerMatrix);
                        }
                    }

                    break;
            }

            if (position.equals("F")){
                break;
            }
        }

        if (position.equals("F")){
            System.out.println("Player won!");
        }else {
            System.out.println("Player lost!");
        }



        for (int i = 0; i < playerMatrix.length; i++) {
            for (int j = 0; j < playerMatrix[i].length; j++) {
                System.out.print(playerMatrix[i][j]);
            }
            System.out.println();
        }

    }

    private static int checkIf(int i, String[][] playerMatrix) {
        if(i < 0){
           return i = playerMatrix.length - 1;
        }
        if (i >= playerMatrix.length){
           return i = 0;
        }
        return i;
    }


    private static String checkMoves(int i, int colPl, String[][] playerMatrix) {

        if (playerMatrix[i][colPl].equals("f")){
            return playerMatrix[i][colPl] = "-";
        }


        if (playerMatrix[i][colPl].equals("-")){
            return playerMatrix[i][colPl] = "f";
        }

        if (playerMatrix[i][colPl].equals("F")){
            playerMatrix[i][colPl] = "f";
            return "F";
        }
        return playerMatrix[i][colPl];
    }
}
