package com.javarush.lesson4.task4_1;

/**
 * Created by Arsen on 25.02.2017.
 * Подумайте, что делает программа.
 Исправьте ошибку в программе чтобы переменная age
 объекта person изменила свое значение.

 Подсказка:
 тщательно просмотрите метод adjustAge
 */
public class MyAgeIsntSuitToMe {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = this.age + 20;
            System.out.println("The Age in adjustAge() is " + this.age);
        }
    }
}
