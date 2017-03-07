package com.javarush.lesson7.task0709.problem04;

import java.util.ArrayList;

/**
 * Created by Arsen on 06.03.2017.
 * Р или Л
 *
 1. Создай список слов, заполни его самостоятельно.
 2. Метод fix должен:
 2.1. удалять из списка строк все слова, содержащие букву «р»
 2.2. удваивать все слова содержащие букву «л».
 2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
 2.4. с другими словами ничего не делать.

 Пример:
 роза
 лира
 лоза

 Выходные данные:
 лира
 лоза
 лоза
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);
        printList(list);
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {
            if ((list.get(i).contains("р")) && (list.get(i).contains("л"))){
                i++;
            }else if (list.get(i).contains("р")){
                list.remove(i);
            }else if (list.get(i).contains("л")){
                list.add(i+1, list.get(i));
                i+=2;
            }else{
                i++;
            }
        }
        return list;
    }

    public static void printList(ArrayList<String> ls) {
        for (String str : ls) {
            System.out.println(str);
        }
    }
}
