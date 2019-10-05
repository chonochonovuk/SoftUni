import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine().toLowerCase();
        boolean cold = (degrees >= 10 && degrees <= 18);
        boolean cool = (degrees > 18 && degrees <= 24);
        boolean hot = (degrees >= 25);
        switch (time){
            case "morning":
                if(cold){
                    System.out.println("It's "+degrees+" degrees, get your Sweatshirt and Sneakers.");
                }else if(cool){
                    System.out.println("It's "+degrees+" degrees, get your Shirt and Moccasins.");
                }else if(hot) {
                    System.out.println("It's "+degrees+" degrees, get your T-Shirt and Sandals.");
                }
                break;
            case "afternoon":
                if(cold){
                    System.out.println("It's "+degrees+" degrees, get your Shirt and Moccasins.");
                }else if(cool){
                    System.out.println("It's "+degrees+" degrees, get your T-Shirt and Sandals.");
                }else if(hot) {
                    System.out.println("It's "+degrees+" degrees, get your Swim Suit and Barefoot.");
                }
                break;
            case "evening":
                if(cold || cool || hot){
                System.out.println("It's "+degrees+" degrees, get your Shirt and Moccasins.");
            }
                break;

        }
    }
}
