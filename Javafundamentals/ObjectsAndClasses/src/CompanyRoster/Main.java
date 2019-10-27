package CompanyRoster;

import java.util.*;

public class Main {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        List<String> departmentsEm = new ArrayList<>();
        List<Double> salariesEm = new ArrayList<>();
        List<Integer> staffInDep = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        int dep = 1;
        int Index = 0;
        for (int i = 0; i < times; i++) {
            String email = "";
            int age = 0;

            String[] input = scanner.nextLine().split(" ");
            String nameEm = input[0];
            double salaries = Double.parseDouble(input[1]);
            String positions = input[2];
            String departments = input[3];
            Employee employee = new Employee(nameEm,salaries,positions,departments);
            if (departmentsEm.contains(departments)){

                Index = departmentsEm.indexOf(departments);
                salariesEm.set(Index,(salariesEm.get(Index) + salaries));
                staffInDep.set(Index,staffInDep.get(Index) + dep);

            }else {
                departmentsEm.add(departments);
                salariesEm.add(salaries);
                staffInDep.add(dep);
            }
            if (input.length == 5 && input[4].matches("(.*)@(.*)")){
               email = input[4];
               age = -1;
               employee.setEmail(email);
               employee.setAge(age);
               employees.add(employee);

            }else if (input.length == 5){
                email = "n/a";
                age = Integer.parseInt(input[4]);
                employee.setEmail(email);
                employee.setAge(age);
                employees.add(employee);
            }else if (input.length == 6){
                email = input[4];
                age = Integer.parseInt(input[5]);
                employee.setEmail(email);
                employee.setAge(age);
                employees.add(employee);
            }else {
                email = "n/a";
                age = -1;
                employee.setEmail(email);
                employee.setAge(age);
                employees.add(employee);
            }


        }

        for (int i = 0; i < departmentsEm.size(); i++) {

            salariesEm.set(i,(salariesEm.get(i)/staffInDep.get(i)));

        }

        Double obj = Collections.max(salariesEm);
        int index = salariesEm.indexOf(obj);
        String depMax = departmentsEm.get(index);


        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return ((int) t1.getSalary() - (int) employee.getSalary());
            }
        });

        if (!departmentsEm.isEmpty()) {
            if (employees.get(0).getDepartment().equals(depMax)) {
                System.out.printf("Highest Average Salary: %s%n", depMax);
            }else{
                System.out.printf("Highest Average Salary: %s%n",employees.get(0).getDepartment());
            }
        }else {

            System.out.printf("Highest Average Salary: %s%n",employees.get(0).getDepartment());
        }





        for (Employee employee : employees) {
            if (employee.getDepartment().equals(depMax)) {
                System.out.println(employee);
            }
        }
    }


}
