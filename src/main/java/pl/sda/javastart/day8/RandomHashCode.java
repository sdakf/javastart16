package pl.sda.javastart.day8;

import org.apache.commons.lang3.RandomUtils;

import java.util.Objects;
import java.util.Random;

public class RandomHashCode {
    private String value;

    public RandomHashCode(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomHashCode that = (RandomHashCode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return new Random().nextInt(10);
    }
}
