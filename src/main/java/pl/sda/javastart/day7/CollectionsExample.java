package pl.sda.javastart.day7;

import pl.sda.javastart.day6.Pensioner;
import pl.sda.javastart.day6.Person;
import pl.sda.javastart.day6.Student;
import pl.sda.javastart.day6.Worker;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectionsExample {

    public static final Student student1 = new Student("student3", "Nowak", 3, 5, 43, BigDecimal.ZERO);
    public static final Student student2 = new Student("student5", null, 5, 5, 43, BigDecimal.ZERO);
    public static final Worker worker1 = new Worker("worker6", "Kowalski", 6, 6, BigDecimal.ZERO);
    public static final Pensioner pensioner1 = new Pensioner("pensioner7", "Psikuta ", 7, 5, BigDecimal.ZERO);
    public static final Pensioner pensioner2 = new Pensioner("pensioner7", "Psikuta", 7, 5, BigDecimal.ZERO);


    public static void main(String[] args) {

        treeSetExample();

        listExample();

        hashSetExample();

        hashMapExample();

        namesStatisticsMap();

        List<Person> personList = populatePeopleLIst();
        Map<String, Long> resultMap = personList.stream()
                .filter(e -> e.getLastName() != null)
                .map(e -> e.getLastName().trim())
                .collect(groupingBy(e -> e, counting()));
        System.out.println(resultMap);
    }

    private static void namesStatisticsMap() {
        List<Person> personList = populatePeopleLIst();
        Map<String, Integer> resultMap = new HashMap<>();
        for (Person x : personList) {
            String ourKey;
            if (x.getLastName() == null) {
                ourKey = null;
            } else {
                ourKey = x.getLastName().trim();
            }
            if (resultMap.containsKey(ourKey)) {
                int counter = resultMap.get(ourKey);
                resultMap.replace(ourKey, counter + 1);
            } else {
                resultMap.put(ourKey, 1);
            }
        }

        System.out.println(resultMap);
    }

    private static void hashMapExample() {
        Map<Integer, Person> personsMap = new HashMap<>();
        personsMap.put(student1.getIdentity(), student1);
        personsMap.put(worker1.getIdentity(), worker1);
        personsMap.put(pensioner1.getIdentity(), pensioner1);
        personsMap.put(student2.getIdentity(), student2);
        personsMap.put(pensioner2.getIdentity(), pensioner2);
        System.out.println(personsMap);
    }

    private static void hashSetExample() {
//        Set<Person> ofPersonsSet = new LinkedHashSet<>();  *w tym przypadku zostanie zachowana kolejność dodawania elementów*
        Set<Person> ofPersonsSet = new HashSet<>();
        System.out.println(ofPersonsSet.add(student1));
        System.out.println(ofPersonsSet.add(pensioner1));
        System.out.println(ofPersonsSet.add(worker1));
        System.out.println(ofPersonsSet.add(pensioner2));
        System.out.println(ofPersonsSet.add(student2));
        System.out.println(ofPersonsSet.size());
        System.out.println(ofPersonsSet);
    }

    private static void listExample() {
        List<Person> personList = populatePeopleLIst();

        System.out.println(personList.contains(pensioner1));
        personList.remove(pensioner1);
        System.out.println(personList.contains(pensioner1));

        System.out.println(personList);
    }

    private static List<Person> populatePeopleLIst() {
        List<Person> personList = new ArrayList<>();
        personList.add(student1);
        personList.add(student2);
        personList.add(worker1);
        personList.add(pensioner2);
        personList.add(pensioner1);
        return personList;
    }

    private static void treeSetExample() {
        Set<Person> tSet = new TreeSet<>();
        tSet.add(student2);
        tSet.add(student1);
        System.out.println(tSet.toString());

        for (Person x : tSet) {
            System.out.println(x.getFirstName());
        }

        tSet.stream()
                .map(e -> e.getFirstName())
                .forEach(e -> System.out.println(e));
    }
}
