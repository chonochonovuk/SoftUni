import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        String alert = "";
        if(speed <= 10){
            alert = "slow";
        }else if(speed > 10 && speed <=50) {
            alert = "average";
        }else if(speed > 50 && speed <=150) {
            alert = "fast";
        }else if(speed > 150 && speed <=1000) {
            alert = "ultra fast";
        }else {
            alert = "extremely fast";
        }
        System.out.println(alert);
    }
}
