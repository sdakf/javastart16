package pl.sda.javastart.day8;

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
