package com.suse.codingtest.leetcode;

/**
 * We have a collection of stones, each stone has a positive integer weight.
 *
 * Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 *
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
 * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 */
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        int result =  lastStoneWeight(stones);
        System.out.println(result);

    }

    public static int lastStoneWeight(int[] stones) {

        while(stones.length>1){
            stones= sortArray(stones);
        }
        return stones[0];
    }

    private static int[] sortArray(int[] stones){
        int temp;
        int[] tempStones = new int[stones.length-1];
        for(int i=0; i< stones.length; i++){
            for(int j= i+1; j< stones.length; j++){
                if(stones[i]< stones[j]){
                    temp = stones[i];
                    stones[i] = stones[j];
                    stones[j] = temp;
                }
            }
        }
        tempStones[0] = stones[0] - stones[1];
        for(int i =2; i< stones.length; i++){
            tempStones[i-1] = stones[i];
        }
        return tempStones;
    }


}
