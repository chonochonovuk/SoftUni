import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());
        boolean weekday = (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")
                || day.equals("friday"));
        boolean weekend = (day.equals("saturday") || day.equals("sunday"));

        if (fruit.equals("banana") && weekday) {
            quantity = quantity * 2.50;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("apple") && weekday){
            quantity = quantity*1.20;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("orange") && weekday){
            quantity = quantity*0.85;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("grapefruit") && weekday){
            quantity = quantity*1.45;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("kiwi") && weekday){
            quantity = quantity*2.70;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("pineapple") && weekday){
            quantity = quantity*5.50;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("grapes") && weekday){
            quantity = quantity*3.85;
            System.out.printf("%.2f",quantity);
        }else if (fruit.equals("banana") && weekend) {
            quantity = quantity * 2.70;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("apple") && weekend){
            quantity = quantity*1.25;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("orange") && weekend){
            quantity = quantity*0.90;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("grapefruit") && weekend){
            quantity = quantity*1.60;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("kiwi") && weekend){
            quantity = quantity*3.00;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("pineapple") && weekend){
            quantity = quantity*5.60;
            System.out.printf("%.2f",quantity);
        }else if(fruit.equals("grapes") && weekend){
            quantity = quantity*4.20;
            System.out.printf("%.2f",quantity);
        }else{
            System.out.println("error");
        }
    }
}
