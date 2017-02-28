package com.javarush.lesson5.task0505;

/**
 * Created by Arsen on 28.02.2017.
 * Создать class Person. У человека должно быть
 * имя String name,
 * возраст int age,
 * пол char sex.
 Создайте геттеры и сеттеры для всех переменных класса Person.
 */
public class GetterAndSetterForPerson {
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
