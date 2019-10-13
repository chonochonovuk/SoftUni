import java.util.Scanner;

public class PalidromeIntiger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tillEnd = scanner.nextLine();

        while (!tillEnd.equals("END")){
            String check = PN(tillEnd);
            if (tillEnd.equals(check)){
                System.out.printf("%s%n",true);
            }else{
                System.out.printf("%s%n",false);
            }

            tillEnd = scanner.nextLine();
        }
    }

    static String PN(String match){
        String Result1 = "";

        for (int a = match.length() - 1; a >= 0; a-- ){
            Result1 += match.charAt(a);
        }

        return Result1;
    }
}
