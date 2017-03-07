package com.javarush.lesson6.task0611.problem01;

import java.util.ArrayList;

/**
 * Created by Arsen on 04.03.2017.
 * В классе Cat создай статическую переменную public int catCount.
 Создай конструктор [public Cat()]. Пусть при каждом создании кота
 (нового объекта Cat) статическая переменная catCount увеличивается на 1.
 Создать 10 объектов Cat и вывести значение переменной catCount на экран.
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
        }
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount = 0;

        public Cat(){
            catCount++;
        }
    }
}
