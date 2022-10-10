package by.it_academy.lesson3;

public class Main2 {
    public static void main(String[] args) {

        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Distinction");
            case 'B':
                System.out.println("First class");
                break;
            case 'C':
                System.out.println("First class");
            case 'D':
                System.out.println("You have passed");
            case 'F':
                System.out.println("Fail.Try again");
            default:
                System.out.println("Invalid grade");
    }
    }
}
