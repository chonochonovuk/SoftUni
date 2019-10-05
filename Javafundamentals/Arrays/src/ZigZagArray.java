import java.util.Scanner;

public class ZigZagArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];

        for (int i = 0; i < n ; i++){
            String type = scanner.nextLine();

            String[] alnew = type.split(" ");


            if (i == 0 || i % 2 == 0){
                arr1[i] = alnew[0];
                arr2[i] = alnew[1];
            }else {
                arr1[i] = alnew[1];
                arr2[i] = alnew[0];
            }

        }

        String first = String.join(" ",arr1);
        String second = String.join(" ", arr2);

        System.out.println(first);
        System.out.println(second);
    }
}
