import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String y = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double p2 = 0;
        int h2 = 0;
        double wend = 48.00;
        wend = (wend - h)*3.0/4;
        p2 = p*2.0/3;
        double total = p2 + wend + h;

        if(y.equals("leap")){
            total = Math.floor(total*1.15);
            h2 = ((int) total);
            System.out.printf("%d",h2);
        }else if(y.equals("normal")){
            total = Math.floor(total);
            h2 = ((int) total);
            System.out.printf("%d",h2);
        }

    }
}
