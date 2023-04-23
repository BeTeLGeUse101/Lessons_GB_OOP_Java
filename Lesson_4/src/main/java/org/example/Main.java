package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        List<Double> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();

        for (int i = 1; i < 30; i++) {
            list1.add((double) i);
            list2.add(i);
            list3.add(String.valueOf(i));
        }

        for (int i = 0; i < 30; i++) {
            String binaryString = Integer.toBinaryString(i);
            list4.add(binaryString);
        }

        System.out.println("Double: " + list1 + "\n" + "Integer: " + list2 + "\n" + "String: " + list3 +
                            "\n" + "StringBinary: " + list3 + "\n" + "StringTwoBinary: " + list4 + "\n");

        System.out.println("Введите цифру или число функции: \n" +
                            "1 - сумма \n" +
                            "2 - вычитание \n" +
                            "3 - умножение \n" +
                            "4 - деление \n" +
                            "5 - перевод из десятичной системы счисления в двоичную \n" +
                            "6 - перевода из двоичной системы счисления в десятичную \n");
        int inNum = scanner.nextInt();

        switch (inNum) {
            case 1:
                System.out.println("Сумма значений элементов массива Double: " + calc.sum(list1));
                System.out.println("Сумма значений элементов массива Integer: " + calc.sum(list2));
                break;
            case 2:
                System.out.println("Вычитание значений элементов массива Double: " + calc.subtraction(list1));
                System.out.println("Вычитание значений элементов массива Integer: " + calc.subtraction(list2));
                break;
            case 3:
                System.out.println("Произведение значений элементов массива Double: " + calc.multiplication(list1));
                System.out.println("Произведение значений элементов массива Integer: " + calc.multiplication(list2));
                break;
            case 4:
                System.out.println("Результат деление значений элементов массива Double: " + calc.division(list1));
                System.out.println("Результат деления значений элементов массива Integer: " + calc.division(list2));
                break;
            case 5:
                System.out.println("Перевод из десятичной системы счисления в двоичную Double: " + calc.decimalToBinary(list1.get(8)));
                System.out.println("Перевод из десятичной системы счисления в двоичную Integer: " + calc.decimalToBinary(list2.get((8))));
                System.out.println("Перевод из десятичной системы счисления в двоичную StringBinary: " + calc.decimalToBinary(list3.get((8))));
                break;
            case 6:
                System.out.println("Перевод из двоичной системы счисления в десятичную StringTwoBinary: " + calc.binaryToDecimal(list4.get(20)));
                break;
            default:
                System.out.println("Такой функции нет в списке!");
        }
        scanner.close();
    }
}