package aziz.prakash.chapter6.arrays6p1;

import org.junit.Test;

import java.util.Arrays;

public class EvenOddTest {

    @Test
    public void testEvenNumbersGoFirst() {
        printArrayBeforeAndAfter(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        printArrayBeforeAndAfter(new int[]{1, 3, 5, 7, 9});
        printArrayBeforeAndAfter(new int[]{2, 4, 6, 8, 10});
    }

    private void printArrayBeforeAndAfter(int[] intArray) {
        System.out.println("Before: " + Arrays.toString(intArray));
        EvenNumbersGoFirst.makeEmGoFirst(intArray);
        System.out.println("After: " + Arrays.toString(intArray));
    }

}
