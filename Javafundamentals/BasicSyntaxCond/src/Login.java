import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        String a = scanner.nextLine();
        String reverse = "";
        int n = 0;
         for (int i = c.length() - 1; i >= 0 ; i--){
           reverse = reverse + c.charAt(i);
         }

         while (!a.equals(reverse)){
             ++n;
             if(n == 4){
                 System.out.println("User " + c +" blocked!");
                 break;
             }

             System.out.println("Incorrect password. Try again.");

             a = scanner.nextLine();

         }



         if (a.equals(reverse)){
             System.out.println("User " + c + " logged in.");
         }
    }
}
