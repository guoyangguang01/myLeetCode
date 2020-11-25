package com.pera.question;

import java.util.Arrays;

/**
 * @author yangguang.guo
 * @date 2020/1/19
 * @refrence
 */
class MoveZeroTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void moveZeroes() {
        MoveZero moveZero = new MoveZero();
        int[] nums = {0,1,0,3,12};
        moveZero.moveZeroes(nums);

            System.out.println(Arrays.toString(nums));


    }
}