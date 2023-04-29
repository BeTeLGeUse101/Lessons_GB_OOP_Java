package org.example;

public class Fraction {
    private int numerator;   // числитель
    private int denominator; // знаменатель

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // метод для вычисления наибольшего общего делителя (GCD)
    private int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCD(b, a % b);
        }
    }

    // метод для сокращения дроби до наименьших значений
    public void reduce() {
        int gcd = getGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fraction sum(Fraction other) {
        int num = numerator * other.denominator + other.numerator * denominator;
        int den = denominator * other.denominator;
        Fraction result = new Fraction(num, den);
        result.reduce();
        return result;
    }

    public Fraction subtract(Fraction other) {
        int num = numerator * other.denominator - other.numerator * denominator;
        int den = denominator * other.denominator;
        Fraction result = new Fraction(num, den);
        result.reduce();
        return result;
    }

    public Fraction multiply(Fraction other) {
        int num = numerator * other.numerator;
        int den = denominator * other.denominator;
        Fraction result = new Fraction(num, den);
        result.reduce();
        return result;
    }

    public Fraction divide(Fraction other) {
        int num = numerator * other.denominator;
        int den = denominator * other.numerator;
        Fraction result = new Fraction(num, den);
        result.reduce();
        return result;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
