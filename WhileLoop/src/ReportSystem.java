import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int need = Integer.parseInt(scanner.nextLine());
        String pay = scanner.nextLine();
        int payCount = 0;
        int cash = 0;
        int card = 0;
        double collectCash = 0;
        double collectCard = 0;

        while (!pay.equals("End")){
            int paid = Integer.parseInt(pay);
            payCount++;

            if(payCount == 1){
                if(paid > 100){
                    System.out.println("Error in transaction!");
                }else{
                    collectCash += paid;
                    cash++;
                    need -= paid;
                    System.out.println("Product sold!");
                }

            }else if(payCount == 2){
                if(paid < 10){
                    System.out.println("Error in transaction!");
                    payCount = 0;
                }else{
                    collectCard += paid;
                    card++;
                    payCount = 0;
                    need -= paid;
                    System.out.println("Product sold!");
                }

                if(need <= 0){
                    collectCash = collectCash/cash;
                    collectCard = collectCard/card;
                    System.out.printf("Average CS: %.2f\n",collectCash);
                    System.out.printf("Average CC: %.2f\n",collectCard);
                    break;
                }
            }
            pay = scanner.nextLine();
        }

        if(pay.equals("End")){
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
