package pl.sda.javastart.day8;

public class GenericFruitBox<T extends Fruit> { //zwyczajowo T, E lub R, ograniczamy typ
    private T fruit;

    public GenericFruitBox(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}
