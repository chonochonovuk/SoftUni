package CardsWithPower;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private int cardPower;
    private CardSuit(int cardPower){
        this.cardPower = cardPower;
    }

    public int getCardPower() {
        return cardPower;
    }
}
