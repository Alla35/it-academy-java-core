package by.it_academy.lesson6;

public class Task2 {
    public static void main(String[] args) {
        String[] list = new String[]{"Svetlana,1987", "Ira,1997" };
        String LongestName = "";
        double sum = 0;
        for (final String item : list) {
            String[] nameAndYear = item.split(",");
            String name = nameAndYear[0];
            if (LongestName.length() < name.length()) {
                LongestName = name;
            }
            sum += Integer.parseInt(nameAndYear[1]);
        }
        System.out.println(LongestName);
        System.out.println(sum / list.length);

    }
}
