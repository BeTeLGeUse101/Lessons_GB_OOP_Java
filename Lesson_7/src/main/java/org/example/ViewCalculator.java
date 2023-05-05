package org.example;

import java.util.Scanner;

public class ViewCalculator {

    Logging logging;
    Calculator calculator;

    private final Scanner scanner = new Scanner(System.in);

    public ViewCalculator() {
        logging = new Logging();
        calculator = new Calculator();
    }
    public void run() {
        int numFunc;
        String logs;

        while (true) {
            try {
                System.out.print("Введите первое число: ");
                calculator.setNumber1(scanner.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: введенное значение не является числом типа double. Попробуйте еще раз.");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Введите второе число: ");
                calculator.setNumber2(scanner.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: введенное значение не является числом типа double. Попробуйте еще раз.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Выберите функцию:\n1: Вычитание\n2: Сумма\n3: Произведение\n4: Деление\n");
            System.out.print("Ввод: ");
            if (scanner.hasNextInt()) {
                numFunc = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введенное значение не является числом типа Integer. Попробуйте еще раз.");
                scanner.next();
            }
        }

        switch (numFunc) {
            case 1 -> {
                logs = calculator.getNumber1() + " - " + calculator.getNumber2() + " = " + calculator.subtraction();
                logging.logStart(logs);
            }
            case 2 -> {
                logs = calculator.getNumber1() + " + " + calculator.getNumber2() + " = " + calculator.sum();
                logging.logStart(logs);
            }
            case 3 -> {
                logs = calculator.getNumber1() + " * " + calculator.getNumber2() + " = " + calculator.multiplication();
                logging.logStart(logs);
            }
            case 4 -> {
                logs = calculator.getNumber1() + " / " + calculator.getNumber2() + " = " + calculator.division();
                logging.logStart(logs);
            }
            default -> System.out.println("Такой функции не существует.");
        }
    }
}
