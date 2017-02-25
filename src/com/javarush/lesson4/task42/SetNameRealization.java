package com.javarush.lesson4.task42;

/**
 * Created by Arsen on 25.02.2017.
 * Реализовать метод setName, чтобы с его помощью можно
 * было устанавливать значение переменной private String name
 * равное переданному параметру String name.
 */
public class SetNameRealization {
    private String name;

    public void setName(String name){
        this.name = name;
        //System.out.println(this.name);
    }

    public static void main(String[] args) {
        //setName("Olya");
        //System.out.println(name);
    }

}
