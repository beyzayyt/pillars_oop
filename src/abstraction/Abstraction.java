package abstraction;

import org.junit.Test;

/*
You can not create object from abstract classes.
 */

public abstract class Abstraction {

    public void add() {
        System.out.println("Added...");
    }

    public void delet() {
        System.out.println("Deleted...");
    }

    abstract void update();

    abstract void get();


    @Test
    public void testData() {

        Abstraction abs =  new MysqlDatabase();
        abs.add();
        abs.update();
    }
}
