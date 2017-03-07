package com.javarush.lesson5.task0507.problem07;

/**
 * Created by Arsen on 28.02.2017.
 * Изучи внимательно класс Solution.
 Исправь класс так, чтобы только один метод initialize
 инициализировал все переменные класса Solution.
 */
public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}
