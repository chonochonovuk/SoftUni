package hell.entities.heroes;

import hell.entities.miscellaneous.HeroInventory;
import hell.interfaces.Hero;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class Heroes implements Hero {
    private String name;
    private int strength;
    private int agility;
    private int intelligence;
    private int hitPoints;
    private int damage;
    private HeroInventory heroInventory;


    Heroes(String name, int strength, int agility, int intelligence, int hitPoints, int damage) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.heroInventory = new HeroInventory();
    }



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getStrength() {
        return this.strength + this.heroInventory.getTotalStrengthBonus();
    }

    @Override
    public long getAgility() {
        return this.agility + this.heroInventory.getTotalAgilityBonus();
    }

    @Override
    public long getIntelligence() {
        return this.intelligence + this.heroInventory.getTotalIntelligenceBonus();
    }

    @Override
    public long getHitPoints() {
        return this.hitPoints + this.heroInventory.getTotalHitPointsBonus();
    }

    @Override
    public long getDamage() {
        return this.damage + this.heroInventory.getTotalDamageBonus();
    }

    @Override
    public Collection<Item> getItems() {
         try{
            Field field = this.heroInventory.getClass()
                    .getDeclaredField("commonItems");
            field.setAccessible(true);
            return ((Map<String,Item>)field.get(this.heroInventory)).values();
         } catch (NoSuchFieldException | IllegalAccessException e) {
             e.printStackTrace();
         }

        return null;
    }

    @Override
    public void addItem(Item item) {
        this.heroInventory.addCommonItem(item);
    }

    @Override
    public void addRecipe(Recipe recipe) {
      this.heroInventory.addRecipeItem(recipe);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Hero: %s, Class: %s",this.getName(),this.getClass().getSimpleName())).append(System.lineSeparator());
        sb.append(String.format("HitPoints: %s, Damage: %s",this.getHitPoints(),this.getDamage())).append(System.lineSeparator());
        sb.append(String.format("Strength: %s",this.getStrength())).append(System.lineSeparator());
        sb.append(String.format("Agility: %s",this.getAgility())).append(System.lineSeparator());
        sb.append(String.format("Intelligence: %s",this.getIntelligence())).append(System.lineSeparator());
        return sb.toString();
    }


}




