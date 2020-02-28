package EnumCardRanks;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (CardRank val : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",val.ordinal(),val.name());
        }

    }
}
