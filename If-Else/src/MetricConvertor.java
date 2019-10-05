import java.util.Scanner;

public class MetricConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double convert = Double.parseDouble(scanner.nextLine());
        String in = scanner.nextLine();
        String out = scanner.nextLine();
        if(in.equals("m")) {
            if(out.equals("cm")) {
                convert *= 100;
            }if(out.equals("mm")) {
                convert *= 1000;
            }

        }else if (in.equals("cm")) {
            if(out.equals("m")) {
                convert /= 100;
            }if(out.equals("mm")) {
                convert *= 10;
            }

        }else if (in.equals("mm")) {
            if(out.equals("cm")) {
                convert /= 10;
            }if(out.equals("m")) {
                convert /= 1000;
            }

        }
        System.out.printf("%.3f", convert);
    }
}
