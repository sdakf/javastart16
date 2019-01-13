package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Worker extends Person implements NameHolder{
    private BigDecimal salary;

    public Worker(String firstName, String lastName, Integer identity, Integer age, BigDecimal salary) {
//        super();  - Jeśli nie napiszemy super(....) z parametrami to w tym miejscu znajdzie sie (niewidoczny) super() bez parametrow
        super(firstName, lastName, identity, age);
        this.salary = salary;
    }

    public void introductionInner(){
        super.intoduction();
        System.out.println("Ale też pracuś");
    }

    @Override
    public String showYourName(){
        return getFirstName() + " " + super.getLastName(); // super. może być ale nie musi - jest domyślne
    }

    @Override
    public BigDecimal showIncome(){
        return salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
