package aziz.prakash.chapter6.arrays6p1.dutch;

import org.junit.Test;

import java.util.Arrays;

public class DutchFlagProblemTest {

    @Test
    public void test() {
        int[] arr = {1, 1, 0, 1, 0, 0, 2, 2, 0, 2, 1};
        OneOfPossibleSolutions.sortColors(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2};
        OneOfPossibleSolutions.sortColors(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[] {2, 2, 2, 2, 1, 1, 1, 0, 0, 0};
        OneOfPossibleSolutions.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

}
