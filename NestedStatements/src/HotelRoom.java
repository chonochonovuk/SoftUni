import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double pricec = 0;
        double pricea = 0;

        switch (month){
            case "May":
            case "October":
               if(nights > 7 && nights <=14){
                    pricec = (nights*50.00)*0.95;
                    pricea = (nights*65.00);
                    System.out.printf("Apartment: %.2f lv.\n",pricea);
                    System.out.printf("Studio: %.2f lv.",pricec);
                }else if(nights > 14){
                    pricec = (nights*50.00)*0.70;
                    pricea = (nights*65.00)*0.90;
                    System.out.printf("Apartment: %.2f lv.\n",pricea);
                    System.out.printf("Studio: %.2f lv.",pricec);
                }else{
                    pricec = (nights*50.00);
                    pricea = (nights*65.00);
                    System.out.printf("Apartment: %.2f lv.\n",pricea);
                    System.out.printf("Studio: %.2f lv.",pricec);
                }
                break;
            case "June":
            case "September":
                if(nights > 14){
                    pricec = (nights*75.20)*0.80;
                    pricea = (nights*68.70)*0.90;
                    System.out.printf("Apartment: %.2f lv.\n",pricea);
                    System.out.printf("Studio: %.2f lv.",pricec);
                }else{
                    pricec = (nights*75.20);
                    pricea = (nights*68.70);
                    System.out.printf("Apartment: %.2f lv.\n",pricea);
                    System.out.printf("Studio: %.2f lv.",pricec);
                }
                break;
            case "July":
            case "August":
               if(nights > 14){
                    pricec = (nights*76.00);
                    pricea = (nights*77.00)*0.90;
                    System.out.printf("Apartment: %.2f lv.\n",pricea);
                    System.out.printf("Studio: %.2f lv.",pricec);
                }else {
                    pricec = (nights*76.00);
                    pricea = (nights*77.00);
                    System.out.printf("Apartment: %.2f lv.\n",pricea);
                    System.out.printf("Studio: %.2f lv.",pricec);
                }
                break;
        }
    }
}
