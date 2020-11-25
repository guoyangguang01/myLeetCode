package com.pera.question;

import com.pera.question.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author yangguang.guo
 * @date 2020/11/26
 * @refrence
 */
class LeetCode100Test {

    @Test
    void isSameTree() {
        TreeNode p = TreeNode.initTree(new Integer[]{10, 5, 15});
        TreeNode q = TreeNode.initTree(new Integer[]{10,5,null,null,15});
        LeetCode100 leetCode100 = new LeetCode100();
        assertFalse(leetCode100.isSameTree(p, q));
    }
}