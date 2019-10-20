import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();

        List<Integer> pokemons = Arrays.stream(sequence.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        while (!pokemons.isEmpty()){
            int index = Integer.parseInt(scanner.nextLine());
            int pokeInx = 0;

            if (index < 0){
                pokeInx = pokemons.get(0);
                pokemons.set(0,pokemons.get(pokemons.size() - 1));
                sum += pokeInx;
            }else if (index >= pokemons.size()){
                pokeInx = pokemons.get(pokemons.size() - 1);
                pokemons.set(pokemons.size() - 1,pokemons.get(0));
                sum += pokeInx;
            }else {
                pokeInx = pokemons.get(index);
                pokemons.remove(index);
                sum += pokeInx;
            }

            for (int i = 0; i < pokemons.size() ; i++) {
                 int increase = 0;
                 int decrease = 0;


                if (pokemons.get(i) <= pokeInx){
                    increase = pokemons.get(i) + pokeInx;
                    pokemons.set(i,increase);
                }else if (pokemons.get(i) > pokeInx){
                    decrease = pokemons.get(i) - pokeInx;
                    pokemons.set(i,decrease);
                }

            }


        }

        System.out.println(sum);
    }
}
