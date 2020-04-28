package com.suse.codingtest.leetcode;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int[] results = productExceptSelf(nums);

        for (int i: results){
            System.out.println(i);
        }

    }

    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] results = new int[length];

        for(int i = 0; i<length; i++){
            int result = 1;
            for(int j=0; j< length; j++){
                if(i!=j){
                  result *= nums[j];
                }
            }
            results[i] = result;
        }
        return results;
    }
}
