package moocfi.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryOfManyTranslations {
    private final Map<String, List<String>> dictionary = new HashMap<>();

    public void add(String word, String translation) {
        List<String> translations = dictionary.computeIfAbsent(word, k -> new ArrayList<>());

        if (translations.contains(translation)) {
            return;
        }
        translations.add(translation);
    }

    public List<String> translate(String word) {
        return dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        dictionary.remove(word);
    }

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}
