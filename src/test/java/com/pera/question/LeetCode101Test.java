package com.pera.question;

import com.pera.question.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author yangguang.guo
 * @date 2020/11/26
 * @refrence
 */
class LeetCode101Test {

    @Test
    void isSymmetric() {
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        LeetCode101 leetCode101 = new LeetCode101();
        assertTrue(leetCode101.isSymmetric(root));
    }
}