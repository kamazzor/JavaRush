package com.javarush.lesson5.task0507;

/**
 * Created by Arsen on 28.02.2017.
 * Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
 — Имя
 — Имя, возраст
 — Имя, возраст, пол

 Примечание:
 Имя(String), возраст(int), пол(char).
 */
public class Friend {
    private String name = null;
    private int age;
    private char sex;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
