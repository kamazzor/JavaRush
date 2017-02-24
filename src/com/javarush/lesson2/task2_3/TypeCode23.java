package com.javarush.lesson2.task2_3;
/**
 * Created by Arsen on 16.02.2017.
 * Набрать код:
 * Cat murzik = new Cat();
 * Cat vaska = null;
 * vaska = murzik;
 * murzik = null;
 */
public class TypeCode23 {
    public static void main(String[] args){
        //набрать код (я вставил в прогу сразу)
        Cat murzik = new Cat();
        Cat vaska = null;
        vaska = murzik;
        murzik = null;
    }
    public static class Cat{

    }
}
