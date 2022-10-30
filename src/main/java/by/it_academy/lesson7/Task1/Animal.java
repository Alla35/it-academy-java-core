package by.it_academy.lesson7.Task1;

public class Animal {
    private String name;

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

