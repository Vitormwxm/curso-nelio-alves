package Application;

import entities.Employee;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = scanner.nextLine();
        System.out.println("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.println("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("Employee: " + employee.name + ", " + "$" + employee.netSalary());
        System.out.println();
        System.out.println("Which percentage to increase salary?");
        double increaseSalaryEmployee = scanner.nextDouble();
        employee.increaseSalary(increaseSalaryEmployee);

        System.out.println("Updated data: " + employee.name + ", " + employee.grossSalary);
    }
}
