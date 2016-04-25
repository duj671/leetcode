/**
*  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
* For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0]. 
**/

public class Solution {
    public void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int position =0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                result[position]=nums[i];
                position++;
            }
        }
        for(int j=0;j<nums.length;j++){
            nums[j] = result[j];
        }
    }
}