import java.util.Scanner;

public class GameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sales = Integer.parseInt(scanner.nextLine());
        double h = 0;
        double f = 0;
        double ov = 0;
        double oth = 0;
        char s = '%';

        for (int i = 1; i <= sales; i++){
            String game = scanner.nextLine();

            switch (game){
                case "Hearthstone":
                    h++;
                    break;
                case "Fornite":
                    f++;
                    break;
                case "Overwatch":
                    ov++;
                    break;
                default:
                    oth++;
                    break;
            }


        }

        h = h/sales*100;
        f = f/sales*100;
        ov = ov/sales*100;
        oth = oth/sales*100;
        System.out.printf("Hearthstone - %.2f%c\n",h,s);
        System.out.printf("Fornite - %.2f%c\n",f,s);
        System.out.printf("Overwatch - %.2f%c\n",ov,s);
        System.out.printf("Others - %.2f%c\n",oth,s);
    }
}
