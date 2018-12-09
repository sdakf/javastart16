package pl.sda.javastart.day2;

public class IfsExample {
    public static void main(String[] args) {
        /*System.out.println(isEven(12));
        System.out.println(isEvenTernary(5));
        System.out.println(dividableByThreeAndFive(15));
        System.out.println(addTax(100, 23));
        System.out.println(introduction("Maciej", 88, true));
        System.out.println(twoParamsEven(333, 34));
        System.out.println(threeParamsSum(23, 34, 57));
        System.out.println(threeParamsSum(343, 3124, 527));*/
//        System.out.println(isAnyBiggerThanZero(0,0));
        System.out.println(answerCall(true, true, false));
        System.out.println(answerCall(true, true, true));
        System.out.println(checkWhichOneIsBigger(2,1,3));
        System.out.println(checkWhichOneIsBigger(2,1,2));
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEvenTernary(int a) {
        boolean result = a % 2 == 0 ? true : false;
        return result;
    }

    public static boolean dividableByThreeAndFive(int a) {
        boolean result = a % 3 == 0 && a % 5 == 0;
        return result;
    }

    public static double addTax(double price, int tax) {//fixme BigDecimal
        double afterTax = price * tax / 100 + price;
        return afterTax;
    }

    public static String introduction(String name, int age, boolean genderParam) {
        String gender;
        if (genderParam) {
            gender = "mężczyzną";
        } else {
            gender = "kobietą";
        }
        return "Cześć! Jestem " + name + " mam " + age + " lat i jestem " + gender;
    }

    public static boolean twoParamsEven(int firstValue, int secondValue) {
        if (firstValue % 2 == 0 && secondValue % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean threeParamsSum(int firstValue, int secondValue, int thirdValue) {
        if (firstValue + secondValue == thirdValue) {
            return true;
        } else if (secondValue + thirdValue == firstValue) {
            return true;
        } else if (thirdValue + firstValue == secondValue) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAnyBiggerThanZero(int a, int b) {
        return a > 0 || b > 0;
    }

    public static boolean answerCall(boolean isMama, boolean isMorning, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning & !isMama) {
            return false;
        }
        return true;

    }

    public static int checkWhichOneIsBigger(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }

        return c;

    }

}


