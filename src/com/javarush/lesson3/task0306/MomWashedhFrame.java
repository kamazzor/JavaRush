package com.javarush.lesson3.task0306;
/**
 * Created by Arsen on 19.02.2017.
 * Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».

 Подсказка: их 6 штук.
 Каждую комбинацию вывести с новой строки. Слова не разделять.

 Пример:
 МылаРамуМама
 РамуМамаМыла
 ...
 */
public class MomWashedhFrame {
    public static void main(String[] args) {
        String[] s = {"Мама", "Мыла", "Раму"};
        System.out.println(s[0]+s[1]+s[2]);
        System.out.println(s[0]+s[2]+s[1]);
        System.out.println(s[1]+s[0]+s[2]);
        System.out.println(s[1]+s[2]+s[0]);
        System.out.println(s[2]+s[0]+s[1]);
        System.out.println(s[2]+s[1]+s[0]);
    }
}
