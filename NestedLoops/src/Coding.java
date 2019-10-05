import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();


        for(int l = number.length() - 1; l >= 0 ;l--){
            char c = number.charAt(l);
            int z = Integer.parseInt("" + c);

            if(z == 0){
                System.out.print("ZERO");
            }
            c = (char)(z + 33);

            for(int m = 0; m < z; m++ ){

                System.out.printf("%c",c);
            }
            System.out.println();
        }
    }
}
