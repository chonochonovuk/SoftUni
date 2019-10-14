import java.util.Scanner;

public class AddSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(AddSubs(scanner));
    }

    static int AddSubs(Scanner scanner){
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        return (a + b) - c;
    }


}
