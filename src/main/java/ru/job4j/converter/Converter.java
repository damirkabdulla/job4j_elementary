package ru.job4j.converter;

public class Converter {

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        float in = 120;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("120 rubles are 2. Test result :" + passed);
        in = 210;
        expected = 3;
        out = Converter.rubleToEuro(in);
        passed = expected == out;
        System.out.println(" 210 rubles are 3. Test result :" + passed);
    }
}

