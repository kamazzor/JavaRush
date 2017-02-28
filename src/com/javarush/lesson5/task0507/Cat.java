package com.javarush.lesson5.task0507;

/**
 * Created by Arsen on 28.02.2017.
 * Создать класс Cat (кот) с пятью инициализаторами:
 — Имя,
 — Имя, вес, возраст
 — Имя, возраст (вес стандартный)
 — вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
 — вес, цвет, адрес (чужой домашний кот)

 Задача инициализатора – сделать объект валидным.
 Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить.
 То же касательно возраста.
 А вот имени может и не быть (null).
 То же касается адреса: null.
 */
public class Cat {
    private String name = null, color = null, address = null;
    private int weight, age;
    private static final int DEFAULT_WEIGHT = 10;
    private static final int DEFAULT_AGE = 5;
    private static final String  DEFAULT_COLOR = "black";

    public void initialize(String name){
        this.name = name;
        this.weight = DEFAULT_WEIGHT;
        this.age = DEFAULT_AGE;
        this.color = DEFAULT_COLOR;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = DEFAULT_COLOR;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = DEFAULT_AGE;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.age = DEFAULT_AGE;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
