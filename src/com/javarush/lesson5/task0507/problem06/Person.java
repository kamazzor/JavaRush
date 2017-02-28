package com.javarush.lesson5.task0507.problem06;

/**
 * Created by Arsen on 28.02.2017.
 * Создать class Person. У человека должно быть
 * имя String name,
 * возраст int age.
 Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
 В методе main создай объект Person, занеси его ссылку в переменную person.
 Вызови метод initialize с любыми значениями.
 */
public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Miko", 25);
    }

    static class Person {
        private String name = null;
        private int age;

        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
