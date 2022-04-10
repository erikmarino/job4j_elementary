package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;

        double one = Math.pow(rsl1, 2); // возведение в степерь 2
        double two = Math.pow(rsl2, 2);

        double rls3 = one + two;
        double rls4 = Math.sqrt(rls3); // квадратный корень
        return rls4;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);

        double result2 = Point.distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result2);

        double result3 = Point.distance(2, 8, 7, 6);
        System.out.println("result (2, 8) to (7, 6) " + result3);
        }
}
