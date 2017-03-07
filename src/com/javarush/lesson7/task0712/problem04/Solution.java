package com.javarush.lesson7.task0712.problem04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 07.03.2017.
 * Это конец
 *
 Создать список строк.
 Ввести строки с клавиатуры и добавить их в список.
 Вводить с клавиатуры строки, пока пользователь не введет строку «end«. Саму строку «end» не учитывать.
 Вывести строки на экран, каждую с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String str = r.readLine();
            if (str.equals("end")) break;
            list.add(str);
        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}
