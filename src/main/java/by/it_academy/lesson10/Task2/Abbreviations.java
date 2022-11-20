package by.it_academy.lesson10.Task2;

import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    private final Map<String, String> map = new HashMap<>();

    void addAbbreviation(String abbreviation, String explanation) {
        map.put(abbreviation, explanation);
    }

    boolean hasAbbreviation(String abbreviation) {
        return map.containsKey(abbreviation);
    }

    String findExplanationFor(String abbreviation) {
        return map.get(abbreviation);
    }

    void printAbbrevitions() {
        System.out.println(map.keySet());
        }

    void printAbbreviationsWhere(String text) {
        for (String abbreviation : map.keySet()) {
            if (abbreviation.contains(text)) {
                System.out.println(abbreviation);
            }
        }
    }

    void printExplanationOfAbbreviationsWhere(String text) {
        for (String abbreviation : map.keySet()) {
            if (abbreviation.contains(text)) {
                System.out.println(map.get(abbreviation));
            }
        }
    }
}
