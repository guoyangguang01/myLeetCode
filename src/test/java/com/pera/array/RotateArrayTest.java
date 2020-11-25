package com.pera.array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangguang.guo
 * @date 2020/1/19
 * @refrence
 */
class RotateArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test1() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray.rotate(nums,k);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4},nums);
    }
    @Test
    void test2() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotateArray.rotate(nums,k);
        assertArrayEquals(new int[]{3,99,-1,-100},nums);
    }
}