package com.javarush.lesson4.task44;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Arsen on 25.02.2017.
 * Ввести с клавиатуры три целых числа. Определить, имеется ли среди
 * них хотя бы одна пара равных между собой чисел.
 Если такая пара существует, вывести на экран числа через пробел.
 Если все три числа равны между собой, то вывести все три.

 Пример для чисел 1 2 2:
 2 2

 Пример для чисел 2 2 2:
 2 2 2
 */
public class IsTherePairOfNumbers {
    public static void arrayCheck(ArrayList<Integer> data){
        HashSet<Integer> used = new HashSet<>();
        ArrayList<Integer> count = new ArrayList<>();

        for(int i = 0; i < data.size(); i++){
            if(used.contains(data.get(i))){
                continue;
            } else {
                used.add(data.get(i));
            }
            //ArrayList<Integer> positions = new ArrayList<>();
            //positions.add(i);
            for(int j = i + 1; j < data.size(); j++){

                if(data.get(i) == data.get(j)){
                    count.add(j);
                }
            }
            /*System.out.print(array[i] + " встречается в позициях " );
            for(Integer p : positions){
                System.out.print(p + ", ");
            }
            System.out.println();*/
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dannie[] = new int[4];
        ArrayList<ArrayList<Integer>> multimas = new ArrayList<>();
        ArrayList<Integer>  data = new ArrayList<Integer>();
        //ArrayList<Integer>  count = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            data.add(sc.nextInt());
        }
        arrayCheck(data);
        /*multimas.add(data);
        multimas.add(count);
        for (int i = 0; i < data.size(); i++) {
            for (int j = i+1; j < data.size(); j++) {

            }
        }
        System.out.println(multimas);*/

    }
}
