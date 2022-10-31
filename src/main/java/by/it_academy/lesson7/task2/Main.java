package by.it_academy.lesson7.task2;

public class Main {
    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter(3);

        System.out.println("counter: " + firstCounter.value());
        firstCounter.increase();
        System.out.println("counter increase: value = " + firstCounter.value());
        firstCounter.decrease();
        System.out.println("counter decrease: value = " + firstCounter.value());
        firstCounter.increase(9);
        System.out.println("counter increase by value: value = " + firstCounter.value());
        firstCounter.decrease(5);
        System.out.println("counter decrease: value = " + firstCounter.value());

        System.out.println("second counter: " + secondCounter.value());
        secondCounter.increase();
        System.out.println("second counter increase: value = " + secondCounter.value());
        secondCounter.decrease();
        System.out.println("second counter decrease: value = " + secondCounter.value());
        secondCounter.increase(9);
        System.out.println("second counter increase by value: value = " + secondCounter.value());
        secondCounter.decrease(5);
        System.out.println("second counter decrease: value = " + secondCounter.value());

    }
}