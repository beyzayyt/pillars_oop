package polymophism1;

/*
Inheritance relationship must be defined
The object created from the subclass type must be reached with the reference variable defined from the ancestor class type
The subclass must have overridden its ancestor's method(s).
*** Polymorphism provides extensibility of code by separating what to do from how to do it.
 */

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal is speaking...");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " barking");
    }
}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " singing");
    }
}

class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() { // This is a polymorphism
        System.out.println(getName() + " neighing ");
    }
}