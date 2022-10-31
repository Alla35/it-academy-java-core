package by.it_academy.lesson6;

public class Task1 {
    public static void main(String[] args) {

        String text = "something else";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            stringBuilder.append(text.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}
