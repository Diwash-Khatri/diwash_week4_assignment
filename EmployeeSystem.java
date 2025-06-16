class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class Developer extends Employee {
    private int overtimeHours;
    private double ratePerHour;

    public Developer(String name, int id, double baseSalary, int overtimeHours, double ratePerHour) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.ratePerHour = ratePerHour;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (overtimeHours * ratePerHour);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Mahesh", 101, 50000, 10000);
        Employee developer = new Developer("Saurav", 102, 40000, 20, 50);

        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}

