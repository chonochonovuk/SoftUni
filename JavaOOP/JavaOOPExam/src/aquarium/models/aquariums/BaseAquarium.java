package aquarium.models.aquariums;

import aquarium.common.ConstantMessages;
import aquarium.common.ExceptionMessages;
import aquarium.models.decorations.Decoration;
import aquarium.models.fish.Fish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public abstract class BaseAquarium implements Aquarium {

    private String name;
    private int capacity;
    private Collection<Decoration> decorations;
    private Collection<Fish> fish;

    protected BaseAquarium(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.decorations = new ArrayList<>();
        this.fish = new ArrayList<>();
    }


    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.AQUARIUM_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int calculateComfort() {
        return this.decorations.stream().mapToInt(Decoration::getComfort).sum();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addFish(Fish fish) {
       if (this.fish.size() == capacity){
          throw new IllegalStateException(ConstantMessages.NOT_ENOUGH_CAPACITY);
       }
       this.fish.add(fish);
    }

    @Override
    public void removeFish(Fish fish) {
        this.fish.remove(fish);
    }

    @Override
    public void addDecoration(Decoration decoration) {
      this.decorations.add(decoration);
    }

    @Override
    public void feed() {
      this.fish.forEach(Fish::eat);
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s (%s):",this.getName(),this.getClass().getSimpleName()));
        sb.append(System.lineSeparator());
        sb.append("Fish: ");
        if (this.fish.isEmpty()){
            sb.append("none");
        }else {
            String fishes = this.fish.toString().replaceAll("[\\[\\],]","");
            sb.append(fishes);
        }
        sb.append(System.lineSeparator());
        sb.append(String.format("Decorations: %d",this.decorations.size()));
        sb.append(System.lineSeparator());
        sb.append(String.format("Comfort: %d",this.calculateComfort()));
        return sb.toString();
    }

    @Override
    public Collection<Fish> getFish() {
        return Collections.unmodifiableCollection(this.fish);
    }

    @Override
    public Collection<Decoration> getDecorations() {
        return Collections.unmodifiableCollection(this.decorations);
    }
}
