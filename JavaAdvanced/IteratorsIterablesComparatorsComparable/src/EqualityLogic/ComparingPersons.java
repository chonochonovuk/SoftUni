package EqualityLogic;

import java.util.Comparator;

public class ComparingPersons implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        if (a.getName().equals(b.getName()) && a.getAge() == b.getAge()){
            return 0;
        }
        return a.getName().compareTo(b.getName());
    }
}
