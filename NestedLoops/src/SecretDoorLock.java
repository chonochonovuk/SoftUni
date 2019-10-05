import java.util.Scanner;

public class SecretDoorLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sto = Integer.parseInt(scanner.nextLine());
        int ten = Integer.parseInt(scanner.nextLine());
        int one = Integer.parseInt(scanner.nextLine());

        for(int a = 1; a <= sto; a++){
            if(a%2 != 0){
                continue;
            }
            for (int b = 2 ;b <= ten;b++){
                if(b == 4 || b == 6 || b > 7){
                    continue;
                }
                for (int c = 1; c <= one;c ++){
                    if(c%2 != 0){
                        continue;
                    }

                    System.out.printf("%d %d %d\n",a,b,c);

                }
            }
        }
    }
}
