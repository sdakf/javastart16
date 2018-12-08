package pl.sda.javastart;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadż pierwszą liczbe");
        double firstValue = scanner.nextDouble();
        System.out.println("Wprowadż druga liczbe");
        double secondValue = scanner.nextDouble();
        System.out.println("a+b=" + (firstValue + secondValue));
        System.out.println("a-b=" + (firstValue - secondValue));
        System.out.println("a*b=" + (firstValue * secondValue));
        System.out.println("a/b=" + (firstValue / secondValue));
        System.out.println("wartosc bezwzgledna z odejmowania a i b = " + Math.abs(firstValue - secondValue));
        System.out.println("wartosc maksymalna wynosi " + Math.max(firstValue, secondValue));
        System.out.println("wartosc minimalna wynosi " + Math.min(firstValue, secondValue));
        System.out.println("a^b = " + Math.pow(firstValue, secondValue));



    }

}
