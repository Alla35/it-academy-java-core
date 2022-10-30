package by.it_academy.lesson7.Task2;

public class Counter {
    private int value;

    public Counter(int starValue) {
        this.value = starValue;
    }

    public Counter() {
        this(0);
    }

    public int Value() {
        return value;
    }

    public void increase() {
        this.value = value + 1;
    }

    public void decrease() {
        this.value = value - 1;
    }

    public void increase(int increaseBy) {
        this.value = value + increaseBy;
    }

    public void decrease(int decreaseBy) {
        this.value = value - decreaseBy;
    }
}



