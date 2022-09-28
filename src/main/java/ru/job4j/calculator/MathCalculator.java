package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double devideAndDifference(double first, double second) {
        return devide(first, second)
                + difference(first, second);
    }

    public static double sumAndMultiplyAndDevideAndDifference(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + devide(first, second)
                + difference(first, second);
    }


    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + devideAndDifference(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndDevideAndDifference(10, 20));
    }
}
