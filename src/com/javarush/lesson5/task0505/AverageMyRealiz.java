package com.javarush.lesson5.task0505;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Arsen on 28.02.2017.
 * Вводить с клавиатуры числа и вычислить среднее арифметическое.
 Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
 -1 не должно учитываться.

 Пример для чисел 1 2 2 4 5 -1:
 2.8

 Пример для чисел 4 3 2 1 -1:
 2.5
 */
public class AverageMyRealiz {
    public static class Number {
        private static int counter = 0;
        private int value;

        public int getCounter(){
            return counter;
        }

        public void setCounter(int counter){
            Number.counter = counter;
        }

        public Number(){
            counter++;
        }
    }
    public static void main(String[] args) throws Exception{
        ArrayList<Number> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double sum = 0;
        while (true){
            int temp = sc.nextInt();
            if (temp != -1) {
                numbers.add(new Number());
                sum += numbers.get(Number.counter-1).value = temp;
            }else {break;}
        }
        System.out.println(sum / Number.counter);
    }
}
