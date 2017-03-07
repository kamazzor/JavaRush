package com.javarush.lesson7.task0704.problem06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by Arsen on 05.03.2017.
 * Улицы и дома
 *
 1. Создать массив на 15 целых чисел.
 2. Ввести в него значения с клавиатуры.
 3. Пускай индекс элемента массива является номером дома, а значение — число жителей, проживающих в доме.
 Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
 4. Вывеси на экран сообщение: «В домах с нечетными номерами проживает больше жителей.» или «В домах с четными номерами проживает больше жителей.»

 Примечание:
 дом с порядковым номером 0 считать четным.
 */
public class Solution {
    private static int[] population = new int[15];

    //debug info
    //private static int[] population = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    public static void main(String[] args) throws Exception{
        population = initializeArrayInt(15);
        getWinSide(population);
    }

    private static void getWinSide(int[] population) {
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < population.length; i++) {
            if (i % 2 == 0){
                countEven+=population[i];
            }else{
                countOdd+=population[i];
            }
        }
        if (countEven < countOdd){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else{
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }

    private static int[] initializeArrayInt(int n) throws Exception{
        Reader reader = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(reader);
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i]=Integer.parseInt(r.readLine());
        }
        return mas;
    }
}
