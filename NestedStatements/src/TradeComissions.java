import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        double result = 0;
        switch (city){
            case "sofia":
                if((sales >= 0 && sales <= 500)){
                    result = sales*0.05;
                    System.out.printf("%.2f",result);
                }else if((sales > 500 && sales <= 1000 )){
                    result = sales*0.07;
                    System.out.printf("%.2f",result);
                }else if((sales > 1000 && sales <= 10000 )){
                    result = sales*0.08;
                    System.out.printf("%.2f",result);
                }else if(sales > 10000){
                    result = sales*0.12;
                    System.out.printf("%.2f",result);
                }else{
                    System.out.println("error");
                }
                break;
            case "varna":
                if((sales >= 0 && sales <= 500)){
                    result = sales*0.045;
                    System.out.printf("%.2f",result);
                }else if((sales > 500 && sales <= 1000 )){
                    result = sales*0.075;
                    System.out.printf("%.2f",result);
                }else if((sales > 1000 && sales <= 10000 )){
                    result = sales*0.10;
                    System.out.printf("%.2f",result);
                }else if(sales > 10000){
                    result = sales*0.13;
                    System.out.printf("%.2f",result);
                }else{
                    System.out.println("error");
                }
                break;
            case "plovdiv":
                if((sales >= 0 && sales <= 500)){
                    result = sales*0.055;
                    System.out.printf("%.2f",result);
                }else if((sales > 500 && sales <= 1000 )){
                    result = sales*0.08;
                    System.out.printf("%.2f",result);
                }else if((sales > 1000 && sales <= 10000 )){
                    result = sales*0.12;
                    System.out.printf("%.2f",result);
                }else if(sales > 10000){
                    result = sales*0.145;
                    System.out.printf("%.2f",result);
                }else{
                    System.out.println("error");
                }
                break;
                default:
                    System.out.println("error");

        }
    }
}
