package by.it_academy.lesson4;

public class Main2 {
    public static void main(String[] args) {

        int[] number = new int[]{1, 3, 4};

        for (int i : number) {

            for (int h = 0; h < i; h++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}