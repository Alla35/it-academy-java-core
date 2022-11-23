package by.it_academy.lesson10.Task2;

import javax.print.attribute.standard.JobName;

public class Main {
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();

        abbreviations.addAbbreviation("BNA", "Belarusian national airport");
        abbreviations.addAbbreviation("UEFA", "Union of European Football Associations");
        abbreviations.addAbbreviation("WHO", "World Health Organization");

        System.out.println("abbreviations.hasAbbreviation(\"BMA\") = " + abbreviations.hasAbbreviation("mlkh"));
        System.out.println("abbreviation.findE[planationFor(\"UEFA\" = " + abbreviations.findExplanationFor("UEFA"));
        abbreviations.printAbbrevitions();
        abbreviations.printAbbreviationsWhere("FA");
        abbreviations.printExplanationOfAbbreviationsWhere("WH");

    }
}
