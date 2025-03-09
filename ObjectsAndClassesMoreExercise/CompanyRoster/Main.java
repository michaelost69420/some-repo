package ObjectsAndClassesMoreExercise.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");

            if (input.length == 6) {
                employees.add(new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], input[4], Integer.parseInt(input[5])));
            } else if (input.length == 5) {
                if (isString(input[input.length - 1])) {
                    employees.add(new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], input[4]));
                } else {
                    employees.add(new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], Integer.parseInt(input[4])));
                }
            } else {
                employees.add(new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3]));
            }
        }

        String bestDepartment = getString(employees);

        System.out.printf("Highest Average Salary: %s%n", bestDepartment);
        List<Employee> employees1 = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(bestDepartment)) {
                employees1.add(employee);
            }
        }

        employees1.sort(Comparator.comparing(Employee::getSalary).reversed());

        for (Employee employee : employees1) {
            System.out.println(employee);
        }
    }

    private static String getString(List<Employee> employees) {
        String bestDepartment = "";
        double sum = 0;
        double avr = 0;
        int count = 0;
        for (int i = 0; i < employees.size(); i++) {
            String currentDepartment = employees.get(i).getDepartment();
            for (int j = i; j < employees.size(); j++) {
                if (employees.get(j).getDepartment().equals(currentDepartment)) {
                    sum += employees.get(j).getSalary();
                    count++;
                }
            }
            if (avr < sum / count) {
                avr = sum / count;
                bestDepartment = employees.get(i).getDepartment();
            }
        }
        return bestDepartment;
    }

    private static boolean isString (String input) {
        try {
            Integer.parseInt(input);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
}
