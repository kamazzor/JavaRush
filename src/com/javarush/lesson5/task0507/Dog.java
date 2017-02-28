package com.javarush.lesson5.task0507;

/**
 * Created by Arsen on 28.02.2017.
 * Создать класс Dog (собака) с тремя инициализаторами:
 — Имя
 — Имя, рост
 — Имя, рост, цвет
 */
public class Dog {
    private String name = null, color = null;
    private int height;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
