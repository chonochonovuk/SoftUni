import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        l += 97;

        for(int q = 1;q <= n; q++){
            for (int w = 1; w <= n;w++){
                for(int e = 97; e < l;e++){
                    for(int r = 97;r < l;r++){
                        for (int t = 1;t <=n;t++){
                            char one = (char)e;
                            char two = (char)r;

                            if(t > q && t > w){
                                System.out.printf("%d%d%c%c%d ",q,w,one,two,t);
                            }
                        }
                    }
                }
            }
        }
    }
}
