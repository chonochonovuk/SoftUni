import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int total = hours*60 + minutes + 30;

        hours = total/60;
        minutes = total % 60;

        if(minutes < 10){
            if (hours >= 24){
                hours = hours - 24;
            }
            System.out.printf("%d:0%d",hours,minutes);
        }else{
            if (hours >= 24){
                hours = hours - 24;
            }
            System.out.printf("%d:%d",hours,minutes);
        }

    }
}
