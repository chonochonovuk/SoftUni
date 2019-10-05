import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        String type = scanner.nextLine();
        String data = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double cost = 0.00;
        double[][] plan = new double[2][4];
        plan[0][0] = 9.98;
        plan[0][1] = 18.99;
        plan[0][2] = 25.98;
        plan[0][3] = 35.99;
        plan[1][0] = 8.58;
        plan[1][1] = 17.09;
        plan[1][2] = 23.59;
        plan[1][3] = 31.79;

        if(data.equals("yes")){
            plan[0][0] = 9.98 + 5.50;
            plan[0][1] = 18.99 + 4.35;
            plan[0][2] = 25.98 + 4.35;
            plan[0][3] = 35.99 + 3.85;
            plan[1][0] = 8.58 + 5.50;
            plan[1][1] = 17.09 + 4.35;
            plan[1][2] = 23.59 + 4.35;
            plan[1][3] = 31.79 + 3.85;
        }

        if(time.equals("one")) {
            if(type.equals("Small")){
                cost = plan[0][0]*months;
                System.out.printf("%.2f lv.",cost);
            }else if(type.equals("Middle")){
                cost = plan[0][1]*months;
                System.out.printf("%.2f lv.",cost);
            }else if(type.equals("Large")){
                cost = plan[0][2]*months;
                System.out.printf("%.2f lv.",cost);
            }else if(type.equals("ExtraLarge")){
                cost = plan[0][3]*months;
                System.out.printf("%.2f lv.",cost);
            }
        }else if(time.equals("two")){
            if(type.equals("Small")){
                cost = plan[1][0]*months;
                cost = cost - cost*0.0375;
                System.out.printf("%.2f lv.",cost);
            }else if(type.equals("Middle")){
                cost = plan[1][1]*months;
                cost = cost - cost*0.0375;
                System.out.printf("%.2f lv.",cost);
            }else if(type.equals("Large")){
                cost = plan[1][2]*months;
                cost = cost - cost*0.0375;
                System.out.printf("%.2f lv.",cost);
            }else if(type.equals("ExtraLarge")){
                cost = plan[1][3]*months;
                cost = cost - cost*0.0375;
                System.out.printf("%.2f lv.",cost);
            }

        }



    }
}
