package org.example;


import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws Exception {
        Logging logging = new Logging("log");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое рациональное число: ");
        int frac1 = scanner.nextInt();
        System.out.print("Введите второе рациональное число: ");
        int frac2 = scanner.nextInt();
        System.out.print("Введите первое комплексное число: ");
        double compl1 = scanner.nextInt();
        System.out.print("Введите второе комплексное число: ");
        double compl2 = scanner.nextInt();

        Fraction fraction = new Fraction(frac1,frac2);
        var a = fraction.sum(fraction);
        System.out.println(a);
        logging.log(a.toString());

        Complex complex = new Complex(compl1, compl2);
        var b = complex.sum(complex);
        System.out.println(b);
        logging.log(b.toString());

        a = fraction.subtract(fraction);
        System.out.println(a);
        logging.log(a.toString());

        b = complex.subtract(complex);
        System.out.println(b);
        logging.log(b.toString());

        a = fraction.multiply(fraction);
        System.out.println(a);
        logging.log(a.toString());

        b = complex.multiply(complex);
        System.out.println(b);
        logging.log(b.toString());

        a = fraction.divide(fraction);
        System.out.println(a);
        logging.log(a.toString());

        b = complex.divide(complex);
        System.out.println(b);
        logging.log(b.toString());

        scanner.close();
    }
}
