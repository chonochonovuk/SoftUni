import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        int f = 0;
        int e = 0;
        int s = 0;
        int o = 0;

        for(int i = 1; i <= orders;i++){

            String pruducts = scanner.nextLine();

            while (!pruducts.equals("Bake!")){

                if(pruducts.equals("flour")){
                    f = 1;
                    pruducts = scanner.nextLine();
                }else if(pruducts.equals("eggs")){
                    e = 1;
                    pruducts = scanner.nextLine();
                }else if(pruducts.equals("sugar")){
                    s = 1;
                    pruducts = scanner.nextLine();
                }else {

                    pruducts = scanner.nextLine();
                }

            }

            if(f + e + s == 3){
                System.out.printf("Baking batch number %d...\n",i);
                f = 0;
                e = 0;
                s = 0;
            }else {
                System.out.println("The batter should contain flour, eggs and sugar!");
                i--;
            }
        }
    }
}
