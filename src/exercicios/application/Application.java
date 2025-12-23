package exercicios.application;

import exercicios.entities.Employee;
import exercicios.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees");

        int numberOfEmployees = scanner.nextInt();

        List<Employee> list = new ArrayList<>();
        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.println("Outsourced (y/n)?");
            String isOutsourced = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = scanner.nextDouble();

            if (isOutsourced.equals("y")) {
                System.out.print("Additional Charge ");
                Double additionalCharge = scanner.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                list.add(employee);
            }
        }

        System.out.println("PAYMENTS: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " - $" + list.get(i).payment());
        }


    }
}
