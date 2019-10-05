import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());

        if(i >= 0 && i <= 2){
            System.out.println("baby");
        }else if (i >= 3 && i <= 13){
            System.out.println("child");
        }else if (i >= 14 && i <= 19){
            System.out.println("teenager");
        }else if (i >= 20 && i <= 65){
            System.out.println("adult");
        }else if (i >= 66){
            System.out.println("elder");
        }
    }
}
