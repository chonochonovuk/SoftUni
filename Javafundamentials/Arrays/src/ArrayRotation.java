import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrays = scanner.nextLine();
        int rotate = Integer.parseInt(scanner.nextLine());
        String[] newarr = arrays.split(" ");
        for (int g = 0; g < rotate ; g++){
            String numFirst = newarr[0];
            for (int h = 0 ; h < newarr.length ; h++){
                if (h == (newarr.length - 1)){
                    newarr[h] = numFirst;
                }else{
                    newarr[h] = newarr[h + 1];
                }
            }

            newarr = newarr;
        }

        System.out.println(String.join(" ",newarr));
    }

}
