import java.util.HashMap;
import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int seats = 0;
        String ticketType = "";
        String total = "";

        int idx = 0;
        double stud = 0.0;
        double stan = 0.0;
        double kids = 0.0;
        double studAll = 0.0;
        double stanAll = 0.0;
        double kidsAll = 0.0;
        double result = stud + stan +kids;


        HashMap<String,String> movieAll = new HashMap<String, String>();

        String[] movie = new String[20];


        while (!movieName.equals("Finish")) {
            seats = Integer.parseInt(scanner.nextLine());
            ticketType = scanner.nextLine();
            stud = 0.0;
            stan = 0.0;
            kids = 0.0;

            while (!ticketType.equals("End")) {

                if(ticketType.equals("student")) {
                    stud++;
                }else if(ticketType.equals("standard")) {
                    stan++;
                }else if(ticketType.equals("kid")) {
                    kids++;
                }
                if((stud + stan + kids) == seats) {
                break;}

                ticketType = scanner.nextLine();

            }
            movie[idx] = movieName;
            result = stud + stan +kids;
            result = result/seats*100;
            studAll += stud;
            stanAll += stan;
            kidsAll += kids;
            movieAll.put(movie[idx],result + "");
            idx++;
            movieName = scanner.nextLine();


        }


        for(int i = 0; i<idx;i++){
            total = movieAll.get(movie[i]).toString();
            result = Double.valueOf(total);

            System.out.printf("%s - %.2f%% full.%n",movie[i],result);

        }

        result = studAll + stanAll +kidsAll;
        stud = studAll/result*100;
        stan = stanAll/result*100;
        kids = kidsAll/result*100;
        System.out.printf("Total tickets: %.0f%n",result);
        System.out.printf("%.2f%% student tickets.%n",stud);
        System.out.printf("%.2f%% standard tickets.%n",stan);
        System.out.printf("%.2f%% kids tickets.%n",kids);

    }
}
