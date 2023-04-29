package org.example;

public class Complex {
    private double real;    // действительная часть
    private double imaginary;   // мнимая часть

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex sum(Complex other) {
        double realPart = real + other.real;
        double imaginaryPart = imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex other) {
        double realPart = real - other.real;
        double imaginaryPart = imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex other) {
        double realPart = real * other.real - imaginary * other.imaginary;
        double imaginaryPart = real * other.imaginary + imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (real * other.real + imaginary * other.imaginary) / denominator;
        double imaginaryPart = (imaginary * other.real - real * other.imaginary) / denominator;
        return new Complex(realPart, imaginaryPart);
    }

    public String toString() {
        if (imaginary == 0) {
            return real + "";
        }
        if (real == 0) {
            return imaginary + "i";
        }
        if (imaginary < 0) {
            return real + " - " + (-imaginary) + "i";
        }
        return real + " + " + imaginary + "i";
    }
}