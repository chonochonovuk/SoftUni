import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        int bCount = Integer.parseInt(scanner.nextLine());
        String match = scanner.nextLine();
        int totB = 0;

        while(!match.equals(book)){
            totB++;
            if(bCount == totB){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",totB);
                break;
            }

            match = scanner.nextLine();


        }

        if(match.equals(book)){
            System.out.printf("You checked %d books and found it.",totB);
        }
    }
}
