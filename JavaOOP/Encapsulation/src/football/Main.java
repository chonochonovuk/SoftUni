package football;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            List<Team> teams = new ArrayList<>();
            String command;
            while (!"END".equals(command = scanner.nextLine())){
                try {
                    String[] array = command.split(";");
                    switch (array[0]){
                        case "Team":
                            teams.add(new Team(array[1]));
                            break;
                        case "Add":
                            Team found = findTeam(array[1],teams);
                            if (found == null){
                                throw new IllegalArgumentException("Team "+ array[1] +" does not exist.");
                            }
                            found.addPlayer(new Player(array[2],Integer.parseInt(array[3]),Integer.parseInt(array[4]),Integer.parseInt(array[5]),
                                    Integer.parseInt(array[6]),Integer.parseInt(array[7])));
                            break;
                        case "Remove":
                            Team remove = findTeam(array[1],teams);
                            if (remove == null){
                                throw new IllegalArgumentException("Team "+ array[1] +" does not exist.");
                            }
                            remove.removePlayer(array[2]);
                            break;
                        case "Rating":
                            Team stats = findTeam(array[1],teams);
                            if (stats == null){
                                throw new IllegalArgumentException("Team "+ array[1] +" does not exist.");
                            }
                            int stat = (int) Math.round(stats.getRating());
                            System.out.println(stats.getName() + " - " + stat);
                            break;
                    }
                }catch (IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                }

            }

    }

    private static Team findTeam(String name, List<Team> teams) {
        for (Team team : teams) {
            if (team.getName().equals(name)){
                return team;
            }
        }

        return null;
    }
}
