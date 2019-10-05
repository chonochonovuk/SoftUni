import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examh = Integer.parseInt(scanner.nextLine());
        int examm = Integer.parseInt(scanner.nextLine());
        int arrh = Integer.parseInt(scanner.nextLine());
        int arrm = Integer.parseInt(scanner.nextLine());
        int examTotalm = examh*60 + examm;
        int arrTotalm = arrh*60 + arrm;
        int hours = 0;
        int min = 0;
        if(examTotalm > arrTotalm){
            min = examTotalm - arrTotalm;
            if(min <= 30){
                System.out.printf("On time\n%d minutes before the start",min);
            }else if(min > 30 && min <60){
                    System.out.printf("Early\n%d minutes before the start",min);
                }else if(min > 60){
                hours = min/60;
                min = min%60;
                if(min <= 9) {
                    System.out.printf("Early\n%d:0%d hours before the start", hours, min);
                }else{
                    System.out.printf("Early\n%d:%d hours before the start", hours, min);
                }
            }else if(min == 60){
                System.out.println("Early\n1:00 hours before the start");
            }

        }else if(examTotalm < arrTotalm){
            min = arrTotalm - examTotalm;
            if(min <60){
                System.out.printf("Late\n%d minutes after the start",min);
            }else if(min > 60){
                hours = min/60;
                min = min%60;
                if(min <= 9) {
                    System.out.printf("Late\n%d:0%d hours after the start", hours, min);
                }else{
                    System.out.printf("Late\n%d:%d hours after the start", hours, min);
                }
            }else if(min == 60){
                System.out.println("Late\n1:00 hours after the start");
            }
        }else if(examTotalm == arrTotalm){
            System.out.println("On time");
        }
    }
}
