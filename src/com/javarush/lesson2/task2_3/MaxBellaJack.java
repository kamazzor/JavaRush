package com.javarush.lesson2.task2_3;
/**
 * Created by Arsen on 16.02.2017.
 * Создать 3 объекта типа Dog (собака).
 * Сохрани каждый экземпляр в отдельную переменную.
 * Присвоить им имена «Max», «Bella», «Jack».
 */
public class MaxBellaJack {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";

        //напишите тут ваш код
    }

    public static class Dog {
        public String name;
    }
}
