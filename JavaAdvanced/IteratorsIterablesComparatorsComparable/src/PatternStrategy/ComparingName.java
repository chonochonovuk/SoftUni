package PatternStrategy;

import java.util.Comparator;

public class ComparingName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().length() == o2.getName().length()){
            return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
        }
        return Integer.compare(o1.getName().length(),o2.getName().length());
    }
}
