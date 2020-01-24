import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerHealth = 18500;
        double haigenLife = 3000000;
        int playerRow = 7;
        int playerCol = 7;
        boolean[][] uninfected = new  boolean[15][15];
        boolean[][] safeMatrix = uninfected;
        boolean cloudSpell = false;
        double damage = Double.parseDouble(scanner.nextLine());
        while (true){
            String[] command = scanner.nextLine().split("\\s+");
            boolean isHit = false;
            if ((playerCol == Integer.parseInt(command[2]))
                    && (playerRow == Integer.parseInt(command[1]))){
                isHit = true;
            }

            haigenLife = haigenLife - damage;
            if (cloudSpell == true){
                playerHealth -= 3500;
                cloudSpell = false;
            }
            if (haigenLife <= 0){
                System.out.println("Heigan: Defeated!");
                if (playerHealth <= 0){
                    System.out.println("Player: Killed by Plague Cloud");
                }else {
                    System.out.printf("Player: %d%n",playerHealth);
                }
                System.out.printf("Final position: %d, %d",playerRow,playerCol);
                return;
            }

            if (playerHealth <= 0){
                System.out.printf("Heigan: %.2f%n",haigenLife);
                System.out.println("Player: Killed by Plague Cloud");
                System.out.printf("Final position: %d, %d",playerRow,playerCol);
                return;
            }

            if (!isHit){
                infectCells(command,uninfected);
                if (uninfected[playerRow][playerCol] == false){
                    continue;
                }
                if (((playerRow - 1) >= 0) && (uninfected[playerRow - 1][playerCol] == false)){
                    playerRow = playerRow - 1;
                    continue;
                }
                if (((playerCol + 1) < 15) && (uninfected[playerRow][playerCol + 1] == false)){
                    playerCol = playerCol + 1;
                    continue;
                }

                if (((playerRow + 1) < 15) && (uninfected[playerRow + 1][playerCol] == false)){
                    playerRow = playerRow + 1;
                    continue;
                }
                if (((playerCol - 1) >= 0) && (uninfected[playerRow][playerCol - 1] == false)){
                    playerCol = playerCol - 1;
                    continue;
                }

            }

            if (isHit) {
                switch (command[0]) {
                    case "Cloud":
                        command[0] = "Plague Cloud";
                            playerHealth = playerHealth - 3500;
                            cloudSpell = true;
                        break;
                    case "Eruption":
                            playerHealth = (playerHealth - 6000);
                        break;
                }
            }
            if (playerHealth <= 0){
                System.out.printf("Heigan: %.2f%n",haigenLife);
                System.out.println("Player: Killed by " + command[0]);
                System.out.printf("Final position: %d, %d",playerRow,playerCol);
                return;
            }
            uninfected = safeMatrix;
        }
    }

    private static void infectCells(String[] command, boolean[][] uninfected) {
        int plagueRow = Integer.parseInt(command[1]);
        int plagueCol = Integer.parseInt(command[2]);
        for (int i = plagueRow - 1; i <= plagueRow + 1; i++) {
            for (int j = plagueCol - 1; j <= plagueCol + 1; j++) {
                if ((i >= 0 && i < uninfected.length) && (j >= 0 && j < uninfected[i].length) ){
                    uninfected[i][j] = true;
                }
            }
        }
    }
}
