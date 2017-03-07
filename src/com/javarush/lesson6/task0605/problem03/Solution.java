package com.javarush.lesson6.task0605.problem03;

/**
 * Created by Arsen on 01.03.2017.
 * Создать в цикле по 50 000 объектов Cat и Dog.
 (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
 */
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
