import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        unlockTank(scanner);
    }

    private static void unlockTank(Scanner scanner) {
        double neededExperience = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());
        double experienceEarnedPerBattle = 0;
        int totBattles = 0;
        double gainedExp = 0;
        for (int i = 1; i <= countOfBattles; i++) {
            if (gainedExp >= neededExperience){
                break;
            }
            experienceEarnedPerBattle = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0){
                gainedExp += experienceEarnedPerBattle*1.15;
                totBattles++;
                continue;
            }
            if (i % 5 == 0){
                gainedExp += experienceEarnedPerBattle*0.90;
                totBattles++;
                continue;
            }
            gainedExp += experienceEarnedPerBattle;
            totBattles++;
        }

        if (gainedExp >= neededExperience){
            System.out.printf("Player successfully collected his needed experience for %d battles.",totBattles);
        }else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",Math.abs(gainedExp - neededExperience));
        }
    }
}
