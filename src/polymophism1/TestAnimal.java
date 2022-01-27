package polymophism1;

import org.junit.Test;

public class TestAnimal {

    public static void speakTry(Animal animal){
        animal.speak();
    }

    @Test
    public void animalTest(){
        Animal animal = new Animal("animal");
        Bird bird = new Bird("Akif");
        Dog dog = new Dog("Pati");
        Horse horse = new Horse("Leyla");

        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();

        Animal anim = new Bird("Burcu"); // This is a polymorphism
        anim.speak();

        speakTry(new Horse("Leyloş")); // This is polymorphism

    }
}
