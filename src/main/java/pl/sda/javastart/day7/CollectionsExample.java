package pl.sda.javastart.day7;

import pl.sda.javastart.day6.Pensioner;
import pl.sda.javastart.day6.Person;
import pl.sda.javastart.day6.Student;
import pl.sda.javastart.day6.Worker;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CollectionsExample {

    public static final Student student1 = new Student("B3", "b", 3, 5,43, BigDecimal.ZERO);
    public static final Student student2 = new Student("B5", "b", 5, 5,43, BigDecimal.ZERO);
    public static final Worker worker1 = new Worker("B6", "b", 6, 6, BigDecimal.ZERO);
    public static final Pensioner pensioner1 = new Pensioner("B7", "b", 7, 5, BigDecimal.ZERO);
    public static final Pensioner pensioner2 = new Pensioner("B7", "b", 7, 5, BigDecimal.ZERO);


    public static void main(String[] args) {
        treeSetExample();

        List<Person> personList = new ArrayList<>();
        personList.add(student1);
        personList.add(student2);
        personList.add(worker1);
        personList.add(pensioner2);

        System.out.println(personList.contains(pensioner1));
        personList.remove(pensioner1);
        System.out.println(personList.contains(pensioner1));

        System.out.println(personList);

    }

    private static void treeSetExample() {
        TreeSet<Person> tSet = new TreeSet<>();
        tSet.add(student2);
        tSet.add(student1);
        System.out.println(tSet.toString());

        for (Person x: tSet) {
            System.out.println(x.getFirstName());
        }

        tSet.stream()
                .map(e -> e.getFirstName())
                .forEach(e -> System.out.println(e));
    }
}
