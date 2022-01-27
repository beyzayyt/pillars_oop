package generalExample;

import org.junit.Test;

public class Store {
    @Test
    public void storeTest(){
        Worker workers[] = new Worker[2];

        workers[0] = new Manager("Beyzanur", "Yeşilyurt");
        ((Manager)workers[0]).setTotalSale(37000);

        workers[1] = new Employee("Hasan", "Ali");
        ((Employee)workers[1]).setWorkingHours(60);

        System.out.println("The salaries of employes: ");
        for( int i =0; i< workers.length; ++i){
            System.out.println(workers[i].getInfo());
        }


    }
}
