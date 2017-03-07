package com.javarush.lesson6.task0611.bonus02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Arsen on 04.03.2017.
 *  Делал сам, не по искомому коду
 *
 Нужно добавить в программу ♦новую функциональность
 Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
 Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
 Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
 Изменить класс Cat так, чтобы он мог описать данную ситуацию.
 Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
 Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
 Пример ввода:
 дедушка Вася
 бабушка Мурка
 папа Котофей
 мама Василиса
 сын Мурчик
 дочь Пушинка
 Пример вывода:
 Cat name is дедушка Вася, no mother, no father
 Cat name is бабушка Мурка, no mother, no father
 Cat name is папа Котофей, no mother, father is дедушка Вася
 Cat name is мама Василиса, mother is бабушка Мурка, no father
 Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
 Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
 */

public class Solution {
    public static void main(String[] args) {
        Cat.addCat(new Cat("дедушка Вася"));
        Cat.addCat(new Cat("бабушка Мурка"));
        Cat.addCat(new Cat("папа Котофей", "", "дедушка Вася"));
        Cat.addCat(new Cat("мама Василиса", "бабушка Мурка", ""));
        Cat.addCat(new Cat("сын Мурчик", "мама Василиса", "папа Котофей"));
        Cat.addCat(new Cat("дочь Пушинка", "мама Василиса", "папа Котофей"));

        for (String key : Cat.cats.keySet()) {
            System.out.println(Cat.IntoString(key));
        }

/*
        Cat grandMother = new Cat("бабушка Мурка");
        Cat grandFather = new Cat("дедушка Вася");
        Cat mommy = new Cat("мама Василиса", grandMother, grandFather);
        Cat daddy = new Cat("папа Котофей", grandMother, grandFather);
        Cat kitty = new Cat("дочь Пушинка", mommy, daddy);
        Cat sonny = new Cat("сын Мурчик", mommy, daddy);
*/

//        1 task
//        System.out.println(kitty);
//        System.out.println(mommy);
    }

    public static class Cat {
        //private static ArrayList<Cat> iCats = new ArrayList<>();
        private static HashMap<String, Cat> cats = new HashMap<>();

        private String name;
        private Cat mother;
        private Cat father;

        public Cat(String keyName, String keyMother, String keyFather){
            this.name = keyName;
            if (cats.containsKey(keyMother)){
                this.mother=cats.get(keyMother);
            }else{
                this.mother = null;
            }
            if (cats.containsKey(keyFather)){
                this.father=cats.get(keyFather);
            }else{
                this.father = null;
            }

        }
        // not work into public Cat()
/*
        private SetParent(String key, Cat parentCat){
            if (cats.containsKey(key)){
                parentCat=cats.get(key);
            }else{
                parentCat = null;
            }
        }
*/

        public Cat(String name){
            this.name = name;
        }

        static void addCat(Cat cat){
            cats.put(cat.name, cat);
        }

        static String IntoString(String keyName){
            if (cats.containsKey(keyName)) {
                return "Cat name is " + keyName
                        + ((cats.get(keyName).mother == null) ? ", no mother" : ", mother is "
                        + cats.get(keyName).mother.name)
                        + ((cats.get(keyName).father == null) ? ", no father" : ", father is "
                        + cats.get(keyName).father.name);
            }else{
                return "This cat doesn't exist";
            }

        }

    }

}
