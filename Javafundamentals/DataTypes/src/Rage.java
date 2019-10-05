import java.util.Scanner;

public class Rage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = Integer.parseInt(scanner.nextLine());
        double headPr = Double.parseDouble(scanner.nextLine());
        double micePr = Double.parseDouble(scanner.nextLine());
        double kbdPr = Double.parseDouble(scanner.nextLine());
        double dspPr = Double.parseDouble(scanner.nextLine());
        int heads = 0;
        int mices = 0;
        int key = 0;
        int dsp = 0;

        for (int i = 1; i <= games; i++){
            if (i % 2 == 0){
                heads++;
            }
            if (i % 3 == 0){
                mices++;
            }
            if (i % 6 == 0){
                key++;
            }
            if (i % 12 == 0){
                dsp++;
            }

        }

        double tot = heads*headPr + mices*micePr + key*kbdPr + dsp*dspPr;
        System.out.printf("Rage expenses: %.2f lv.",tot);

    }
}
