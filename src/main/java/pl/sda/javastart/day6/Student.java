package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Student extends Person implements NameHolder {
    private Integer indexNo;
    private BigDecimal scholarship;

    public Student(String firstName, String lastName, Integer identity, Integer age, Integer indexNo, BigDecimal scholarship) {
        super(firstName, lastName, identity, age);
        this.indexNo = indexNo;
        this.scholarship = scholarship;
    }

    public void introductionInner(){
        super.intoduction();
        System.out.println("Ale też studencik");
    }

    @Override
    public String showYourName() {
        return getFirstName() + " " + super.getLastName(); // super. może być ale nie musi - jest domyślne
    }

    @Override
    public BigDecimal showIncome() {
        return scholarship;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public BigDecimal getScholarship() {
        return scholarship;
    }

    public void setScholarship(BigDecimal scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNo=" + indexNo +
                ", scholarship=" + scholarship +
                "} " + super.toString();
    }
}
