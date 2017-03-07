package com.javarush.lesson7.task0706.problem06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Arsen on 06.03.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
            list.add(reader.readLine());
        int minS = list.get(0).length(), maxS = minS;
        for (String s : list){
            if (s.length() > maxS)
                maxS = s.length();
            if (s.length() < minS)
                minS = s.length();
        }
        for (String s : list)
            if (s.length() == maxS || s.length() == minS){
                System.out.println(s);
                break;
            }
    }
}