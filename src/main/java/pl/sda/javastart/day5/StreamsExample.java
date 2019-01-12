package pl.sda.javastart.day5;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsExample {
    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", "  pig", "dog", null, "parrot"};

    public static void main(String[] args) {
        firstStream();
        secondStream();
    }

    private static void firstStream() {
        //        String[] unique;
        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            animal = animal.trim();
            if (animal.length() >= 4) {
                //todo unikalnosc
                System.out.println(animal);
            }
        }
        System.out.println("teraz stream");
        Arrays.stream(animals) //tu jest strumien Stringów
                .filter(e -> e != null)
                .map(e -> e.trim())
                .filter(e -> e.length() >= 4) // każde "e" to obiekt typu String
                .distinct()
                .forEach(e -> System.out.println(e));
    }

    private static void secondStream() {
        for (String animal : animals) {
            if(animal == null){
                continue;
            }
            System.out.print(animal + ","); //todo brak przecinka po ostatnim
        }
        System.out.println("# teraz stream");
        String result = Arrays.stream(animals)
                .filter(a -> StringUtils.isNotBlank(a))
                .map(a -> a.trim())
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
