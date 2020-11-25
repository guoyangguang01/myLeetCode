package com.pera.array;

/**
 * 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的
 * @author yangguang.guo
 * @date 2020/11/26
 * @refrence
 */
public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    private boolean isMirror(TreeNode left ,TreeNode right){
        if(left==null &&right == null){
            return true;
        }
        if(left == null || right==null || left.val != right.val ){
            return false;
        }
        return isMirror(left.left,right.right)&&isMirror(left.right,right.left);
    }
}
