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
public class SolutionNotWorkOnJR {
    static ArrayList<String> strs = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        //инициализируем массив данными с клавиатуры
        initializeArrayList(strs);
        //массив индексов с номерами строк с maxLength;
        ArrayList<Integer> index = longestStrings(strs);

    }

    private static void outputLongestStr(ArrayList<Integer> index, int ptr) {
        for (int i = ptr; i < index.size(); i++) {
            System.out.println(strs.get(index.get(i)));
        }

    }

    private static ArrayList<Integer> longestStrings(ArrayList<String> strings) {
        //массив для добавления индексов для текущего maxLength в цикле
        ArrayList<Integer> indexes = new ArrayList<>(strings.size());
        //debug info
        //System.out.println("indexes size = " + indexes.size());
        //System.out.println("strings size = " + strings.size());
        //указатель на начало нужных нам индексов
        int pointer = 0;
        //int counter = 0;
        indexes.add(0);
        int maxLength = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > maxLength){
                maxLength = strings.get(i).length();
                pointer = indexes.size();
                indexes.add(i);
            }else if (strings.get(i).length() == maxLength){
                indexes.add(i);
            }
        }
        outputLongestStr(indexes, pointer);

/*
        if (pointer == 0) return indexes;
        //удаляем индексы не самых длинных строк
        for (int i = indexes.get(pointer-1); i >= 0 ; i--) {
            //debug info
            //System.out.println("Now we removing indexes[" + i + "]");
            indexes.remove(i);
        }
*/

        return indexes;
    }

    private static void initializeArrayList(ArrayList<String> strings) throws Exception{
        Reader reader = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(reader);
        int n = 5;

/*
        //debug info
        strings.add("a");
        strings.add("hello");
        strings.add("yo");
        strings.add("hola");
        strings.add("yep");
        strings.add("konec");
        strings.add("top");
*/


        for (int i = 0; i < n; i++) {
            strings.add(r.readLine());
        }
    }
}
