package com.javarush.lesson7.task0712.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 07.03.2017.
 * Делал сам, не по искомому коду.
 *
 * Нужно исправить программу, чтобы компилировалась и работала
 Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран. Пример:
 Cat name is Barsik, age is 6, weight is 5, tail = 22
 Cat name is Murka, age is 8, weight is 7, tail = 20
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Cat> cats = new ArrayList<>();
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));

        while (true){
            String name = r.readLine();
            if (name.isEmpty()) break;
            int age = Integer.parseInt(r.readLine());
            int weight = Integer.parseInt(r.readLine());
            int tail = Integer.parseInt(r.readLine());

            Cat cat = new Cat(name, age, weight, tail);
            cats.add(cat);
        }
        //debuf info
        //Cat cat1 = new Cat("Barsik", 6, 5, 22);
        //Cat cat2 = new Cat("Murka", 8, 7, 20);
        printList(cats);
    }

    private static void printList(ArrayList<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }

    }

    private static class Cat{
        private String name;
        private int age, weight, tail;

        public Cat(String name, int age, int weight, int tail){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tail = tail;
        }

        @Override
        public String toString() {
            StringBuffer temp = new StringBuffer("");
            temp.append("Cat name is ").append(this.name);
            temp.append(", age is ").append(this.age);
            temp.append(", weight is ").append(this.weight);
            temp.append(", tail is ").append(this.tail);
            return temp.toString();
        }
    }
}
