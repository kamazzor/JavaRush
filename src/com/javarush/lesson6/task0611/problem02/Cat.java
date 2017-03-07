package com.javarush.lesson6.task0611.problem02;

import java.util.ArrayList;

/**
 * Created by Arsen on 04.03.2017.
 1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
 2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот.
    Создать 10 объектов Cat.
 3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
 */
public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }
    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
        }
        printCats();
    }
}
