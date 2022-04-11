package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) { //объявление метода hello (указываем параметры, и тип параметра)
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) { // объявление метода мэйн, стринг тип данных, аргс имя)
        String name = "Job4j"; // объявление переменной нэйм типа СТРИНГ
        int age = 6; // объявление переменной эге типа инт
        ArgMethod.hello(name, age); // вызов метода hello
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}
