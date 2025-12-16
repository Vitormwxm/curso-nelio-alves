package Application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.next();

        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.next();
        System.out.print("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(scanner.next());
        System.out.print("Base Salary: ");
        Double workerBaseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, workerLevel, workerBaseSalary, new Department(departmentName));
        System.out.println("How many contracts to this worker?");
        int quantityContracts = scanner.nextInt();

        for (int i = 1; i <= quantityContracts; i++) {
            System.out.println("Enter contracts #" + i + " data:" );
            System.out.print("Date (DD/MM/YYY): ");
            LocalDate date = LocalDate.parse(scanner.next(), dateTimeFormatter);
            System.out.print("Value per hour: ");
            Double valuePerHour = scanner.nextDouble();
            System.out.println("Duration (hours): ");
            int duration = scanner.nextInt();

            HourContract hourContract = new HourContract(date, valuePerHour, duration);

            worker.addContracts(hourContract);
        }

        System.out.println("Enter month and Year to calculate income(MM/YYYY):");
        String yearAndMonthIncome = scanner.next();
        int month = Integer.parseInt(yearAndMonthIncome.substring(0,2));
        int year = Integer.parseInt(yearAndMonthIncome.substring(3));
        worker.income(month, year);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + yearAndMonthIncome + ": " + String.format("%.2f", worker.income(month, year)));
    }
}
