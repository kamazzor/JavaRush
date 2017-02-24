package com.javarush.lesson2.task2_2;
/**
 * Created by Arsen on 15.02.2017.
 * В классе Person объяви следующие переменные: name типа String,
 * age типа int, weight типа int, money типа int.
 * В методе main создай объект Person, занеси его ссылку в переменную person.
 */
public class WherePersonCameFrom {
    public static void main(String[] args){
        Person person = new Person();
    }
    public static class Person{
        String name;
        int age, weight, money;
    }
}
