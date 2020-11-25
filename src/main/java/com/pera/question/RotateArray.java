package com.pera.question;

/**
 * @author yangguang.guo
 * @date 2020/1/19
 * @refrence
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (k >= len) {
            k = k % len;
        }
        revert(nums, 0, len - k - 1);
        revert(nums, len - k, len - 1);
        revert(nums, 0, len - 1);
    }

    private void revert(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
