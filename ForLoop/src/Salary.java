import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for(int k = 0; k < n; k++ ){

            String tab = scanner.nextLine();

            if(tab.equals("Facebook")){
                salary -= 150;
            }else if(tab.equals("Instagram")){
                salary -= 100;
            }else if(tab.equals("Reddit")){
                salary -= 50;
            }else {
                salary += 0;
            }

            if(salary <= 0){
                System.out.println("You have lost your salary.");
                break;
            }

        }

        if(salary > 0){
            System.out.printf("%d", salary);
        }
    }
}
