package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class Car {
    private String colour;
    private String model;
    private String manufacture;
    private String vin;
    private int hp;
    private BigDecimal basePrice;
    private int doorNumber;
    private CarOption[] options;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
