import java.util.Scanner;

public class FruitOrVeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fOv = scanner.nextLine().toLowerCase();

        if(fOv.equals("tomato") || fOv.equals("cucumber") || fOv.equals("pepper") || fOv.equals("carrot")){
            System.out.println("vegetable");
        }else if(fOv.equals("banana")||fOv.equals("apple") || fOv.equals("kiwi") || fOv.equals("cherry")|| fOv.equals("lemon") || fOv.equals("grapes")){
            System.out.println("fruit");
        }else{
            System.out.println("unknown");
        }
    }
}
