package com.javarush.lesson3.task3_6;
/**
 * Created by Arsen on 22.02.2017.
 * Про экранирование символов в Java читай в дополнительном материале к лекции.

 Вывести на экран следующий текст — две строки:
 It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
 It's Java string: "C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 */
public class SymbolsScreening {
    public static void main(String[] args) {
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.print("It's Java string: \"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}
