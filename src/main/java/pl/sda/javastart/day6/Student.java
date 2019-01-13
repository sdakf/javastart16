package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Student extends Person {
    private Integer indexNo;
    private BigDecimal scholarship;

    public Student(String firstName, String lastName, Integer identity, Integer age, Integer indexNo, BigDecimal scholarship) {
        super(firstName, lastName, identity, age);
        this.indexNo = indexNo;
        this.scholarship = scholarship;
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
}
