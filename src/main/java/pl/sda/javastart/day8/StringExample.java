package pl.sda.javastart.day8;

public class StringExample {
    private static String text = "12  , Adam, 1200";

    public static void main(String[] args) {
        String[] split = text.split(",");
        for (String s : split) {
            System.out.println(s.trim());
        }

        String[] strings = text.split("[^\\w]+");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
