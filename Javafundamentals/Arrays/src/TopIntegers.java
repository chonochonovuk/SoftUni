import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arrL = line.split(" ");
        int[] arrN = new int[arrL.length];
        StringBuilder top = new StringBuilder();

        for (int l = 0 ; l < arrN.length ; l++){
            arrN[l] = Integer.parseInt(arrL[l]);
        }

        for (int y = 0 ; y < arrN.length ;y++){
            int numb = arrN[y];
            if (y == (arrN.length - 1)){
                top.append(numb);
                break;
            }
            for (int f = 1 + y; f < arrN.length ; f++){
                int check = arrN[f];

                if (numb > check){
                    if (f == (arrN.length - 1)){
                        top.append(numb).append(" ");
                        break;
                    }
                }else {
                    break;
                }

            }
        }

        System.out.println(top);

    }
}
