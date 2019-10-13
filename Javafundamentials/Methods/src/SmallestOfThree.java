import java.util.Scanner;

public class SmallestOfThree {

    static int SmallestOf3(int a, int b, int c){

        if (a < b && a < c){
            return a;
        }else if (b < a && b < c){
            return b;
        }

        return c;

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(SmallestOf3(a,b,c));
    }
}
