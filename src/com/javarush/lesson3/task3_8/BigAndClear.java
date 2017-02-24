package com.javarush.lesson3.task3_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by Arsen on 23.02.2017.
 * Ввести с клавиатуры три имени, вывести на экран надпись:
 * name1 + name2 + name3 = Чистая любовь, да-да!

 Пример:
 Вася + Ева + Анжелика = Чистая любовь, да-да!
 */
public class BigAndClear {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String names[] = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = reader.readLine();
        }
        System.out.println(names[0] + " + " + names[1] + " + " + names[2] + " = Чистая любовь, да-да!");
    }
}
