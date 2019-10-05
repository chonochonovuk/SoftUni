import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        if (people <= capacity){
            System.out.println("1");
        }else if (people % capacity == 0){

            System.out.printf("%d",people/capacity);

        } else if (people % capacity != 0) {

            int courses = (int) Math.ceil((double) people/capacity);

            System.out.printf("%d",courses);
        }
    }
}
