package com.javarush.lesson3.task0308;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by Arsen on 23.02.2017.
 * Предсказание на будущее
 Ввести с клавиатуры отдельно Имя, число1, число2.
 Вывести надпись:
 «Имя» получает «число1» через «число2» лет.

 Пример:
 Коля получает 3000 через 5 лет.
 */
public class PredictionOnTheFuture {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] data = (reader.readLine()).split(" ");
        String name = reader.readLine();
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
        //System.out.println(Arrays.toString(data));
        /*
        String wordsSpecial = "Как|использовать|метод|split";
        String[] numbers = wordsSpecial.split(" ");
        System.out.println("метод split со специальным разделителем: "
                + Arrays.toString(numbers));
        */
    }
}
