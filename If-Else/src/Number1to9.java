import java.util.Scanner;

public class Number1to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkNumber = Integer.parseInt(scanner.nextLine());
        if (checkNumber == 1){
            System.out.println("one");
        }else if(checkNumber == 2){
            System.out.println("two");
        }else if(checkNumber == 3){
            System.out.println("three");
        }else if(checkNumber == 4){
            System.out.println("four");
        }else if(checkNumber == 5){
            System.out.println("five");
        }else if(checkNumber == 6){
            System.out.println("six");
        }else if(checkNumber == 7){
            System.out.println("seven");
        }else if(checkNumber == 8){
            System.out.println("eight");
        }else if(checkNumber == 9){
            System.out.println("nine");
        }else {
            System.out.println("number too big");
        }
    }
}
