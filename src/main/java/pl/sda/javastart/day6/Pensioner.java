package pl.sda.javastart.day6;


import java.math.BigDecimal;

public class Pensioner extends Person {
    private BigDecimal pension;

    public Pensioner(String firstName, String lastName, Integer identity, Integer age, BigDecimal pension) {
        super(firstName, lastName, identity, age);
        this.pension = pension;
    }

    public void introductionInner(){
        super.intoduction();
        System.out.println("Ale też emerycik");
    }

    @Override
    public BigDecimal showIncome() {
        return pension;
    }

    public BigDecimal getPension() {
        return pension;
    }

    public void setPension(BigDecimal pension) {
        this.pension = pension;
    }
}
