package pl.sda.javastart.day6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOP3 {
    public static void main(String[] args) {
//        Worker worker1 = new Worker();
//        Person person1 = new Person(); - nie zadziała na klasie abstrakcyjnej Person!
        Worker worker = new Worker("Adam", "Nowak", 123, 50, BigDecimal.valueOf(1300));
        Student student = new Student("Kasia", "Kowalska", 321, 20, 987, BigDecimal.valueOf(600));
        Pensioner pensioner = new Pensioner("Janusz", "Kwiatkowski", 912, 91, BigDecimal.valueOf(800));

        Person[] people = new Person[]{worker, student, pensioner};
        Object[] objects = new Object[]{worker, student, pensioner};

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(worker);
        peopleList.add(student);
        peopleList.add(pensioner);

        printDataLegacyMode(worker, student, pensioner);
        printDataProperWay(peopleList);

        List<NameHolder> nameHolders = new ArrayList<>();
        nameHolders.add(worker);
        nameHolders.add(student);
//        nameHolders.add(pensioner); - nie implementuje tego interfejsu
        printNames(nameHolders);
    }

    private static void printNames(List<NameHolder> nameHolders) {
        for (NameHolder nameHolder : nameHolders) {
            System.out.println(nameHolder.showYourName());
        }
    }

    private static void printDataLegacyMode(Worker worker, Student student, Pensioner pensioner) {
        System.out.println(worker.showIncome());
        System.out.println(student.showIncome());
        System.out.println(pensioner.showIncome());
        worker.introductionInner();
        student.introductionInner();
        pensioner.introductionInner();
    }

    private static void printDataProperWay(List<Person> peopleInfo) {
        for (Person person : peopleInfo) {
            System.out.println(person.showIncome());
            if (person instanceof Worker) {
                ((Worker) person).introductionInner();
            } else if (person instanceof Student) {
                ((Student) person).introductionInner();
            } else {
                ((Pensioner) person).introductionInner();
            }
        }
    }
}

