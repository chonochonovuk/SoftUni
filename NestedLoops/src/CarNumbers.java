import java.util.Scanner;

public class CarNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for(int a = start; a <= end ;a++){
            for (int b = start; b <= end;b++){
                for (int c = start; c <= end;c++){
                    if((b+c)%2 != 0){
                        continue;
                    }
                    for (int d = start; d <= end ; d++){
                        if(a < d){
                            continue;
                        }
                        if(a%2 != 0 && d%2 == 0){

                            System.out.printf("%d%d%d%d ",a,b,c,d);

                        }else if(a%2 == 0 && d%2 != 0){
                            System.out.printf("%d%d%d%d ",a,b,c,d);
                        }
                    }
                }
            }
        }
    }
}
