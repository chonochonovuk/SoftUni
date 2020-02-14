package Google;

public class Company {
    private String companyName;
    private String departmentName;
    private double salary;

    public Company(String companyName, String departmentName, double salary) {
        this.companyName = companyName;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Company:" +
                String.format("%n%s %s %.2f",this.companyName,this.departmentName,this.salary);
    }
}
