package guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    private List<Player> roster;
    private String name;
    private int capacity;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addPlayer(Player player) {
        if (this.roster.size() < this.getCapacity()){
            this.roster.add(player);
        }
    }

    public boolean removePlayer(String name) {
        Player existing = findPlayer(name);
        if (existing != null){
            this.roster.remove(existing);
            return true;
        }
        return false;
    }
    public Player findPlayer(String name) {
        for (Player player:this.roster) {
            if (player.getName().equals(name)){
                return player;
            }
        }
        return null;
    }

    public void promotePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)){
                if (!player.getRank().equals("Member")){
                    player.setRank("Member");
                }
                return;
            }
        }
    }
    public void demotePlayer(String name){
        for (Player player : this.roster) {
            if (player.getName().equals(name)){
                if (!player.getRank().equals("Trial")){
                    player.setRank("Trial");
                }
                return;
            }
        }
    }

    public Player[] kickPlayersByClass(String rogue) {
        List<Player> temp = new ArrayList<>();
        for (Player player : this.roster) {
            if (player.getClazz().equals(rogue)){
                temp.add(player);
            }
        }

        this.roster.removeAll(temp);
        Player[] left = new Player[this.roster.size()];
        for (int i = 0; i < left.length; i++) {
            left[i] = this.roster.get(i);
        }


        return left;
    }

    public int count() {
        return this.roster.size();
    }


    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Players in the guild: %s", this.getName()));
        sb.append(System.lineSeparator());
        for (Player player : this.roster) {
            sb.append(player.toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

}
