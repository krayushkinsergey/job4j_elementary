package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double arg = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(arg);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
        rsl = TrgArea.area(3, 3, 3);
        System.out.println("area (3, 3, 3) = " + rsl);
    }
}
