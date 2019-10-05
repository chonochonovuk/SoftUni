import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secret = scanner.nextLine().replaceAll("[^a-zA-Z]", "");
        String result = "";
        String fin = "";
        int c = 0;
        int o = 0;
        int n = 0;

        while (!secret.equals("End")){
            if(secret.equals("c")){
                if(c == 1){
                    result += secret;
                }
                c = 1;
            }else if(secret.equals("o")){
                if(o == 1){
                    result += secret;
                }
                o = 1;
            }else if(secret.equals("n")){
                if(n == 1){
                    result += secret;
                }
                n = 1;
            }else{
                result += secret;
            }

            if(c == 1 && o == 1 && n == 1){
                result = result + " ";
                fin = result;
                c = 0;
                o = 0;
                n = 0;
            }
            secret = scanner.nextLine().replaceAll("[^a-zA-Z]", "");
        }

        if(secret.equals("End")){
            System.out.println(fin);
        }
    }
}
