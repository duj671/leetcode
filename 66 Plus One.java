/**
* Given a non-negative number represented as an array of digits, plus one to the number.
* The digits are stored such that the most significant digit is at the head of the list.
**/

public class Solution {
    public int[] plusOne(int[] digits) {
        int position = digits.length;
        int oldnumber=0;
        int addnumber=0;
        while (position>0){
            int temp = digits[position-1]+addnumber;
            if(position==digits.length){
                temp=temp+1;
            }
            if(temp>=10){
                oldnumber=temp%10;
                addnumber = 1;
            }else {
                oldnumber = temp;
                addnumber=0;
            }
            digits[position-1]=oldnumber;
            position--;
        }
        if(addnumber>0){
            int[] result;
            result = new int[digits.length+1];
            // ¿ªÊ¼ÒÆÎ»
            int i= result.length;
            int j= digits.length;
            while(i>0 && j>0){
                result[i-1]=result[j-1];
                i--;
                j--;
            }
            result[0]=addnumber;
            return result;
        }else {
            return digits;
        }
    }
}