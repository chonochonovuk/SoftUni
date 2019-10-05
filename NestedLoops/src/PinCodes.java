import java.util.Scanner;

public class PinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = Integer.parseInt(scanner.nextLine());
        int d2 = Integer.parseInt(scanner.nextLine());
        int d3 = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= d1;i++){
            if(i%2 != 0){
                continue;
            }
            for(int o = 2; o <= d2;o++){

                if(o == 4 || o == 6 || o > 7){
                    continue;
                }
                for (int p = 1;p <= d3;p++){
                    if(p%2 != 0){
                        continue;
                    }

                    System.out.printf("%d %d %d\n",i,o,p);

                }
            }
        }
    }
}
