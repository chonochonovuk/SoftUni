import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = Integer.parseInt(scanner.nextLine());

        for (int z = 0; z < c ; z++){
            InTheMatrix(c);
            System.out.println();
        }

    }
    static void InTheMatrix(int d){
        for (int m = 0 ; m < d ; m++){
            System.out.print(d + " ");
        }
    }


}
