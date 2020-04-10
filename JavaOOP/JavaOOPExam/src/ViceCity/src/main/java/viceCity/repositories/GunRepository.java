package viceCity.repositories;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.Repository;

import java.util.*;

public class GunRepository implements Repository<Gun> {
    private Deque<Gun> guns;

    public GunRepository(){
        this.guns = new ArrayDeque<>();
    }
    @Override
    public Collection<Gun> getModels() {
        return Collections.unmodifiableCollection(this.guns);
    }

    @Override
    public void add(Gun model) {
        if (!this.guns.contains(model)){
            this.guns.offer(model);
        }
    }

    @Override
    public boolean remove(Gun model) {
        if (this.guns.contains(model)){
            this.guns.remove(model);
            return true;
        }
        return false;
    }

    @Override
    public Gun find(String name) {
        for (Gun gun : guns) {
            if (gun.getName().equals(name)){
                return gun;
            }
        }

        return null;
    }
}
