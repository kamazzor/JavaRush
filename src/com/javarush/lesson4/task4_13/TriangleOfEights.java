package com.javarush.lesson4.task4_13;

/**
 * Created by Arsen on 27.02.2017.
 * Используя цикл for вывести на экран прямоугольный
 * треугольник из восьмёрок со сторонами 10 и 10.

 Пример вывода на экран:
 8
 88
 888
 8888
 88888
 888888
 8888888
 88888888
 888888888
 8888888888
 */
public class TriangleOfEights {
    public static void main(String[] args) throws Exception{
        //Working realization
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
        //My realization. It doen't work in JavaRush
/*
        for (int i = 0; i < 10; i++) {
            str = new String(new char[i+1]).replace("\0", "8");
            System.out.println(str);
        }
*/
    }
}
