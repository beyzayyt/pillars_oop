package encapsulation;

/*
The Encapsulation principle states that the values of attributes belonging to a class can only be
can be modified by methods encoded inside the class, and readability principle. Thus, the states of
objects are always may remain significant.
 */

import org.junit.Test;

public class Encapsulation {

    // Private variables declared and these can only be accessed
    // by public methods of class.
    private String name;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
            return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    @Test
    public void testEncapsulation(){
        Encapsulation object = new Encapsulation();
        object.setName("Beyza");
        object.setAge(23);

        System.out.println("Name is " + object.getName() + ", Age is " + object.getAge());
    }


}
