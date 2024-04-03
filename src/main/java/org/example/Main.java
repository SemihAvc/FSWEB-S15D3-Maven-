package org.example;

import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "John", "Doe"));
        employees.add(new Employee(2, "Jane", "Doe"));
        employees.add(new Employee(3, "John", "Smith"));
        employees.add(new Employee(4, "Emily", "Johnson"));
        employees.add(new Employee(1, "John", "Doe"));
        employees.add(new Employee(5, "Michael", "Brown"));
        employees.add(new Employee(2, "Jane", "Doe"));

        List<Employee> duplicates = findDuplicates(employees);
        System.out.println("Duplicate employees: " + duplicates);

        List<Employee> uniques = findUniques(employees);
        System.out.println("Unique employees: " + uniques);

        List<Employee> onlyUnique = removeDuplicates(employees);
        System.out.println("Only Unique employees: " + onlyUnique);
    }

    public static List<Employee> findDuplicates(List<Employee> employees) {
        List<Employee> duplicatesEmployee = new LinkedList<>();
        Map<Integer, Employee> employeeMap = new HashMap<>();

        for (Employee employee : employees) {
            if (employee == null) {
                System.out.println("null data bulundu");
                continue;
            }
            if (employeeMap.containsKey(employee.getId())) {
                duplicatesEmployee.add(employee);
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }
        return duplicatesEmployee;
    }

    public static List<Employee> findUniques(List<Employee> employees) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            if (employee != null) {
                employeeMap.put(employee.getId(), employee);
            } else {
                System.out.println("data null");
            }
        }
        return new LinkedList<>(employeeMap.values());
    }

    public static List<Employee> removeDuplicates(List<Employee> employees) {
        List<Employee> duplicates = findDuplicates(employees);
        List<Employee> uniques = findUniques(employees);

        uniques.removeAll(duplicates);
        return uniques;
    }
}
