package com.javarush.lesson5.task0505;

/**
 * Created by Arsen on 28.02.2017.
 * Создать class Dog. У собаки должна быть кличка String name и возраст int age.
 Создайте геттеры и сеттеры для всех переменных класса Dog.
 */
public class Dog {
    String name;
    int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public static void main(String[] args) {

    }
}
