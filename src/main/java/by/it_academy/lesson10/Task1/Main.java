package by.it_academy.lesson10.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(15);
        numbers.add(3);
        numbers.add(7);
        numbers.add(10);
        System.out.println(average(numbers));
        printInRange(numbers, 1, 7);
    }
    private static double average(List<Integer> numbers) {
        double sum =0;
        for (int i = 0; i < numbers.size(); i++ ) {
            sum += numbers.get(i);
        }
        return sum/ numbers.size();
    }
    private  static  void printInRange(List<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer number : numbers) {
            if (number>=lowerLimit && number<=upperLimit) {
                System.out.println(number);
            }
            
        }

    }
}
