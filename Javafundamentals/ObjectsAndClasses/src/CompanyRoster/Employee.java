package CompanyRoster;

public class Employee {

        private String name;
        private double salary;
        private String position;
        private String department;
        private String email;
        private int age;



    public Employee(String name,double salary,String position,String department){

            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;

        }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }



    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

            return String.format("%s %.2f %s %d",getName(),getSalary(),getEmail(),getAge());

    }
}
