import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int musician = Integer.parseInt(scanner.nextLine());
        String people = scanner.nextLine();
        int amount = 0;
        int p = 0;

        while (!people.equals("The restaurant is full")) {

            int ppl = Integer.parseInt(people);

            if (ppl < 5) {
                amount += ppl * 100;
                p += ppl;
                ppl = 0;
                people = scanner.nextLine();
                continue;
            }else{
                amount += ppl*70;
                p += ppl;
                ppl = 0;
                people = scanner.nextLine();
                continue;
            }
        }

        if (people.equals("The restaurant is full") && amount >= musician){

            System.out.printf("You have %d guests and %d leva left.",p,(amount - musician));

        }else if(people.equals("The restaurant is full") && amount < musician){
            System.out.printf("You have %d guests and %d leva income, but no singer.",p,amount);
        }


    }
}
