package Application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department name: ");
        String departmentName = scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = scanner.nextLine();
        System.out.println("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.println("salary: ");
        Double workerSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = scanner.nextInt();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Contract #" + i + " data:");
            System.out.println("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(scanner.next(), dateTimeFormatter);
            System.out.println("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Dapartment: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        scanner.close();



    }
}
