package pl.sda.javastart.day4;

import pl.sda.javastart.day7.ColourEnum;

import java.math.BigDecimal;

public class Car{
    private ColourEnum colour;
    private String model;
    private String manufacture;
    private String vin;
    private int hp;
    private BigDecimal basePrice;
    private int doorNumber;
    private CarOption[] options;

    public BigDecimal summaryPrice() {
        BigDecimal result = basePrice;
        if (options == null) {

            return result == null ? BigDecimal.ZERO : result;
        }
        for (int i = 0; i < options.length; i++) {
            result = result.add(options[i].getOptionPrice());
        }
        return result;
    }

    public ColourEnum getColour() {
        return colour;
    }

    public void setColour(ColourEnum colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public CarOption[] getOptions() {
        return options;
    }

    public void setOptions(CarOption[] options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return model + " " + summaryPrice();
    }
}
