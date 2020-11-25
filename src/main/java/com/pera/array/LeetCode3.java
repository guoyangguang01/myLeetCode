package com.pera.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yangguang.guo
 * @date 2020/1/21
 * @refrence
 */
public class LeetCode3 {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1){
            return -1;
        }
        Set set = new HashSet<Integer>();
        for(int i=0 ;i<connections.length;i++){
            set.add(connections[i][0]);
            set.add(connections[i][1]);
        }
        return n-set.size();
    }
}
