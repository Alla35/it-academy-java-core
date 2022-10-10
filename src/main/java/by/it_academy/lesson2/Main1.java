package by.it_academy.lesson2;

public class Main1 {

    public static void main(String[] args) {
        int a = 8;
        int b = 2345;

        double result = ((a + b) / 3) % -6;
        System.out.println(result);
        System.out.println(result >= -10);
        System.out.println(result < 9);
        System.out.println(result == 0);
        System.out.println(result != -3);
    }

}
