/**
* Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
* n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
* Find two lines, which together with x-axis forms a container, such that the container contains the most water.
* Note: You may not slant the container. 
**/

public class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        // ��
        int x = len-1;
        // ��
        int y = height[len-1]>=height[0]?height[0]:height[len-1];
        int result =x*y;
        int left =0,right = len-1;
        while (left<right){
            // ������С����ߵ�ָ�����м��ƶ�
            if(height[left]<=height[right]){
                left++;
                x--;
            }else {
                // ����ұ�С���ұߵ�ָ�����м��ƶ�
                right--;
                x--;
            }
            y = height[left]<=height[right]?height[left]:height[right];
            if(x*y>result){
                result = x*y;
            }
        }
        return result;
    }
}