package pl.sda.javastart.day7;

public enum ColourEnum {

    BLACK(1, "czarny"), WHITE(2,"biały");

    private Integer colourNumber;
    private String plName;

    ColourEnum(int colourNumber, String plName) {
        this.colourNumber = colourNumber;
        this.plName = plName;
    }

    public Integer getColourNumber() {
        return colourNumber;
    }

    public String getPlName() {
        return plName;
    }
}
