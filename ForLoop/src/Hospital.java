import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int Treated = 0;
        int Untreated = 0;

        for (int k = 1; k <= time ; k++){
            int patients = Integer.parseInt(scanner.nextLine());

            if (k % 3 == 0 && Untreated > Treated){
                doctors++;
            }

            if(patients > doctors){
                Untreated += (patients - doctors);
                Treated += doctors;
            }else {
                Treated += patients;
            }




        }

        System.out.printf("Treated patients: %d.\n", Treated);
        System.out.printf("Untreated patients: %d.\n", Untreated);


    }
}
