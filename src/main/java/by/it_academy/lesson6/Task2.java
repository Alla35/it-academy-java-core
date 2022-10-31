package by.it_academy.lesson6;

public class Task2 {
    public static void main(String[] args) {
        String[] list = new String[]{"Svetlana,1987", "Ira,1997" };
        String longestName = "";
        double sum = 0;
        for (final String item : list) {
            String[] nameAndYear = item.split(",");
            String name = nameAndYear[0];
            if (longestName.length() < name.length()) {
                longestName = name;
            }
            sum += Integer.parseInt(nameAndYear[1]);
        }
        System.out.println(longestName);
        System.out.println(sum / list.length);

    }
}
