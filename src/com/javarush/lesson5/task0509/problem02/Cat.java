package com.javarush.lesson5.task0509.problem02;

/**
 * Created by Arsen on 28.02.2017.
 * Создать класс Cat (кот) с пятью конструкторами:
 — Имя,
 — Имя, вес, возраст
 — Имя, возраст (вес стандартный)
 — вес, цвет, (имя, адрес и возраст – неизвестные. Кот — бездомный)
 — вес, цвет, адрес (чужой домашний кот)

 Задача конструктора – сделать объект валидным.
 Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить.
 То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 */
public class Cat {
    private String name = null, color = null, address = null;
    private int weight, age;
    private static final int DEFAULT_WEIGHT = 10;
    private static final int DEFAULT_AGE = 5;
    private static final String  DEFAULT_COLOR = "black";

    public Cat(String name){
        this.name = name;
        this.weight = DEFAULT_WEIGHT;
        this.age = DEFAULT_AGE;
        this.color = DEFAULT_COLOR;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = DEFAULT_COLOR;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = DEFAULT_AGE;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.age = DEFAULT_AGE;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}