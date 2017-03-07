package com.javarush.lesson7.task0712.problem03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 07.03.2017.
 * Минимаксы в массивах
 *
 Создать массив на 20 чисел.
 Заполнить его числами с клавиатуры.
 Найти максимальное и минимальное числа в массиве.
 Вывести на экран максимальное и минимальное числа через пробел.
 */
public class SolutionNotWorkOnJR {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> nums = new ArrayList<>();
        initializeListInt(nums, 20);
        ArrayList<Integer> minMax = getMinAndMaxInArrayList(nums);
        int maximum = minMax.get(1);
        int minimum = minMax.get(0);
        System.out.println(maximum + " " + minimum);
    }

    public static ArrayList<Integer> getMinAndMaxInArrayList(ArrayList<Integer> nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        int min = nums.get(0), max= min;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max){
                max = nums.get(i);
            }
            if (nums.get(i) < min){
                min = nums.get(i);
            }
        }
        temp.add(min);
        temp.add(max);
        return temp;
    }

    public static void initializeListInt(ArrayList<Integer> ls, int n) throws Exception{
        InputStream inputStream = System.in;
        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        for (int i = 0; i < n; i++) {
            ls.add(Integer.parseInt(r.readLine()));
        }

/*      //alternative input method
        while (n > 0){
            String str = r.readLine();
            if (str.isEmpty()) break;
            ls.add(Integer.parseInt(s));
            n--;
        }
*/
    }
}
