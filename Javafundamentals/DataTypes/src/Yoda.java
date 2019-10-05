import java.util.Scanner;

public class Yoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabre = Double.parseDouble(scanner.nextLine());
        double robe = Double.parseDouble(scanner.nextLine());
        double belt = Double.parseDouble(scanner.nextLine());
        int noFree = 0;
        int beltPr = 0;
        for (int i = 1; i <= students; i++){
            ++noFree;
            if (noFree != 6){
                beltPr++;
            }else{
                noFree = 0;
            }

        }
        double total = sabre*(Math.ceil(students*1.1)) + robe*students + beltPr*belt;

        if (total <= money){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }else{
            total = total - money;
            System.out.printf("Ivan Cho will need %.2flv more.",total);
        }

    }
}
