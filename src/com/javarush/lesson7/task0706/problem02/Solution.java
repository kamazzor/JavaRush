package com.javarush.lesson7.task0706.problem02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by Arsen on 05.03.2017.
 * Самая длинная строка
 *
 1. Создай список строк.
 2. Считай с клавиатуры 5 строк и добавь в список.
 3. Используя цикл, найди самую длинную строку в списке.
 4. Выведи найденную строку на экран.
 5. Если таких строк несколько, выведи каждую с новой строки.
 */
public class Solution {
    //static ArrayList<String> strs = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        ArrayList<String> strs = new ArrayList<>();
        //инициализируем массив данными с клавиатуры
        Reader reader = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(reader);
        for (int i = 0; i < 5; i++) {
            strs.add(r.readLine());
        }

        int maxLength = strs.get(0).length();
        for (int i = 1; i < strs.size(); i++) {
            if (strs.get(i).length() > maxLength) {
                maxLength = strs.get(i).length();
            }
        }

        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i).length() == maxLength){
                System.out.println(strs.get(i));
            }
        }

    }
}
