import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottleCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        bottleCount = bottleCount*750;
        int times = 0;
        int t = 0;
        int p = 0;
        int ml = 0;

        while (!type.equals("End")){
            int quantity = Integer.parseInt(type);

            times++;

            if(times == 3){

                bottleCount = bottleCount - quantity*15;

                t+= quantity;
                times = 0;

            }else if(times != 0){

                bottleCount = bottleCount - quantity * 5;

                p+= quantity;
            }

            if(bottleCount < 0){
                bottleCount = Math.abs(bottleCount);
                System.out.printf("Not enough detergent, %d ml. more necessary!",bottleCount);
                break;
            }

            type = scanner.nextLine();
        }

        if(type.equals("End")){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n",p,t);
            System.out.printf("Leftover detergent %d ml.",bottleCount);
        }
    }
}
