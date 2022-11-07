package by.it_academy.lesson8.task1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name() + " barks");
    }

}

