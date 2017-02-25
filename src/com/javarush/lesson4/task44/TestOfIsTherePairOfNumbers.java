package com.javarush.lesson4.task44;

/**
 * Created by Arsen on 25.02.2017.
 */
public class TestOfIsTherePairOfNumbers {

    public static void main(String[] args) throws Exception {

        // Входные данные
        int[] arr = {2, 2, 4, 2, 5, 6, 2, 7, 8, 9, 2, 4, 1, 5, 2};
        Result result = method(arr);
        System.out.println("Число: " + result.getNum());
        System.out.println("Кол-во повторов: " + result.getCount());
    }

    static Result method(int[] arr) {

        if (arr == null) {
            return null;
        }

        int maxNum = 0, num = 0, maxCount = 0, count = 0;

        arr: for (int i = 0; i < arr.length; i++) {

            num = arr[i];
            count = 1;

            for (int backnum = i - 1; backnum >= 0; backnum--) {
                if (backnum == num) {
                    continue arr;
                }
            }

            for (int fornum = i+1; fornum < arr.length; fornum++) {
                if (arr[fornum] == num) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxNum = num;
                maxCount = count;
            }
        }

        final int resultNum = maxNum;
        final int resultCount = maxCount;

        return new Result() {

            @Override
            public int getNum() {
                return resultNum;
            }

            @Override
            public int getCount() {
                return resultCount;
            }
        };
    }

    interface Result {
        int getNum();
        int getCount();
    }
}
