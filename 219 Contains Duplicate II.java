/**
* Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k. 
**/

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                if(i-hashMap.get(nums[i])<=k){
                    result = true;
                }else {
                    hashMap.put(nums[i],i);
                    continue;
                }
            }else {
                hashMap.put(nums[i],i);
            }
        }
        return result;
    }
}