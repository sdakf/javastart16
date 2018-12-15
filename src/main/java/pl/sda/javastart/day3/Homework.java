package pl.sda.javastart.day3;

import java.time.LocalDateTime;

public class Homework {
    public static void main(String[] args) {
        task4();
        testResultVoid(43);
        System.out.println("Dostałeś "+testResult(51));
        System.out.println("Dostałeś "+testResult(78));
        System.out.println("Dostałeś "+testResult(49));

    }

    public static void task4() {
        LocalDateTime actualTime = LocalDateTime.now();
        int day = actualTime.getDayOfMonth();
        int month = actualTime.getMonthValue();
        int year = actualTime.getYear();
        int hour = actualTime.getHour();
        int minute = actualTime.getMinute();
        String hourValue;
        if (hour < 10) {
            hourValue = "0" + hour;
        } else {
            hourValue = Integer.toString(hour);
//            hourValue = "" + hour;
        }
        String minuteValue = minute < 10 ? "0" + minute : "" + minute;
        System.out.println(hourValue + ":" + minuteValue + " " + day + "." + month + "." + year);
        System.out.println("Od polnocy minelo " + (hour * 60 + minute));
    }

    public static String testResult(int pcts) {
        if (pcts < 50) {
            return "1";
        } else {
            return calculateResultWhenExamIsPassed(pcts);
        }
    }

    public static void testResultVoid(int pts) {
        if (pts < 50) {
            System.out.println("1");
        } else {
            System.out.println(calculateResultWhenExamIsPassed(pts));
        }
    }

    public static String calculateResultWhenExamIsPassed(int pcts) {
        if (pcts < 60) {
            return "2";
        } else if (pcts < 70) {
            return "3";
        } else if (pcts < 80) {
            return "4";
        } else if (pcts < 90) {
            return "5";
        }
        return "6";

    }

}
