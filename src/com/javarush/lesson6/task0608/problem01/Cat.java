package com.javarush.lesson6.task0608.problem01;

/**
 * Created by Arsen on 04.03.2017.
 * Создать статическую переменную int catCount в классе Cat.
 * Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
 */
public class Cat {
    private static int catCount;

    public Cat(){
        catCount++;
    }

    public static void main(String[] args) {

    }
}
