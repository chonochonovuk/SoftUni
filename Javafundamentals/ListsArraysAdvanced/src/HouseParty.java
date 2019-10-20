import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<String> house = new ArrayList<>();

        guestsInt(scanner,times,house);
    }

    private static void guestsInt(Scanner scanner,int times , List<String> house) {
        for (int i = 0; i < times  ; i++) {
            String guests = scanner.nextLine();
            if (guests.matches("(.*)is going!")){
                guests = guests.replace(" is going!","").trim();
                if (house.contains(guests)){
                    System.out.printf("%s is already in the list!%n",guests);
                }else{
                    house.add(guests);
                }
            }

            if (guests.matches("(.*)is not going!")){
                guests = guests.replace(" is not going!","").trim();
                if (!house.contains(guests)){
                    System.out.printf("%s is not in the list!%n",guests);
                }else {
                    house.remove(guests);
                }
            }

        }

        for (String guest : house
             ) {
            System.out.println(guest);
        }
    }
}
