package pl.sda.javastart.day8;

import java.math.BigDecimal;

public class Customer {

    private Integer id;
    private final String firstName;
    private final String surname;
    private final Integer age;
    private final BigDecimal salary;
    private static Integer counter = 1;

    {
     id = counter++;
        System.out.println("Blok inicjalizujący");
    }

    public Customer(String firstName, String surname, Integer age, String salary) {
//        this.firstName = firstName;
//        this.surname = surname;
//        this.age = age;
//        this.salary = BigDecimal.valueOf(Integer.valueOf(salary));//string do BigDecimal
        this(firstName, surname, age, Integer.valueOf(salary));//wywołanie drugiego konstruktora, zamiast powielania kodu
    }

    public Customer(String firstName, String surname, Integer age, Integer salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.salary = BigDecimal.valueOf(salary);
        System.out.println("konstruktor");
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public static Integer getCounter() {
        return counter;
    }
}
