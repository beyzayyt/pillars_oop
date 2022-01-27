package polymorphism;
// Çok biçimlilik
public interface Engine {

    String vehicleType = " I am a car !";

    default  String getVehicleType() {
        return vehicleType;
    }

    void startEngine();

}

class Mercedes implements Engine {
    @Override
    public void startEngine() {
        System.out.println("I am Mercedes! Starting the AMG Engine now!\n");
    }
}

class Porsche implements Engine {
    @Override public void startEngine() {
        System.out.println("I am Porsche! Starting the Turbo Engine now!\n");
    }
}

class Tesla implements Engine {
    @Override public void startEngine() {
        System.out.println("I am Tesla! Starting the Electric Engine now!\n");
    }
}