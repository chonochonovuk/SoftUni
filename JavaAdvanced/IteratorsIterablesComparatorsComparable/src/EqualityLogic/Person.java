package EqualityLogic;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Person o) {
       int result = this.name.compareTo(o.getName());
       if (result == 0){
           result = this.age - o.getAge();
       }
       return result;
    }
    @Override
    public boolean equals(Object d){
        if (!(d instanceof Person)) {
            return false;
        }
        Person person = (Person) d;
        return (this.name.equals(((Person) d).getName())) && (this.age == ((Person) d).getAge());
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
