package pl.sda.javastart.day5;

public class OOP2 {
    public static void main(String[] args) {
        equalsExample();
        referenceExample();
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1.getIdentity());
        System.out.println(person2.getIdentity());
        System.out.println("ludzi na świecie jest: " + (Person.counter - 1));

        CalculatorUtils utils = new CalculatorUtils();
        System.out.println(utils.add(3,7));
        System.out.println(CalculatorUtils.adding(4,5));
    }



    private static void referenceExample() {
        String s1 = "napis";
        String s2 = "napis";
        String s3 = new String("napis");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        Long firstNumber = 127L;
        Long secondNumber = 127L;
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber.equals(secondNumber));
        Long thirdNumber = 128L;
        Long fourthNumber = 128L;
        System.out.println(fourthNumber == thirdNumber);
        System.out.println(fourthNumber.equals(thirdNumber));
    }

    private static void equalsExample() {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setFirstName("Anna");
        person2.setFirstName("Anna");
        person1.setIdentity(123);
        person2.setIdentity(123);
        person1.setSurname("Nowak");
        person2.setSurname("N");
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode() == person2.hashCode());

        Person person3 = new Person("Anna", "Nowak", 123);
        System.out.println(person1.equals(person3));
        person3.setIdentity(111);
        System.out.println(person1.equals(person3));

        String a = "A"; //immutable
        String b = a + "!";

        Long aLong = new Long(123L);

    }
}
