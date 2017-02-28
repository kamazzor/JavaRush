package com.javarush.lesson2.task0202;
/**
 * Created by Arsen on 15.02.2017.
 *
 * Кусочек калькулятора
 * В методе main объяви две целочисленные переменные a и b типа int.
 * Присвой им любые значения.
 * Выведи на экран их сумму и произведение.
 * Каждое значение выводить с новой строки.
 *
 * Пример вывода на экран для а = 5, b = 7:
 * 12
 * 35
 */
public class BitOfCalc {
    public static void main(String[] args){
        int a = 5, b = 7;
        System.out.print((a + b) + "\r\n" + (a * b));
    }
}
