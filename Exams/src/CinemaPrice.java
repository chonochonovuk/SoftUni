import java.util.Scanner;

public class CinemaPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String row = scanner.nextLine();
        String column = scanner.nextLine();
        int ticketNumber = Integer.parseInt(scanner.nextLine());
        double[][] ticket = new double[4][3];
        ticket[0][0] = 7.50;
        ticket[0][1] = 10.50;
        ticket[0][2] = 13.50;
        ticket[1][0] = 7.35;
        ticket[1][1] = 9.45;
        ticket[1][2] = 12.75;
        ticket[2][0] = 8.15;
        ticket[2][1] = 10.25;
        ticket[2][2] = 13.25;
        ticket[3][0] = 8.75;
        ticket[3][1] = 11.55;
        ticket[3][2] = 13.95;
        if (row.equalsIgnoreCase("A Star Is Born")) {
            if (column.equalsIgnoreCase("normal")) {
                double alltickets = ticketNumber * ticket[0][0];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            } else if (column.equalsIgnoreCase("luxury")) {
                double alltickets = ticketNumber * ticket[0][1];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            } else if (column.equalsIgnoreCase("ultra luxury")) {
                double alltickets = ticketNumber * ticket[0][2];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            }
        } else if (row.equalsIgnoreCase("Bohemian Rhapsody")) {
            if (column.equalsIgnoreCase("normal")) {
                double alltickets = ticketNumber * ticket[1][0];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            } else if (column.equalsIgnoreCase("luxury")) {
                double alltickets = ticketNumber * ticket[1][1];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            } else if (column.equalsIgnoreCase("ultra luxury")) {
                double alltickets = ticketNumber * ticket[1][2];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            }
        } else if (row.equalsIgnoreCase("Green Book")) {
            if (column.equalsIgnoreCase("normal")) {
                double alltickets = ticketNumber * ticket[2][0];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            } else if (column.equalsIgnoreCase("luxury")) {
                double alltickets = ticketNumber * ticket[2][1];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            } else if (column.equalsIgnoreCase("ultra luxury")) {
                double alltickets = ticketNumber * ticket[2][2];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            }
        }else if (row.equalsIgnoreCase("The Favourite")) {
            if (column.equalsIgnoreCase("normal")) {
                double alltickets = ticketNumber * ticket[3][0];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            } else if (column.equalsIgnoreCase("luxury")) {
                double alltickets = ticketNumber * ticket[3][1];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            } else if (column.equalsIgnoreCase("ultra luxury")) {
                double alltickets = ticketNumber * ticket[3][2];
                System.out.printf("%s -> %.2f lv.", row,alltickets);
            }
        }
    }
}
