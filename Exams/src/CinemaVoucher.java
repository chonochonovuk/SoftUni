import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucher = Integer.parseInt(scanner.nextLine());
        String pokupki = scanner.nextLine();
        int film = 0;
        int food = 0;
        while (!pokupki.equals("End")) {

            if (pokupki.length() > 8) {
                int symv1 = pokupki.charAt(0);
                int symv2 = pokupki.charAt(1);
                voucher = voucher - (symv1 + symv2);
                if (voucher >= 0) {
                    film++;

                }else
                    break;

            }else if (pokupki.length() <= 8) {
                int symv1 = pokupki.charAt(0);
                voucher = voucher - symv1;
                if (voucher >= 0) {
                    food++;

                }else
                    break;

            }
            pokupki = scanner.nextLine();
        }

        System.out.printf("%d%n%d%n",film,food);
    }

}