import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int t = w*l*h;
        int k = 0;

        String f = scanner.nextLine();
        while (!f.equals("Done")){
            int c = Integer.parseInt(f);
            k += c;
            if(k > t){
                int n = k - t;
                System.out.printf("No more free space! You need %d Cubic meters more.",n);
                break;
            }

            f = scanner.nextLine();
        }

        if(f.equals("Done")){
            int b = t - k;
            System.out.printf("%d Cubic meters left.",b);
        }
    }
}
