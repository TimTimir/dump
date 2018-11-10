package org.flomintv.aziz.prakash.chapter6.arrays6p1.dutch;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class DutchFlagProblemTest {

    @Test
    public void test() {
        DutchSolution oneOfPossibleSolutions = new OneOfPossibleSolutions();
        DutchSolution superBruteForce = new SuperBruteForce();

        int[] arr = {1, 1, 0, 1, 0, 0, 2, 2, 0, 2, 1};
        int[] arrToCheck = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2};
        sortPrintCheck(arr, arrToCheck, oneOfPossibleSolutions);
        sortPrintCheck(arr, arrToCheck, superBruteForce);

        arr = new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2};
        arrToCheck = new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2};
        sortPrintCheck(arr, arrToCheck, oneOfPossibleSolutions);
        sortPrintCheck(arr, arrToCheck, superBruteForce);

        arr = new int[] {2, 2, 2, 2, 1, 1, 1, 0, 0, 0};
        arrToCheck = new int[] {0, 0, 0, 1, 1, 1, 2, 2, 2, 2};
        sortPrintCheck(arr, arrToCheck, oneOfPossibleSolutions);
        sortPrintCheck(arr, arrToCheck, superBruteForce);
    }

    private void sortPrintCheck(int[] arr, int[] arrToCheck, DutchSolution oneOfPossibleSolutions) {
        oneOfPossibleSolutions.sortColors(arr);
        System.out.println(Arrays.toString(arr));
        assertTrue(Arrays.equals(arr, arrToCheck));
    }

}
