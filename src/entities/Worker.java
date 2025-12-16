package entities;

import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContracts(HourContract hourContract) {
        contracts.add(hourContract);
    }

    public Double income (int month, int  year) {
        double sum = baseSalary;

        for (HourContract c : contracts) {
            if (c.getDate().getYear() == year &&
                    c.getDate().getMonthValue() == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
