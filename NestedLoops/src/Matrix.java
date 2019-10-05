import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for(int f11 = a; f11 <= b; f11++ ){
            for(int f12 = a; f12 <= b; f12++ ){
                for(int s21 = c; s21 <= d; s21++ ){
                    for(int s22 = c; s22 <= d; s22++ ){

                        if((f11 + s22) == (f12 + s21) && (f11 != f12) && (s21 != s22)){
                            System.out.printf("%d%d\n",f11,f12);
                            System.out.printf("%d%d\n",s21,s22);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
