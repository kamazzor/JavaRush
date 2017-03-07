package com.javarush.lesson7.task0706.problem06;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 06.03.2017.
 * Самые-самые
 *
 1. Создай список строк.
 2. Добавь в него 10 строчек с клавиатуры.
 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
 Если таких строк несколько, то должны быть учтены самые первые из них.
 4. Выведи на экран строку из п.3.
 */
public class SolutionNotWorkInJR {
    public static void main(String[] args) throws Exception{
        ArrayList<String> strs = new ArrayList<String>();
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        int maxS = strs.get(0).length();
        int minS = strs.get(0).length();
        for (int i = 0; i < 10; i++) {
            strs.add(r.readLine());
        }
        for (int i = 1; i < strs.size(); i++) {
            if (strs.get(i).length() > maxS) {
                maxS = strs.get(i).length();
            }
            if (strs.get(i).length() < minS) {
                minS = strs.get(i).length();
            }
        }
        for (String s : strs)
        if (s.length() == maxS || s.length() == minS) {
            System.out.println(s);
            break;
        }
/*
        if (minLengthPointer < maxLengthPointer){
            System.out.println(strs.get(minLengthPointer));
        }else{
            System.out.println(strs.get(maxLengthPointer));
        }
*/
    }
}
