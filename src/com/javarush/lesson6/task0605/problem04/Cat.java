package com.javarush.lesson6.task0605.problem04;

/**
 * Created by Arsen on 01.03.2017.
 * В конструкторе класса Cat [public Cat()] увеличивать счётчик котов
 * (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
 */
public class Cat {
    public static int catCount = 0;

    public Cat(){
        catCount++;
    }

    protected void finalize(){
        catCount--;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
