package football;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public double getRating(){
        if (this.players.isEmpty()){
            return 0.0;
        }
        return this.players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average().getAsDouble();
    }
    public void removePlayer(String name){
        Player found = findExistingPlayer(name);
        if (found == null){
            throw new IllegalArgumentException("Player "+ name +" is not in " + this.getName() + " team.");
        }
        this.players.remove(found);
    }

    private Player findExistingPlayer(String name) {
        for (Player player : this.players) {
            if (player.getName().equals(name)){
               return player;
            }
        }
        return null;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public String getName() {
        return name;
    }

    private void setName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }
}
