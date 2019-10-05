import java.util.Scanner;

public class NumEnd7 {
    public static void main(String[] args) {
        int x = 1000;

        for (int k = 0; k < x ; k++){
            if(k % 10 == 7){
                System.out.println(k);
            }
        }
    }
}
