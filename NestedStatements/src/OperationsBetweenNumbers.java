import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String op = scanner.nextLine();
        double n1 = 0;
        double n2 = 0;
        int result = 0;
        double res = 0;
        char ch = '%';
        switch (op){
            case "+":
                result = N1 + N2;
                if(result%2 == 0){
                    System.out.printf("%d + %d = %d - even",N1,N2,result);
                }else{
                    System.out.printf("%d + %d = %d - odd",N1,N2,result);
                }
                break;
            case "-":
                result = N1 - N2;
                if(result%2 == 0){
                    System.out.printf("%d - %d = %d - even",N1,N2,result);
                }else{
                    System.out.printf("%d - %d = %d - odd",N1,N2,result);
                }
                break;
            case "*":
                result = N1 * N2;
                if(result%2 == 0){
                    System.out.printf("%d * %d = %d - even",N1,N2,result);
                }else{
                    System.out.printf("%d * %d = %d - odd",N1,N2,result);
                }
                break;
            case "/":

                if(N2 == 0){
                    System.out.printf("Cannot divide %d by zero",N1);
                }else{
                    n1 = N1;
                    n2 = N2;
                    res = n1 / n2;
                    System.out.printf("%d / %d = %.2f",N1,N2,res);
                }
                break;
            case "%":

                if(N2 == 0){
                    System.out.printf("Cannot divide %d by zero",N1);
                }else{
                    result = N1 % N2;
                    System.out.printf("%d %c %d = %d",N1,ch,N2,result);
                }
                break;

        }
    }
}
