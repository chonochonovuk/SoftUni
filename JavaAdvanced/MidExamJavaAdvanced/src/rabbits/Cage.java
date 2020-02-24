package rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {

    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
    

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(Rabbit rabbit){
        if (this.data.size() < this.getCapacity()){
            this.data.add(rabbit);
        }
    }

    public boolean removeRabbit(String name){
        for (Rabbit rabbit:this.data) {
            if (rabbit.getName().equals(name)){
                return this.data.remove(rabbit);
            }
        }
        return false;
    }
    public void removeSpecies(String species){
      List<Rabbit> temp = new ArrayList<>();
        for (Rabbit rabbit:this.data) {
            if (rabbit.getSpecies().equals(species)){
                temp.add(rabbit);
            }
        }
        this.data.removeAll(temp);
    }

    public Rabbit sellRabbit(String name){
        for (Rabbit rabbit:this.data) {
            if (rabbit.getName().equals(name)){
                rabbit.setAvailable(false);
                return rabbit;
            }
        }
        return null;
    }
    public List<Rabbit> sellRabbitBySpecies(String species){
        List<Rabbit> temp = new ArrayList<>();
        for (Rabbit rabbit : this.data) {
            if (rabbit.getSpecies().equals(species)){
                rabbit.setAvailable(false);
                temp.add(rabbit);
            }
        }
          return temp;
    }
    public int count(){
        return this.data.size();
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Rabbits available at %s:",this.getName()));
        sb.append(System.lineSeparator());
        for (Rabbit rabbit : this.data) {
            if (rabbit.isAvailable()){
                sb.append(rabbit.toString());
                sb.append(System.lineSeparator());
            }
        }

        return sb.toString();

    }

}
