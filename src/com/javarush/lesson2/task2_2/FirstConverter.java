package com.javarush.lesson2.task2_2;
/**
 * Created by Arsen on 15.02.2017.
 * Метод convertCelsiumToFahrenheit(int celsium)
 * принимает значение в градусах Цельсия.
 * Метод должен переводить температуру и
 * возвращать значение в градусах Фаренгейта.
 * Температура по Цельсию TC и температура по
 * Фаренгейту TF связаны следующим соотношением:
 * TC = (TF – 32) * 5/9
 * Пример:
 * В метод convertCelsiumToFahrenheit на вход подается значение 40.
 * Пример вывода:
 * 104.0
 */
public class FirstConverter {
    public static void main(String[] args){
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium){
        double fh = (double)celsium * 9/5 + 32;
        return fh;
    }
}
