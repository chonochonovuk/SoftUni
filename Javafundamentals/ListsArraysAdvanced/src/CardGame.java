import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();

        List<Integer> playerOne = Arrays.stream(player1.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(player2.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int i = 0;
        while (!(playerOne.isEmpty() || playerTwo.isEmpty())) {

            int biggerCard = 0;
            int smallerCard = 0;
            if (playerOne.get(i) > playerTwo.get(i)) {
                biggerCard = playerOne.get(i);
                smallerCard = playerTwo.get(i);
                playerOne.remove(i);
                playerTwo.remove(i);
                playerOne.add(biggerCard);
                playerOne.add(smallerCard);
            } else if (playerOne.get(i) < playerTwo.get(i)) {
                biggerCard = playerTwo.get(i);
                smallerCard = playerOne.get(i);
                playerOne.remove(i);
                playerTwo.remove(i);
                playerTwo.add(biggerCard);
                playerTwo.add(smallerCard);
            } else if (playerOne.get(i).equals(playerTwo.get(i))) {
                playerOne.remove(i);
                playerTwo.remove(i);
            }

        }

        int pl1sum = playerOne.stream().mapToInt(e -> e).sum();
        int pl2sum = playerTwo.stream().mapToInt(e -> e).sum();

        if (pl1sum > pl2sum){
            System.out.printf("First player wins! Sum: %d",pl1sum);
        }else{
            System.out.printf("Second player wins! Sum: %d",pl2sum);
        }
    }
}
