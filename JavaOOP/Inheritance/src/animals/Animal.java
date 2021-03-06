package animals;

public class Animal {
    private String name;
    private int age;
    protected String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.name = name;
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException();
        }

        this.age = age;
    }

    private void setGender(String gender) {
        if (gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.gender = gender;
    }

    public void produceSound() {
        System.out.println("Not implemented!");
    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName() +
                System.lineSeparator() +
                String.format("%s %d %s", this.name, this.age, this.gender);
    }
}
