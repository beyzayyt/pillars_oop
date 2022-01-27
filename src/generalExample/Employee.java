package generalExample;

public class Employee extends Worker {

    private static final int hourlyRate = 10;
    private int workingHours;

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return this.workingHours * Employee.hourlyRate;

    }

    @Override
    public String whoIam() {
        return "Employee";
    }
}
