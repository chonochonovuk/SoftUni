import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        int num1 = Integer.parseInt("" + num.charAt(2));
        int num2 = Integer.parseInt("" + num.charAt(1));
        int num3 = Integer.parseInt("" + num.charAt(0));


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
