package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class OOP3 {
    public static void main(String[] args) {
//        Worker worker1 = new Worker();
//        Person person1 = new Person();
        Worker worker = new Worker("Adam","Nowak",123,50, BigDecimal.valueOf(1300));
        Student student = new Student("Kasia","Kowalska",321,20,987,BigDecimal.valueOf(600));
        Pensioner pensioner = new Pensioner("Janusz","Kwiatkowski",912,91,BigDecimal.valueOf(800));


    }
}
