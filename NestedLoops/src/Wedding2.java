import java.util.Scanner;

public class Wedding2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String last = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int oddSeats = Integer.parseInt(scanner.nextLine());
        int evenSeats = oddSeats + 2;
        char l = last.charAt(0);
        int tot = 0;

        for(char a = 'A'; a <= l ;a++){
            for(int b = 1; b <= rows;b++){
                if(b%2 == 0){
                    for(char c = 97; c < (evenSeats + 97); c++){
                        System.out.printf("%c%d%c\n",a,b,c);
                        tot++;
                    }
                }else{
                    for(char d = 97; d < (oddSeats + 97); d++){
                        System.out.printf("%c%d%c\n",a,b,d);
                        tot++;
                    }
                }
            }
            rows++;
        }
        System.out.println(tot);
    }
}
