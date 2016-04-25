/**
* Given an array of size n, find the majority element. The majority element is the element that appears more than ? n/2 ? times.
* You may assume that the array is non-empty and the majority element always exist in the array.
**/

public class Solution {
    public int majorityElement(int[] nums) {
       if(nums.length <1){
            return 0;
        }
        int times = 0;
        int currentVaule = nums[0];
        for(int i=0;i<nums.length;i++){
            if(times == 0){
                currentVaule = nums[i];
                times = 1;
            }else {
                if(currentVaule == nums[i]){
                    times++;
                }else {
                    times--;
                }
            }
        }
        return currentVaule; 
    }
}