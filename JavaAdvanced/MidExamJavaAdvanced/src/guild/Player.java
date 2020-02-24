package guild;

public class Player {

    private String name;
    private String clazz;
    private String rank = "Trial";
    private String description = "n/a";

    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public String getRank() {
        return rank;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("Player %s: %s%nRank: %s%nDescription: %s",this.getName(),this.getClazz(),this.getRank(),this.getDescription());
    }
}
