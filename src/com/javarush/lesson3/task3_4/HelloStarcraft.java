package com.javarush.lesson3.task3_4;
/**
 * Created by Arsen on 19.02.2017.
 * Создать 10 зергов, 5 протоссов и 12 терран.
 * Дать им всем уникальные имена.
 */
public class HelloStarcraft {
    public static void main(String[] args){
        Zerg[] zerg = new Zerg[10];
        Protoss[] protoss = new Protoss[5];
        Terran[] terran = new Terran[12];
        for (int i = 0; i < 12; i++) {
            if (i < 10) {
                zerg[i] = new Zerg();
                zerg[i].name = "Zerg" + Integer.toString(i+1);
                //System.out.println(zerg[i].name);
            }
            if (i < 5) {
                protoss[i] = new Protoss();
                protoss[i].name = "Protoss" + Integer.toString(i+1);
                //System.out.println(protoss[i].name);
            }
            terran[i] = new Terran();
            terran[i].name = "Terran" + Integer.toString(i+1);
            //System.out.println(terran[i].name);
        }
    }

    public static class Zerg {
        public String name;
    }
    public static class Protoss {
        public String name;
    }
    public static class Terran {
        public String name;
    }
}
