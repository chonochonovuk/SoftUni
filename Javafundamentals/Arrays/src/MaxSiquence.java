import java.util.Scanner;

public class MaxSiquence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] numOfStr = numbers.split(" ");
        int[] numOfInt = new int[numOfStr.length];

        for (int a = 0 ; a < numOfInt.length ; a++){
            numOfInt[a] = Integer.parseInt(numOfStr[a]);
        }

        int max = 0;
        int i = 0;
        int num = 0;
        StringBuilder maxSq = new StringBuilder();

        for (int y = 0 ; y < numOfInt.length - 1; y++){
            int f = numOfInt[y];
            for (int x = 1 + y ; x < numOfInt.length ; x++){
                int d = numOfInt[x];
                if (f == d){
                    ++i;
                    if (i > max){
                        num = f;
                        max = i;
                    }
                }else {
                    i = 0;
                    break;
                }
            }
            i = 0;
        }

        for (int h = 0 ; h < max + 1; h++){
            maxSq.append(num).append(" ");
        }

        System.out.println(maxSq);
    }
}
