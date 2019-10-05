import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        while (true){
            String country = scanner.nextLine();
            if(country.equals("End")){
                break;
            }

           double budget = Double.parseDouble(scanner.nextLine());


            double saved = 0;

            while (true){

               String savve = scanner.nextLine();

               if(savve.equals("End")){
                   return;
               }

                saved += Double.parseDouble(savve);

                if(saved >= budget){
                    System.out.println("Going to " + country + "!");
                    break;
                }

            }





        }
    }
}
