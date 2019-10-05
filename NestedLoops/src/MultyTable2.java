import java.util.Scanner;

public class MultyTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int num1 = num%10;
        int num2 = (num/10)%10;
        int num3 = num/100;


        for(int i = 1;i <= num1;i++){
            for(int o = 1;o <= num2;o++ ){
                for(int p = 1;p <= num3;p++){
                    int multi = i*o*p;
                    System.out.printf("%d * %d * %d = %d;\n",i,o,p,multi);
                }
            }
        }

    }
}
