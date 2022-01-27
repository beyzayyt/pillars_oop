package generalExample;

public class Manager extends Worker{

    private static final int salary = 2000;
    private static final int limitofBonus = 2000;
    private int sale;

    public Manager(String name, String surname) {
        super(name, surname);
    }

    public void setTotalSale(int sale){
        this.sale = sale;
    }

    @Override
    public int calculateSalary() {
        if(this.sale > Manager.limitofBonus){
            return salary + (this.sale - Manager.limitofBonus) / 10;
        }
        return salary;
    }

    @Override
    public String whoIam() {
        return "Manager";
    }
}