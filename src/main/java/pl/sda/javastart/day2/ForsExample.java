package pl.sda.javastart.day2;

public class ForsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Adam");
        }
        printFewNaturalNumbers(4);
    }

    public static void printFewNaturalNumbers(int endNumber) {
        for (int i = 0; i < endNumber; i++) {
            System.out.println(i);
        }
    }
}
