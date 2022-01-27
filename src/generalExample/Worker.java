package generalExample;

public abstract class Worker {
    private String name;
    private String surname;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract int calculateSalary();

    public String getInfo() {
        return this.whoIam() + ": " + this.name + " " +
                this.surname + " is going to earn " + this.calculateSalary() + " this month";
    }

    public abstract String whoIam();

}
