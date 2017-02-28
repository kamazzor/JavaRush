package com.javarush.lesson5.task0512.problem03;

/**
 * Created by Arsen on 28.02.2017.
 * Создай классы Dog, Cat, Mouse.
 Добавь по три поля в каждый класс, на твой выбор.
 Создай объекты для героев мультика Том и Джерри.
 Так много, как только вспомнишь.

 Пример:
 Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5),
 где 12 — высота в см,
 5 — длина хвоста в см.
 */
public class Solution {
    public static class Dog {
        private String name;
        private int tail;
        private int height;

        public Dog(String name, int height, int tail){
            this.name = name;
            this.tail = tail;
            this.height = height;
        }
    }

    public static class Cat {
        private String name;
        private int tail;
        private int height;

        public Cat(String name, int height, int tail){
            this.name = name;
            this.tail = tail;
            this.height = height;
        }
    }


    public static class Mouse {
        private String name;
        private int tail;
        private int height;

        //Excess code
/*
        private static final String DEFAULT_NAME = "Unknown Mouse";
        private static final int DEFAULT_HEIGHT = 1;
        private static final boolean DEFAULT_TAIL = false;
*/
        public Mouse(String name, int height, int tail){
            this.name = name;
            this.tail = tail;
            this.height = height;
        }
    }


    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog johnDog = new Dog("John", 25, 8);
        Cat tomCat = new Cat("Tom", 40, 14);
    }
}
