package org.flomintv.aziz.prakash.chapter6;

public class EvenNumbersGoFirst {

    public static void makeEmGoFirst(int[] inputArray) {
        int nextEven = 0;
        int nextOdd = inputArray.length - 1;
        while (nextEven < nextOdd) {
            if (inputArray[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = inputArray[nextEven];
                inputArray[nextEven] = inputArray[nextOdd];
                inputArray[nextOdd--] = temp;
            }
        }
    }

}
