import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        String[] arr1 = input.split(" ");
        String[] arr2 = input2.split(" ");
        String match = "";

        for (int i = 0; i < arr2.length ; i++){
            for (int b = 0; b < arr1.length; b++){
                if (arr2[i].equals(arr1[b])){
                    match += arr2[i] + " ";
                }
            }
        }

        System.out.println(match);

    }
}
