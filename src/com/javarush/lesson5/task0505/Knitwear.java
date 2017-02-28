package com.javarush.lesson5.task0505;

/**
 * Created by Arsen on 28.02.2017.
 * Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
 * Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию
 * класса Cat, а точнее — основываясь на нём, как на шаблоне. Их — котов —
 * должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
 */
public class Knitwear {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Vaska", 10, 10, 20);
        Cat cat2 = new Cat("Petka", 15, 15, 15);
        Cat cat3 = new Cat("Barsik", 20, 20, 10);
        //System.out.println(Cat.counter);  //debug info

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;
        private  static int counter = 0;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
            //counter++;    //debug info
        }
    }
}
