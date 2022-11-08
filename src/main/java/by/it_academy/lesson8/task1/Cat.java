package by.it_academy.lesson8.task1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void purr() {
        System.out.println(name() + " purrs");
    }


}
