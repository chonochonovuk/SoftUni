import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = VowelFound(scanner);

        System.out.println(i);

    }

    static int VowelFound(Scanner scanner){

        String toFind = scanner.nextLine();
        int count = 0;

        for (char c: toFind.toCharArray()
             ) {
            if ("aeiouAEIOU".indexOf(c) >= 0){
                count++;
            }
        }
        return count;

    }
}
