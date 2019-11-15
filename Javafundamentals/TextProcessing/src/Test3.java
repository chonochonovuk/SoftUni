import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String that = scanner.nextLine();
        String digit = that.replaceAll("\\D","");
        System.out.println(digit);
        System.out.println(that.lastIndexOf(digit));
        int inx = that.lastIndexOf(digit);
        System.out.println(that.charAt(inx + 2));
        System.out.println(digit.length());
        Character z = that.charAt(0);
        int pos = z - 96;
        System.out.println(pos);
    }
}
