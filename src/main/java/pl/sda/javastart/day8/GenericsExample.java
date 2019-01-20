package pl.sda.javastart.day8;

import java.util.Arrays;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        notGeneric();

        genericExample();

        compileTimeSafety();

        GenericFruitBox<Apple> appleBox = new GenericFruitBox<>(new Apple());
        appleBox.getFruit().introduceYourself();
        appleBox.getFruit().introduceApple();

        GenericFruitBox<Orange> orangeBox = new GenericFruitBox<>(new Orange());
        orangeBox.getFruit().introduceYourself();
//        orangeBox.getFruit().introduceApple(); nie mozna wywołać, bo tej metody nie ma w Orange

        List<Number> numbers = Arrays.asList(4, 10.9, 1, 333333);
        System.out.println(sumAnyNumbers(numbers));

        List<Long> longs = Arrays.asList(123L, 23L);

//        Long x = sumAnySpecifiedNumbers(longs);
//        System.out.println(x);

        List<Double> numbers1 = Arrays.asList(123.3d, 0.7d);
        Double aDouble = sumAnySpecifiedNumbers(numbers1);
        System.out.println(aDouble);
    }

    private static Double sumAnyNumbers(List<Number> numbers) {
        Double sum = 0d;
        for (Number number : numbers) {
            sum = sum + number.doubleValue();
        }
        return sum;
    }

    private static <T extends Number> double sumAnySpecifiedNumbers(List<T> numbers) {
        double sum = 0d;
        for (T number : numbers) {
            sum = sum + number.doubleValue();
        }
        return sum;
    }

    private static void compileTimeSafety() {
        Orange orange = new Orange();
        GenericFruitBox<Orange> genericFruitBox = new GenericFruitBox<>(orange);
//        Apple appleFromBox = genericFruitBox.getFruit(); //nie da się
//        appleFromBox.introduceApple();
    }

    private static void genericExample() {
        Apple apple = new Apple();
        GenericFruitBox<Apple> genericFruitBox = new GenericFruitBox<>(apple);
        Apple appleFromBox = genericFruitBox.getFruit(); //nie musimy castowac
        appleFromBox.introduceApple();
    }

    private static void notGeneric() {
        Fruit apple = new Apple();
        FruitBox fruitBox = new FruitBox(apple);
        Apple appleFromBox = (Apple) fruitBox.getFruit();//cast
        appleFromBox.introduceApple();
    }
}
