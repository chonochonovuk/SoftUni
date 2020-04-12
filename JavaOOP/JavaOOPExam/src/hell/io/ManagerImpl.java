package hell.io;

import hell.entities.heroes.Assassin;
import hell.entities.heroes.Barbarian;
import hell.entities.heroes.HeroComparator;
import hell.entities.heroes.Wizard;
import hell.entities.items.CommonItem;
import hell.entities.items.RecipeItem;
import hell.interfaces.Hero;
import hell.interfaces.Item;
import hell.interfaces.Manager;
import hell.interfaces.Recipe;

import java.util.*;
import java.util.stream.Collectors;


public class ManagerImpl implements Manager {

    private Map<String,Hero> heroRepository;

    public ManagerImpl(){
        this.heroRepository = new HashMap<>();
    }
    @Override
    public String addHero(List<String> arguments) {
        String name = arguments.get(0);
        String type = arguments.get(1);
        Hero hero = null;

        switch (type){
            case "Assassin":
                hero = new Assassin(name);
                break;
            case "Barbarian":
                hero = new Barbarian(name);
                break;
            case "Wizard":
                hero = new Wizard(name);
                break;
        }

        this.heroRepository.put(name,hero);
        return String.format("Created %s - %s",hero.getClass().getSimpleName(),name);
    }

    @Override
    public String addItem(List<String> arguments) {
        String name = arguments.get(1);
        Item item = new CommonItem(arguments.get(0),
                Integer.parseInt(arguments.get(2)),
                Integer.parseInt(arguments.get(3)),
                Integer.parseInt(arguments.get(4)),
                Integer.parseInt(arguments.get(5)),
                Integer.parseInt(arguments.get(6)));
        this.heroRepository.get(name).addItem(item);

        return String.format("Added item - %s to Hero - %s",item.getName(),name);
    }

    @Override
    public String addRecipe(List<String> arguments) {
        String name = arguments.get(2);
        String[] args = arguments.stream()
                .skip(8)
                .toArray(String[]::new);
        Recipe recipe = new RecipeItem(arguments.get(1),
                Integer.parseInt(arguments.get(3)),
                Integer.parseInt(arguments.get(4)),
                Integer.parseInt(arguments.get(5)),
                Integer.parseInt(arguments.get(6)),
                Integer.parseInt(arguments.get(7)),
                args);
        this.heroRepository.get(name).addRecipe(recipe);

        return String.format("Added recipe - %s to Hero - %s",recipe.getName(),name);
    }

    @Override
    public String inspect(List<String> arguments) {

        String name = arguments.get(1);
        Hero hero = this.heroRepository.get(name);

        StringBuilder sb = new StringBuilder(hero.toString());

        if (hero.getItems().isEmpty()){
            sb.append("Items: None");
        }else {
            sb.append("Items:");
            for (Item item : hero.getItems()) {
                sb.append(System.lineSeparator());
                sb.append(item.toString());
            }
        }

        return sb.toString();
    }

    @Override
    public String quit() {
        HeroComparator heroComparator = new HeroComparator();
        List<Hero> collect = this.heroRepository.values().stream()
                .sorted(heroComparator)
                .collect(Collectors.toList());
        int i = 1;
        StringBuilder sb = new StringBuilder();
        for (Hero hero : collect) {
            sb.append(i).append(". ").append(hero.toString());
            i++;
        }

        return sb.toString();
    }
}
