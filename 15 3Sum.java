/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length <3){
            return result;
        }
        // 数组排序
        Arrays.sort(nums);
        for (int i =0; i<nums.length-1; i++) {
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right =nums.length-1;

            while (left < right) {
                List<Integer> childResult = new ArrayList<>();
                int temp = nums[i] + nums[left] + nums[right];
                if (temp == 0){
                    childResult.add(nums[i]);
                    childResult.add(nums[left]);
                    childResult.add(nums[right]);
                    result.add(childResult);
                    // 去重
                    while (left< right && nums[left] == nums[left + 1]){
                        left ++;
                    }
                    left ++;
                    while (left< right && nums[right] == nums[right - 1]) {
                        right --;
                    }
                    right --;
                } else if (temp > 0){
                    right --;
                } else {
                    left ++;
                }
            }
        }
        return result;
    }
}