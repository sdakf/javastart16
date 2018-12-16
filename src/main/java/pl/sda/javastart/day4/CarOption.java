package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class CarOption {
    private String optionName;
    private BigDecimal optionPrice;
    private boolean choosen;

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName (String optionName) {
        this.optionName = optionName;
    }

    public BigDecimal getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(BigDecimal optionPrice) {
        this.optionPrice = optionPrice;
    }

    public boolean isChoosen() {
        return choosen;
    }

    public void setChoosen(boolean choosen) {
        this.choosen = choosen;
    }
}
