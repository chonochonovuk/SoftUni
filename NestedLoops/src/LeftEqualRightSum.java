import java.util.Scanner;

public class LeftEqualRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        int middle = 0;

        for(int k = n1; k <= n2;k++){
            for (int l = 0; l < 5; l++){
                String m = "" + k;
                int z = Integer.parseInt("" + m.charAt(l));
                if(l == 0 || l == 1 ){
                    left += z;
                }else if(l == 3 || l == 4){
                    right += z;
                }else {
                    middle += z;
                }

                if(l == 4){


                    if(left < right){
                        left += middle;
                    }else if(left > right){
                        right += middle;
                    }

                    if(left == right){

                        System.out.print(k + " ");

                    }

                    left = 0;
                    right = 0;
                    middle = 0;
                }
            }
        }
    }
}
