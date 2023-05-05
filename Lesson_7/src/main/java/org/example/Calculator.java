package org.example;

import lombok.Data;

@Data

public class Calculator implements Calculable{

    private Double number1;
    private Double number2;

    @Override
    public Double subtraction() {
        return getNumber1() - getNumber2();
    }

    @Override
    public Double sum() {
        return getNumber1() + getNumber2();
    }

    @Override
    public Double multiplication() {
        return getNumber1() * getNumber2();
    }

    @Override
    public Double division() {
        if (getNumber2() == 0) {
            System.out.println("Делитель не может быть равен 0");
        }
        return getNumber1() / getNumber2();
    }
}
