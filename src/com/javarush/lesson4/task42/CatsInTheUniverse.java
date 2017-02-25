package com.javarush.lesson4.task42;

/**
 * Created by Arsen on 25.02.2017.
 * Написать код, чтобы правильно считалось количество созданных
 * котов (count) и на экран выдавалось правильное их количество.
 */
public class CatsInTheUniverse {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++;
        //напишите тут ваш код

        Cat cat2 = new Cat();
        Cat.count++;
        //напишите тут ваш код

        System.out.println("Cats count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
