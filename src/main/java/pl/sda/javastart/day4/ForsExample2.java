package pl.sda.javastart.day4;

public class ForsExample2 {
    public static void main(String[] args) {
        printNumbersInTree(10);
    }

    public static void printNumbersInTree(int height) {//todo *tilt me in another direction*
        for (int i = 0; i < height; i++) {//ilosc wierszy
            for (int j = 0; j <= i; j++) {//ilosc kolumn
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
