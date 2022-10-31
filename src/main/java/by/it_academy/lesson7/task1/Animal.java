package by.it_academy.lesson7.task1;

public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

}

