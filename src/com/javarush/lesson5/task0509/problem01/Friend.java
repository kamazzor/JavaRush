package com.javarush.lesson5.task0509.problem01;

/**
 * Created by Arsen on 28.02.2017.
 * Создать класс Friend (друг) с тремя конструкторами:
 — Имя
 — Имя, возраст
 — Имя, возраст, пол
 */
public class Friend {
    private String name = null;
    private int age;
    private char sex;

    public Friend(String name){
        this.name = name;
    }
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public static void main(String[] args) {

    }
}
