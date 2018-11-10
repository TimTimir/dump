package org.flomintv.aziz.prakash.chapter6.arrays6p1.dutch;

public class SuperBruteForce implements DutchSolution {

    public void sortColors(int[] nums) {
        int smaller = 0;
        int pivot = 0;
        // First pass: group elements smaller than pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                int temp = nums[i];
                nums[i] = nums[smaller];
                nums[smaller] = temp;
                smaller++;
            }
        }

        // Second pass: group elements larger than pivot
        int larger = nums.length - 1;
        for (int i = nums.length - 1; i >= 0 && nums[i] >= pivot; i--) {
            if (nums[i] > pivot) {
                int temp = nums[i];
                nums[i] = nums[larger];
                nums[larger] = temp;
                larger--;
            }
        }
    }

}
