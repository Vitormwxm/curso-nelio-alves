package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        double netSalary;
        return netSalary = grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary = (grossSalary * percentage / 100) + netSalary();
    }
}
