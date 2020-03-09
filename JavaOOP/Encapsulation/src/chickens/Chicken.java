package chickens;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public double productPerDay (){
       return this.calculateProductPerDay();
    }

    private double calculateProductPerDay(){
        if (this.age >= 0 && this.age <= 5){
            return 2.0;
        }
        if (this.age >= 6 && this.age <= 11){
            return 1.0;
        }

        return 0.75;
    }

    public void setName(String name) {
        if (name.length() < 1){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",this.name,this.age,this.productPerDay());
    }
}
