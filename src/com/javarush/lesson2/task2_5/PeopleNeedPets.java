package com.javarush.lesson2.task2_5;
/**
 * Created by Arsen on 17.02.2017.
 * Создай объект типа Cat (кот), объект типа Dog (собака),
 * объект типа Fish (рыбка) и объект типа Woman.
 * Присвой каждому животному владельца (owner).
 */
public class PeopleNeedPets {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = dog.owner = fish.owner = woman;
        //System.out.println(cat.owner);
    }

    public static class Cat {
        public static Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
