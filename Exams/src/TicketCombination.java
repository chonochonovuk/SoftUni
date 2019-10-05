import java.util.Scanner;

public class TicketCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comb = Integer.parseInt(scanner.nextLine());
        int count = 1;


        for (char a = 'B'; a <= 'L';a++){
            int even = (int)a;
            if (a%2 != 0){
                continue;
            }
            for (char b = 'f'; b >= 'a';b--){
                for (char c = 'A'; c <= 'C'; c++){
                    for (int d = 1; d <= 10;d++){
                        for (int f = 10; f >= 1;f-- ){
                            if(comb == count){
                                int aa = (int)a;
                                int bb = (int)b;
                                int cc = (int)c;

                                System.out.printf("Ticket combination: %c%c%c%d%d\n",a,b,c,d,f);
                                System.out.printf("Prize: %d lv.",(aa + bb + cc + d + f));
                            }

                            count++;
                        }
                    }
                }
            }
        }
    }
}
