package com.javarush.lesson4.task4_2;

/**
 * Created by Arsen on 25.02.2017.
 * Реализовать метод setName, чтобы с его помощью можно
 * было устанавливать значение переменной private String fullName
 * равное значению локальной переменной String fullName.
 */
public class SetNameRealization2 {
    private String fullName;

    public  void setName (String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}
