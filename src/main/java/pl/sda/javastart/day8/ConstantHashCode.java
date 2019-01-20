package pl.sda.javastart.day8;

import java.util.Objects;

public class ConstantHashCode {
    private String value;

    public ConstantHashCode(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstantHashCode that = (ConstantHashCode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return 5;
    }
}
