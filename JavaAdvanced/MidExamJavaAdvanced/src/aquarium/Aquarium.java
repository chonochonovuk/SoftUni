package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishInPool;
    private String name;
    private int capacity;
    private int size;


    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public void add(Fish fish) {
        if (!this.fishInPool.contains(fish) && this.fishInPool.size() < this.getCapacity()){
            this.fishInPool.add(fish);
        }
    }

    public boolean remove(String name) {
        Fish existing = findFish(name);
        if (existing != null){
            this.fishInPool.remove(existing);
            return true;
        }

        return false;
    }

    public Fish findFish(String name) {
        for (Fish fish:fishInPool) {
            if (fish.getName().equals(name)){
                return fish;
            }
        }
        return null;
    }


    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Aquarium: %s ^ Size: %d", this.getName(), this.getSize()));
        sb.append(System.lineSeparator());
        for (Fish fish : this.fishInPool) {
            sb.append(fish.toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }


}
