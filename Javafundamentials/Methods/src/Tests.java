import java.util.Arrays;
import java.util.Scanner;

public class Tests {
    /* static int SmallestOf3(int a, int b){

        if (a < b){
            return a;
        }
            return b;

    }
    static int SmallestOf3(int a, int b, int c){
        return SmallestOf3(SmallestOf3(a,b),c);
    }

*/
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(SmallestOf3(a,b,c));

 */


       String test = "0 0 0 0";
       test = test.replace(" ","");
       test = test.replace("0", "");


       boolean Zeros = false;

       if (test.length() == 0){
           Zeros = true;
       }

        System.out.println(test);
        System.out.println(Zeros);


    }
}
