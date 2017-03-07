package com.javarush.lesson6.task0605.problem02;

/**
 * Created by Arsen on 01.03.2017.
 * В каждом классе Cat и Dog написать метод finalize, который
 * выводит на экран текст о том, что такой-то объект уничтожен.
 */
public class Cat {
    protected void finalize() throws Throwable{
        System.out.println("Cat was destroyed");
    }
    public static void main(String[] args) throws Throwable {
        //Cat cat = new Cat("Cat");
        //Dog dog = new Dog("Dog");
    }
}

class Dog {
    protected void finalize() throws Throwable{
        System.out.println("Dog was destroyed");
    }
}
