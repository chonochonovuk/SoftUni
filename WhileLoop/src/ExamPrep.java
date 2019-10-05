import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowScr = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        int lS = 0;
        int tS = 0;
        double scr = 0;
        String n = "";

        while (!name.equals("Enough")){

            double rS = Double.parseDouble(scanner.nextLine());

            if(rS <= 4.00 ){
                lS++;
                if(lowScr == lS){
                    System.out.printf("You need a break, %d poor grades.",lS);
                    break;
                }
            }
            n = name;
            scr += rS;
            tS++;
            name = scanner.nextLine();

        }

        if(name.equals("Enough")){

            scr = scr/tS;

            System.out.printf("Average score: %.2f\n",scr);
            System.out.printf("Number of problems: %d\n",tS);
            System.out.printf("Last problem: %s\n",n);

        }
    }
}
