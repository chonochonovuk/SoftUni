package hell.entities.heroes;

import hell.interfaces.Hero;

import java.util.Comparator;

public class HeroComparator implements Comparator<Hero> {
    @Override
    public int compare(Hero o1, Hero o2) {
        long sum = o1.getStrength() + o1.getAgility() + o1.getIntelligence();
        long otherSum = o2.getStrength() + o2.getAgility() + o2.getIntelligence();
        if (sum == otherSum){
            sum = o1.getDamage() + o1.getHitPoints();
            otherSum = o2.getDamage() + o2.getHitPoints();
            return Long.compare(otherSum,sum);
        }
        return Long.compare(otherSum,sum);
    }
}
