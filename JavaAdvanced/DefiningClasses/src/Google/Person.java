package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String personName;
    private Company personCompany;
    private Car personCar;
    private List<Pokemon> personPokemon = new ArrayList<>();
    private List<Parents> personParents = new ArrayList<>();
    private List<Children> personChildren = new ArrayList<>();

    public Person(String name,Company personCompany){
        this.personName = name;
        this.personCompany = personCompany;
    }
    public Person(String name,Car personCar){
        this.personName = name;
        this.personCar = personCar;
    }
    public Person(String name,Pokemon personPokemon){
        this.personName = name;
        this.personPokemon.add(personPokemon);
    }
    public Person(String name,Parents personParents){
        this.personName = name;
        this.personParents.add(personParents);
    }
    public Person(String name,Children personChildren){
        this.personName = name;
        this.personChildren.add(personChildren);
    }

    public String getPersonName(){
        return this.personName;
    }

    public Company getPersonCompany() {
        return personCompany;
    }

    public Car getPersonCar() {
        return personCar;
    }

    public List<Pokemon> getPersonPokemon() {
        return personPokemon;
    }

    public List<Parents> getPersonParents() {
        return personParents;
    }

    public List<Children> getPersonChildren() {
        return personChildren;
    }

    public void setPersonCompany(Company personCompany) {
        this.personCompany = personCompany;
    }

    public void setPersonCar(Car personCar) {
        this.personCar = personCar;
    }

    public void setPersonPokemon(List<Pokemon> personPokemon, Pokemon next) {
        this.personPokemon.add(next);
    }

    public void setPersonParents(List<Parents> personParents,Parents next) {
        this.personParents.add(next);
    }

    public void setPersonChildren(List<Children> personChildren, Children next) {
        this.personChildren.add(next);
    }


}
