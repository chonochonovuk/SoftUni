package OrderByAgeNew;

public class Persons implements Comparable<Persons> {
    private String name;
    private int ids;
    private int age;

    public Persons(String name,int ids,int age){

        this.name = name;
        this.ids = ids;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getIds() {
        return ids;
    }

    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return String.format("%s with ID: %d is %d years old.",getName(),getIds(),getAge());
    }

    @Override
    public int compareTo(Persons persons) {
        return (this.age - persons.getAge());
    }


}


