package pl.sda.javastart.day7;

public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0));
        } catch (ArithmeticException e) {
            System.out.println("Wystąpił wyjątek: " + e.getMessage());
        }
        System.out.println(divide(2, 2));

        try {
            divideWithException(2, 0);
//        } catch (ArithmeticException e) {
//            System.out.println("Wystąpił wyjątek: " + e.getMessage());
        } finally {
            System.out.println("Blok Finally");
        }

        try {
            divideWithCheckedException(2, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Koniec programu");
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int divideWithException(int a, int b) {
        if (b == 0) {
            throw new MyRuntimeException("Nie dziel cholero przez zero");
        }
        return a / b;
    }

    public static int divideWithCheckedException(int a, int b) throws MyCheckedException {
        if (b == 0) {
            throw new MyCheckedException("Nie dziel cholero przez zero");
        }
        return a / b;
    }
}
