package org.example;

import io.qameta.allure.Epic;


public class Calculator {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));

    }

    public int add(int a, int b) {
        return  a + b;
    }
}
