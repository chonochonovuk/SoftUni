import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        int tot = 0;
        String steps = scanner.nextLine();
        while (!steps.equals("Going home")){
            int stpInt = Integer.parseInt(steps);
            tot += stpInt;
             if(goal <= tot){
                 System.out.println("Goal reached! Good job!");
                 break;
             }
            steps = scanner.nextLine();
        }

        if (steps.equals("Going home")){
            steps = scanner.nextLine();
            int stpInt = Integer.parseInt(steps);
            tot += stpInt;

            if(goal <= tot){
                System.out.println("Goal reached! Good job!");

            }else{
                goal -= tot;
                System.out.printf("%d more steps to reach goal.",goal);
            }


        }
    }
}
