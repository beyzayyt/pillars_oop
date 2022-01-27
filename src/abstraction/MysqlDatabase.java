package abstraction;

public class MysqlDatabase extends Abstraction {

    @Override
    void update() {
        System.out.println("Mysql is updated.");
    }

    @Override
    void get() {
        System.out.println("Mysql updated tha datas...");
    }
}
