package com.javarush.lesson0.task0003;
//подключаем класс Scanner для ввода данных
import java.io.IOException;
import java.util.Scanner;

/*
Выводим квадрат числа
*/

public class SquaredNumber {
    public static void main(String[] args) throws IOException{
        int a;
        Scanner sc = new Scanner(System.in);
        //проверяем, можно ли считать с потока целое число
        if (sc.hasNextInt()){
            a = sc.nextInt(); // считываем целое число из стандартного потока
            System.out.println(a*a); // выводим квадрат считанного числа
        }
    }
}