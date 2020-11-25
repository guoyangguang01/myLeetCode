package com.pera.array;

/**
 * @author yangguang.guo
 * @date 2020/1/19
 * @refrence
 */
public class MoveZero {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(j<nums.length&&i<nums.length){
            if(nums[i] ==0){
                i++;

            }
            else{
                int temp =nums[i];
                nums[i] = nums[j];
                nums[j] =temp;
                i++;
                j++;

            }
        }
    }
}
