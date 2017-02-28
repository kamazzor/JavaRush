package com.javarush.lesson5.task0505;

/**
 * Created by Arsen on 28.02.2017.
 * Создать три кота используя класс Cat.
 Провести три боя попарно между котами.
 Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
 Результат каждого боя вывести на экран c новой строки.
 */
public class CatsFight {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Vaska", 10, 10, 20);
        Cat cat2 = new Cat("Petka", 15, 15, 15);
        Cat cat3 = new Cat("Barsik", 20, 20, 10);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}