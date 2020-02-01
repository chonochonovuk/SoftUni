package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int badge;
    private List<Pokemon> trainerPokemon = new ArrayList<>();

    public Trainer(String name, Pokemon add) {
        this.name = name;
        this.badge = 0;
        this.trainerPokemon.add(add);
    }

    public String getName() {
        return name;
    }

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    public List<Pokemon> getTrainerPokemon() {
        return trainerPokemon;
    }

    public void addTrainerPokemon(Pokemon addOrSet) {

        this.trainerPokemon.add(addOrSet);
    }
    public void removeOrBadge(String type,List<Pokemon> badgePokemon){

        for (Pokemon pokemon : badgePokemon) {
            if (pokemon.getType().equals(type)){
                this.badge++;
                return;
            }
        }


            List<Pokemon> removed = new ArrayList<>(badgePokemon);
            for (Pokemon pokemon : badgePokemon) {
               pokemon.setPower(pokemon.getPower() - 10);
            }

                this.trainerPokemon = badgePokemon.stream().filter(a -> a.getPower() > 0).collect(Collectors.toList());


    }

    @Override
    public String toString() {
        return "" + this.name + " " + this.badge + " " + this.trainerPokemon.size();
    }
}
