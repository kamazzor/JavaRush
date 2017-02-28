package com.javarush.lesson4.task0413;

/**
 * Created by Arsen on 27.02.2017.
 * Используя цикл for вывести на экран:
 — горизонтальную линию из 10 восьмёрок
 — вертикальную линию из 10 восьмёрок.
 */
public class DrawLines {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10; i++) {
            System.out.print(8);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(8);
        }
    }
}
