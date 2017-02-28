package com.javarush.lesson4.task0406;

import java.util.Scanner;

/**
 * Created by Arsen on 27.02.2017.
 * Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
 Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
 Если имена и длины имен разные — ничего не выводить.
 */
public class NastyaOrNastya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        }else if (name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }
    }
}
