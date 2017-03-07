package com.javarush.lesson6.task0605.problem01;

/**
 * Created by Arsen on 01.03.2017.
 * В классе Cat создать метод protected void finalize() throws Throwable.
 */
public class Cat {
    protected void finalize() throws Throwable{
        System.out.println("Cat example destroyed");
    }

    public static void main(String[] args) {

    }
}
