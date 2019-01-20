package pl.sda.javastart.day8;

public class Apple extends Fruit {

    @Override
    public void introduceYourself() {
        introduceApple();
    }

    public void introduceApple(){
        System.out.println("Jestem jabłkiem");
    }

}
