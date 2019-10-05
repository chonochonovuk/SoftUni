import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wide = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double hight = Double.parseDouble(scanner.nextLine());
        double astrHight = Double.parseDouble(scanner.nextLine());
        double ship = 0;
        ship += (wide*length*hight)*1.00/((astrHight + 0.4)*2*2);
        ship = Math.floor(ship);

        if(ship < 3){
            System.out.println("The spacecraft is too small.");
        }else if(ship > 10){
            System.out.println("The spacecraft is too big.");
        }else{
            System.out.printf("The spacecraft holds %.0f astronauts.",ship);
        }
    }
}
