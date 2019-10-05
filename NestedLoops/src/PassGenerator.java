import java.util.Scanner;

public class PassGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int m = 0;
        char A = 35;
        char B = 64;


                for(int x = 1; x <= a; x++){
                    for(int y = 1; y <= b; y++){

                        if(m == max){
                            return;
                        }
                        if(A == 56){
                            A = 35;
                        }
                        if(B == 97){
                            B = 64;
                        }

                        System.out.printf("%c%c%d%d%c%c|",A,B,x,y,B,A);
                        m++;


                        A++;
                        B++;
                    }

                }


    }
}
