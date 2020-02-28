package CardSuitEnum;

public class Main {
    public static void main(String[] args) {

            System.out.println("Card Suits:");
            int val = 0;
            for (CardSuit value : CardSuit.values()) {
                System.out.printf("Ordinal value: %d; Name value: %s%n",val++,value);
            }

    }
}
