package pl.sda.javastart.day5;

public class ExperimentalObject {
    private Integer notFinalImmutable;
    private final Integer finalImmutable; //cannot change reference
    private final TestPerson finalMutable;

    public ExperimentalObject(Integer notFinalImmutable, Integer finalImmutable, TestPerson finalMutable){
        this.notFinalImmutable = notFinalImmutable;
        this.finalImmutable = finalImmutable;
        this.finalMutable = finalMutable;
    }

    public TestPerson getFinalMutable() {
        return finalMutable;
    }

    public Integer getNotFinalImmutable() {
        return notFinalImmutable;
    }

    public void setNotFinalImmutable(Integer notFinalImmutable) {
        this.notFinalImmutable = notFinalImmutable;
    }

    public Integer getFinalImmutable() {
        return finalImmutable;
    }
}
