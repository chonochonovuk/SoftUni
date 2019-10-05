import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrStr = input.split(" ");
        int[] arrNum = new int[arrStr.length];

        for (int a = 0; a < arrNum.length ;a++){
            arrNum[a] = Integer.parseInt(arrStr[a]);
        }
        for (int r = 0 ; r < arrNum.length ; r++){

            int suml = 0;
            int sumr = 0;

               for (int y = r + 1; y < arrNum.length; y++ ){
                    if (r + 1 == arrNum.length){
                        break;
                    }else {
                        int s = arrNum[y];
                        sumr += s;
                    }
                }

                for (int x = 0 ; x < r ; x++) {

                        int z = arrNum[x];
                        suml += z;
                }

                if (suml == sumr){
                     System.out.println(r);
                     break;
                 }else if (r + 1 == arrNum.length){
                     System.out.println("no");
                     break;
                 }else {
                     continue;
                 }
            }

    }
}
