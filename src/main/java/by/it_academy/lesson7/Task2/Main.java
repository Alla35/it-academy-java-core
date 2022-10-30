package by.it_academy.lesson7.Task2;

public class Main {
    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter(3);

        System.out.println("counter: " + firstCounter.Value());
        firstCounter.increase();
        System.out.println("counter increase: value = " + firstCounter.Value());
        firstCounter.decrease();
        System.out.println("counter decrease: value = " + firstCounter.Value());
        firstCounter.increase(9);
        System.out.println("counter increase by value: value = " + firstCounter.Value());
        firstCounter.decrease(5);
        System.out.println("counter decrease: value = " + firstCounter.Value());

        System.out.println("second counter: " + secondCounter.Value());
        secondCounter.increase();
        System.out.println("second counter increase: value = " + secondCounter.Value());
        secondCounter.decrease();
        System.out.println("second counter decrease: value = " + secondCounter.Value());
        secondCounter.increase(9);
        System.out.println("second counter increase by value: value = " + secondCounter.Value());
        secondCounter.decrease(5);
        System.out.println("second counter decrease: value = " + secondCounter.Value());

    }
}