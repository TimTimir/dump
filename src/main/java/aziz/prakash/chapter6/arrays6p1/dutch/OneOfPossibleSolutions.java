package aziz.prakash.chapter6.arrays6p1.dutch;

public class OneOfPossibleSolutions {

    public static void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int lo = 0, mid = 0, hi = nums.length - 1;
        while (mid <= hi)
            switch (nums[mid]) {
                case 0:
                    swap(nums, lo++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, hi--);
                    break;
            }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
