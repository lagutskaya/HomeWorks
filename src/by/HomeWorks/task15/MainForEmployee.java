package by.HomeWorks.task15;

import java.util.*;

public class MainForEmployee {
    public static void main(String[] args) {
        Employee ivan = new Employee(18, "i-1", "Ivan", 200.0, "Ivanov");
        Employee aleksei = new Employee(22, "i-2", "Aleksei", 150.20, "Alekseev");
        Employee andrey = new Employee(38, "i-3", "Andrey", 3500, "Andreev");
        Employee polina = new Employee(44, "i-4", "Polina", 202.22, "Polinina");
        Employee anna = new Employee(68, "i-5", "Anna", 1234.44, "Annova");
        Employee katya = new Employee(34, "i-6", "Katya", 1000, "Katina");
        Employee petr = new Employee(28, "i-7", "Petr", 5000, "Petrov");
        Employee kostya = new Employee(16, "i-8", "Kostya", 2332.2323, "Kostin");

        Map<Employee, String> employees = new HashMap<>();
        employees.put(ivan, "QA Engineer");
        employees.put(aleksei, "Java Developer");
        employees.put(andrey, "Support Engineer");
        employees.put(polina, "TV assistant");
        employees.put(anna, "Photographer");
        employees.put(katya, "Director");
        employees.put(petr, "Director");
        employees.put(kostya, "Cleaner");

        System.out.println("Все сотрудники : \n" + employees);

        List<Employee> updatedEmployees = raiseSalaryForProfession(employees, "Director", 200);

        System.out.println("\nСотрудники, которым подняли зарплату:");
        for (Employee emp : updatedEmployees) {
            System.out.println(emp);
        }

        Map<String, Collection<Employee>> groupedEmployees = groupEmployeesByProfession(employees);

        System.out.println("\nСотрудники, сгруппированные по профессии: \n");
        for (Map.Entry<String, Collection<Employee>> entry : groupedEmployees.entrySet()) {
        System.out.println("Профессия: " + entry.getKey() + ", Сотрудники: " + entry.getValue());
    }
}

        private static Map<String, Collection<Employee>> groupEmployeesByProfession(Map<Employee, String> employees) {
        Map<String, Collection<Employee>> groupedMap = new HashMap<>();

        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
        Employee employee = entry.getKey();
        String profession = entry.getValue();

        if (!groupedMap.containsKey(profession)) {
            groupedMap.put(profession, new ArrayList<>());
        }
        groupedMap.get(profession).add(employee);
    }

    return groupedMap;
}

    private static List<Employee> raiseSalaryForProfession(Map<Employee, String> employees, String profession, double amountOfIncrease) {
        List<Employee> updatedEmployees = new ArrayList<>();
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equals(profession)) {
                Employee employee = entry.getKey();
                employee.setSalary(employee.getSalary() + amountOfIncrease);
                updatedEmployees.add(employee);
            }
        }
        return updatedEmployees;
    }
    }
