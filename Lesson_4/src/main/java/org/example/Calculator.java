package org.example;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> list) {
        double sum = 0.0;

        for (Number num: list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public Double subtraction(List<? extends Number> list) {
        double sub = 0.0;

        for (Number num: list) {
            sub -= num.doubleValue();
        }
        return sub;
    }

    public Double multiplication(List<? extends Number> list) {
        double sub = 1.0;

        for (Number num: list) {
            sub *= num.doubleValue();
        }
        return sub;
    }

    public Double division(List<? extends Number> list) {
        double sub = 1.0;

        for (Number num: list) {
            sub = num.doubleValue() / sub;
        }
        return sub;
    }

    // перевод из десятичной системы счисления в двоичную
    public String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }

    public String decimalToBinary(String decimalLocal) {
        StringBuilder binary = new StringBuilder();
        int decimal = Integer.parseInt(decimalLocal);

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }

    public String decimalToBinary(double decimal) {
        int integerPart = (int) decimal;
        double fractionalPart = decimal - integerPart;

        StringBuilder binary = new StringBuilder();
        binary.append(Integer.toBinaryString(integerPart)).append('.');

        for (int i = 0; i < 10 && fractionalPart > 0; i++) {
            fractionalPart *= 2;
            if (fractionalPart >= 1) {
                binary.append('1');
                fractionalPart -= 1;
            } else {
                binary.append('0');
            }
        }
        return binary.toString();
    }

    // перевода из двоичной системы счисления в десятичную
    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(binary.charAt(i));
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}
