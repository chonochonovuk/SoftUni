import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double profit = Double.parseDouble(scanner.nextLine());
        String sales = scanner.nextLine();
        double calc = 0;

        while (!sales.equals("Party!")){

            int tot = Integer.parseInt(scanner.nextLine());
            int i = sales.length();
            int odd = tot*i;

            if (odd%2 == 0) {
                calc += tot * i;
                odd = 0;
            }else {
                calc += (tot*i)*0.75;
                odd = 0;
            }


            if (calc >= profit){
                break;
            }
            sales = scanner.nextLine();
        }

        if(sales.equals("Party!")){

            System.out.printf("We need %.2f leva more.\n",(profit - calc));
            System.out.printf("Club income - %.2f leva.",calc);

        }else if(calc >= profit){
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.",calc);

        }
    }
}
