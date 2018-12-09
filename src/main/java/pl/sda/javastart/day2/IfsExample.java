package pl.sda.javastart.day2;

public class IfsExample {
    public static void main(String[] args) {
        System.out.println(isEven(12));
        System.out.println(isEvenTernary(5));
        System.out.println(dividableByThreeAndFive(15));
        System.out.println(addTax(100, 23));
        System.out.println(introduction("Maciej", 88, true));
        System.out.println(twoParamsEven(333,34));
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
    //public static boolean threeParamsSum
}
