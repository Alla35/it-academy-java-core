package by.it_academy.lesson4;

public class Main1 {
    public static void main(String[] args) {
        int[] number = new int[]{3, -7, 5, 8, 6};

        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println(sum);
    }
}
