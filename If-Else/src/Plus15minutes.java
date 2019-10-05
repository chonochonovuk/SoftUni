import java.util.Scanner;

public class Plus15minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int addtime = minutes + 15;
        if (addtime > 60) {
            hour += 1;
            addtime = addtime%60;
            if (hour == 24) {
                hour = 0;
                if (addtime < 10) {
                    System.out.printf("%d:0%d", hour, addtime);
                } else {
                    System.out.printf("%d:%d", hour, addtime);
                }
            }else if(addtime < 10) {
                System.out.printf("%d:0%d", hour, addtime);
            }else {
                System.out.printf("%d:%d", hour, addtime);
            }


        } else if (addtime == 60){
            hour += 1;
            addtime = 0;
            if (hour == 24) {
                hour = 0;
                System.out.printf("%d:0%d", hour, addtime);
                } else {
                    System.out.printf("%d:0%d", hour, addtime);
                }
            }else if(addtime < 10) {
                System.out.printf("%d:0%d", hour, addtime);
            } else {
                System.out.printf("%d:%d", hour, addtime);
            }
        }

    }

