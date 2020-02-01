package PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Trainer> trainers = new LinkedList<>();
        String tournament;
        while (!"Tournament".equals(tournament = scanner.nextLine())){
            String[] toArr = tournament.split("\\s+");
            String trainer = toArr[0];
            String pokemon = toArr[1];
            String type = toArr[2];
            int power = Integer.parseInt(toArr[3]);
            Pokemon toAdd = new Pokemon(pokemon,type,power);
            Trainer existingTrainer = findTrainer(trainer,trainers);
            if (existingTrainer != null){
                existingTrainer.addTrainerPokemon(toAdd);
            }else {
                trainers.add(new Trainer(trainer,toAdd));
            }
        }

        String fight;
        while (!"End".equals(fight = scanner.nextLine())){
            for (Trainer tr : trainers) {
                tr.removeOrBadge(fight,tr.getTrainerPokemon());
            }
        }
        trainers.sort(Comparator.comparingInt(Trainer::getBadge).reversed());
        for (Trainer printTr : trainers) {
            System.out.println(printTr);
        }

    }

    private static Trainer findTrainer(String trainer, List<Trainer> trainers) {
        for (Trainer trainer1 : trainers) {
            if (trainer1.getName().equals(trainer)){
                return trainer1;
            }
        }

        return null;
    }
}
