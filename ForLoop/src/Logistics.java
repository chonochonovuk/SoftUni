import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        double lorry = 0;
        double truck = 0;
        double train = 0;
        double total = 0;
        double price = 0;
        char c = '%';

        for (int k = 0; k < times; k++){
            int tones = Integer.parseInt(scanner.nextLine());

            if(tones <= 3){
                lorry += tones;
            }else if(tones >= 4 && tones <= 11){
                truck += tones;
            }else if(tones >= 12){
                train += tones;
            }
        }

        total = lorry + truck + train;
        price = (lorry*200 + truck*175 + train*120)/total;
        lorry = lorry/total*100;
        truck = truck/total*100;
        train = train/total*100;

        System.out.printf("%.2f\n", price);
        System.out.printf("%.2f%c\n", lorry,c);
        System.out.printf("%.2f%c\n", truck,c);
        System.out.printf("%.2f%c\n", train,c);


    }
}
