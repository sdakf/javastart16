package pl.sda.javastart.day3;

public class WhileExample {
    public static void main(String[] args) {
        countDownFor(10);
        countDownFor(-1);
        countDownWhile(10);
        countDownWhile(-1);
        countDownDoWhile(-1);
        countDownDoWhile(7);
        fibonacci(6);
    }

    private static void fibonacci(int numberOfElements) {
        int first = 0;
        int second = 1;
        int counter = 1;
        System.out.println(0);
        System.out.println(1);
        while (counter < numberOfElements) {
            int sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
            counter++;
        }

    }

    public static void countDownFor(int start) {
        System.out.println("Parametr = " + start);
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void countDownWhile(int start) {
        System.out.println("Parametr = " + start);
        while (start >= 0) {
            System.out.println(start);
            start--;
        }
    }

    public static void countDownDoWhile(int start) {
        System.out.println("Parametr = " + start);
        if (start <= 0) {
            System.out.println("Nieprawidłowy parametr " + start);
            return;
        }
        do {
            System.out.println(start);
            start--;
        } while (start >= 0);
    }
}
