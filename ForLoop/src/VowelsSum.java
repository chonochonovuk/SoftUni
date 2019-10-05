import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sum = 0;

        for(int pos = 0; pos < text.length(); pos++){
            char curr = text.charAt(pos);
            if(curr == 'a'){
                sum += 1;
            }else if(curr == 'e'){
                sum += 2;
            }else if(curr == 'i'){
                sum += 3;
            }else if(curr == 'o'){
                sum += 4;
            }else if(curr == 'u'){
                sum += 5;
            }
        }

        System.out.println(sum);
    }
}
