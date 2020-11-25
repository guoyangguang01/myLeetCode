package com.pera.array;

/**
 * 相同的树
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的
 * @author yangguang.guo
 * @date 2020/11/25
 * @refrence
 */
public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null&&q == null){
            return true;
        }
        if (p==null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
