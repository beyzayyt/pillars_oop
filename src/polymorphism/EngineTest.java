package polymorphism;

import org.junit.Test;

public class EngineTest {
    Tesla tesla = new Tesla();
    Mercedes mercedes = new Mercedes();
    Porsche porsche = new Porsche();

    @Test
    public void carTest() {
        System.out.println("Testing Tesla\n");
        System.out.println(tesla.getVehicleType());
        tesla.startEngine();

        System.out.println("Testing Mercedes\n");
        System.out.println(mercedes.getVehicleType());
        mercedes.startEngine();

        System.out.println("Testing Porsche\n");
        System.out.println(porsche.getVehicleType());
        porsche.startEngine();
    }

}
