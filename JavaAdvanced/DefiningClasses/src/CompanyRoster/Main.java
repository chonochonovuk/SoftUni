package CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Employee employee = new Employee();
            employee.setName(data[0]);
            employee.setSalary(Double.parseDouble(data[1]));
            employee.setPosition(data[2]);
            employee.setDepartment(data[3]);
            switch (data.length){
                case 5:
                    if (data[4].contains("@")) {
                        employee.setEmail(data[4]);
                    } else {
                        employee.setAge(Integer.parseInt(data[4]));
                    }
                    break;
                case 6:
                    if (data[4].contains("@")) {
                        employee.setEmail(data[4]);
                        employee.setAge(Integer.parseInt(data[5]));
                    } else {
                        employee.setAge(Integer.parseInt(data[4]));
                        employee.setEmail(data[5]);
                    }
                    break;
            }
            employees.add(employee);
        }
        List<String> departmentList = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());
        List<Department> departments = new ArrayList<>();
        for (String department: departmentList) {
          departments.add(new Department(department,employees.stream()
          .filter(employee -> employee.getDepartment().equals(department))
                 .collect(Collectors.toList())));
        }
        departments.sort(Comparator.comparingDouble(Department::getAvgSalary).reversed());
        Department department = departments.get(0);
        department.getEmployees().sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.printf("Highest Average Salary: %s%n", department.getName());
        for (Employee employee : department.getEmployees()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }
    }
}
