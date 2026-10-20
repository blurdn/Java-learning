package moocfi.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    private final Map<String, String> abbreviationsMap = new HashMap<>();

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationsMap.put(sanitizeString(abbreviation), explanation);
    }

    public static String sanitizeString(String str) {
        return str.trim().toLowerCase();
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationsMap.containsKey(sanitizeString(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviationsMap.get(sanitizeString(abbreviation));
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
