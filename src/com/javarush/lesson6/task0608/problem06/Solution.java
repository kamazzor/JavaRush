package com.javarush.lesson6.task0608.problem06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Arsen on 04.03.2017.
 * Программа должна считывать введенные пользователем вес в килограммах
 * и рост в метрах и выводить на экран сообщение о индексе массы тела.
 Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
 «Недовес: меньше чем 18.5» — если индекс массы тела меньше 18.5,
 «Нормальный: между 18.5 и 24.9» — если индекс массы тела между 18.5 и 24.9,
 «Избыточный вес: между 25 и 29.9» — если индекс массы тела между 25 и 29.9,
 «Ожирение: 30 или больше» — если индекс массы тела 30 или больше.

 Подсказка:
 Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

 Пример вывода для 68.4 и 1.77:
 Нормальный: между 18.5 и 24.9
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        private static double massInd = 0;
        public static void massIndex(double weight, double height) {
            massInd = weight / Math.pow(height, 2);
            if (massInd < 18.5){
                System.out.println("Недовес: меньше чем 18.5");
            }else if ((massInd>=18.5)&&(massInd<=24.9)){
                System.out.println("Нормальный: между 18.5 и 24.9");
            }else if ((massInd>=25)&&(massInd<=29.9)){
                System.out.println("Избыточный вес: между 25 и 29.9");
            }else{
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
