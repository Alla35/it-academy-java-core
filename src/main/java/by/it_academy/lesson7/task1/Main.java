package by.it_academy.lesson7.task1;

public class Main {
    public static void main(String[] args) {
        Dog someDog = new Dog("Bim");
        someDog.eat();
        someDog.makeNoise();

        Cat someCat = new Cat("Kozesha");
        someCat.sleep();
        someCat.makeNoise();
    }
}
