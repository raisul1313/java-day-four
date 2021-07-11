package employee;

public class MonthlySalaried extends Employee{
    private double baseSalary;              

    public MonthlySalaried(double baseSalary, String name) {
        super(name);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getTotalEarning() {
        return baseSalary;
    } 
}
